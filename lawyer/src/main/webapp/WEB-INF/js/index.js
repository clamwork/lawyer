$(function () {
    loadRegData();
    $("#add_draggable").on({'hidden.bs.modal': function(){
    	cleanAdd();
     }});
    
    $('#add_save').bind('click', function () {
        addReg();
    });
    
    $('#edit_save').click(function(){
    	editReg();
    });
    
    $("#search_btn").bind('click',function(){
    	loadRegData();
    });
    
    $("#excel-estate").click(function(){
    	var id = $(this).attr("data-id");
    	excportEstateData(id);
    	//tableExport('list-estate-table', '反馈信息', 'csv');
    });
    
    $("#loginOut").click(function(){
    	loginOut();
    });

    $('#add_lan').bind('click',function (){$('#add_reg_from').append( '<div class="input-group"><span class="input-group-addon">姓名</span> <input type="text" name="name"' + 'class="form-control"> <span class="input-group-addon">身份证号</span> <input type="text" name="idNumber"' + 'class="form-control"></div><br>');});
});

var table  =  $("#regTable").bootstrapTable({
    pageSize: 10,
    height: 600,
    cache: false,
    toolbar: '#toolBar',
    pageList: [10, 20],
    striped: true,
    pagination: true,
    pageNumber: 1,
    cardView: false,
    showColumns: false,
    showRefresh: false,
    search: true,
//    clickToSelect: false,
//    searchable : false,
//    smartDisplay: false,
    onRefresh: function(data){
    	console.log("refresh");
    },
    columns: [{
        field: 'id',
        title: 'ID'
    }, {
        field: 'name',
        title: '姓名',
        width: 40,
        align: 'center',
        sortable: true
    }, {
        field: 'idNumber',
        title: '身份证号',
        sortable: true,
        formatter: function (data) {
            return data || '';
        }
    }, {
        field: 'auditCode',
        title: '审批编号',
        sortable: true,
        formatter: function (data) {
            return data || '';
        }
    }, {
        field: 'opertor',
        title: '承办人',
        sortable: true,
        formatter: function (data) {
            return data || '';
        }
    }, {
        field: 'auditDate',
        title: '申请时间',
        sortable: true,
        formatter: function (data) {
            return data==null?'':new Date(data).Format("yyyy-MM-dd hh:mm:ss");
        }
    }, {
        field: 'searchDate',
        title: '查询时间',
        sortable: true,
        formatter: function (data) {
            return data==null?'':new Date(data).Format("yyyy-MM-dd hh:mm:ss");
        }
    }, {
        field: 'state',
        title: '查询状态',
        sortable: true,
        formatter: function (data) {
            switch (data) {
            case 0:
                return '未查询';
                break;
            case 1:
                return '正在查询';
                break;
            case 2:
                return '已查询';
                break;
            case 9:
            	return '异常';
            	break;
            default:
                return '';
            }
        }
    }, {
        field: 'id',
        title: '操作',
        formatter: function (data) {
            return '<a class="label label-sm label-success edit_reg" style="margin-right:3px" data-toggle="modal" data-id="'
			+ data + '" href="#edit_draggable"><i class="fa fa-edit"></i> 修改</a><a class="label label-sm label-danger list_estate" data-toggle="modal" data-id="'
			+ data + '" href="#list_estate_draggable" ><i class="fa fa-times"></i>查看反馈</a>';
        }
    }],
    data: []
});

function cleanAdd() {
    $('#add_reg_from') .html( '<div class="input-group"><span class="input-group-addon">姓名</span> <input type="text" name="name"' + 'class="form-control"> <span class="input-group-addon">身份证号</span> <input type="text" name="idNumber"' + 'class="form-control"></div><br>');
}


function loadRegData() {
    var param = $("#search_reg_from").serialize();
    var result = [];
    $.ajax({
            type: 'POST',
            url: 'register/list',
            data: param,
            success: function (data) {
            	loadData(data.data);
            },
            error: function (e) {
                console.log(e);
            }
        });
}

function loadData(json){
		table.bootstrapTable('load', json);
    	table.on("click",".edit_reg",function(){
            var editId = $(this).attr("data-id");
            $.ajax({
                type: 'GET',
                url: "register/view/"+editId,
                data: null,
                success: function (data) {
                	var d = data.data;
                	$('#edit_draggable input[name=id]').val(d.id);
                	$('#edit_draggable input[name=name]').val(d.name);
                	$('#edit_draggable input[name=idNumber]').val(d.idNumber);
                	if(d.state !=0){
                		$('#edit_draggable input[name=name]').attr("readonly","readonly");
                    	$('#edit_draggable input[name=idNumber]').attr("readonly","readonly");
                	}else{
                		$('#edit_draggable input[name=name]').removeAttr("readonly");
                    	$('#edit_draggable input[name=idNumber]').removeAttr("readonly");
                	}
                },
                error: function (e) {
                    console.log(e);
                }
            });
        });
    	table.on("click",".list_estate",function(){
            var regId = $(this).attr("data-id");
            loadEstateData(regId);
        });
}
function excportEstateData(regId){
	window.open('estate/doExport/'+regId);
}

function loadEstateData(regId) {
	 $.ajax({
         type: 'POST',
         url: "estate/list",
         data: {'regId':regId},
         success: function (data) {
        	 var list = data.data;
        	 var html ='';
        	 $.each(list,function(i,v){
        		 html +='<tr>';
        		 html +='<td>'+v.equityCode+'</td>';
        		 html +='<td>'+(v.equityType==0?'所有权':'商品房预售备案')+'</td>';
        		 html +='<td>&nbsp;'+v.idNumner+'</td>';
        		 html +='<td>'+v.name+'</td>';
        		 html +='<td>'+v.houseLocation+'</td>';
        		 html +='<td>&nbsp;'+v.acreage+'</td>';
        		 html +='<td>&nbsp;'+v.houseNature+'</td>';
        		 html +='<td>&nbsp;'+(v.equityDate==null?'':new Date(v.equityDate).Format("yyyy-MM-dd hh:mm:ss"))+'</td>';
        		 html +='<td>&nbsp;'+v.amount+'</td>';
        		 html +='<td>'+(v.isHistory==0?'否':'是')+'</td>';
        		 html +='<td>'+(v.isSeal==0?'否':'是')+'</td>';
        		 html +='<td>'+(v.isMortgage==0?'否':'是')+'</td>';
        		 html +='<td>'+(v.remark==null?'':v.remark)+'</td>';
        		 html +='</tr>';
        	 });
        	 if(list.length==0){
        		 html="<tr><td colspan=13 style='color:#f00;' >无查询数据</td></tr>"
        	 }
        	 $("#list-estate-table tbody").html(html);
        	 $("#excel-estate").attr("data-id",regId);
         },
         error: function (e) {
             console.log(e);
         }
     });
}



function addReg() {
    var add_reg_from = $('#add_reg_from');
    var param = add_reg_from.serialize();
    if (param != null) {
        $.ajax({
            type: 'POST',
            url: 'register/batchSave',
            data: param,
            success: function (data) {
            	 $('#add_draggable').modal('hide');
                 loadRegData();
//            	window.location.reload();
            },
            error: function (e) {
                 console.log(e);
            }
        });
    }
}

function editReg() {
	var from = $('#edit_reg_from');
    var param = from.serialize();
    if (param != null) {
        $.ajax({
            type: 'POST',
            url: 'register/save',
            data: param,
            success: function (data) {
            	 $('#edit_draggable').modal('hide');
                 loadRegData();
//            	window.location.reload();
            },
            error: function (e) {
                 console.log(e);
            }
        });
    }
}

function loginOut() {
	$.ajax({
        type: 'POST',
        url: 'user/logout',
        data: null,
        success: function (data) {
        	window.location.reload();
        },
        error: function (e) {
             console.log(e);
        }
    });
}

Date.prototype.Format = function (fmt) { //author: meizz 
    var o = {
        "M+": this.getMonth() + 1, //月份 
        "d+": this.getDate(), //日 
        "h+": this.getHours(), //小时 
        "m+": this.getMinutes(), //分 
        "s+": this.getSeconds(), //秒 
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
        "S": this.getMilliseconds() //毫秒 
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}