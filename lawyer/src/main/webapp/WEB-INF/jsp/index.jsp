<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>查询</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<meta name="author" content="chengw">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="search">
<meta http-equiv="description" content="This is my login page">

<link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/jquery-ui-1.10.4.min.css">
<link rel="icon" href="<%=basePath%>/assets/img/favicon.ico">
<!-- Bootstrap core CSS -->
<link href="<%=basePath%>assets/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="<%=basePath%>assets/table/bootstrap-table.css">
<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="<%=basePath%>assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="<%=basePath%>assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<style type="text/css">
#list-estate-table {
	display: inline-block;
	overflow: auto;
}
#list-estate-table thead tr th{
	vertical-align: middle;
	text-align: center;
	min-width:82px;
}

#list-estate-table tbody tr td{
	vertical-align: middle;
	text-align: left;
	word-break:break-all;
	min-width:82px;
	max-width:150px;
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index">查询</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav ">
<!-- 								<li class="active"><a href="#">Home</a></li> -->
<!-- 								<li><a href="#about">About</a></li> -->
<!-- 								<li><a href="#contact">Contact</a></li> -->
			</ul>
			<form class="navbar-form navbar-right">
            	<button type="button" id="loginOut" class="btn btn-success">登出</button>
          	</form>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>

	<div class="container">
		<div class="starter-template">
			<div class="panel panel-default">
				<div class="panel-body" style="display:none;">
					<form id="search_reg_from" class="bs-example bs-example-form"
						role="form">
						<div class="input-group">
							<div class="col-md-4">
								<input type="text" name="s_name" class="form-control"
									placeholder="姓名">
							</div>
							<div class="col-md-4">
								<input type="text" name="s_idNumber" class="form-control"
									placeholder="身份证号">
							</div>
							<div class="col-md-4">
								<a class="btn .btn-lg label-success" id="search_btn"><i
									class="fa fa-file-o"></i>查询</a>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="btn-toolbar" id='toolBar'>
				<div class="btn-group">
					<a class="btn .btn-lg label-success" data-toggle="modal"
						href="#add_draggable"><i class="fa fa-file-o"></i>新增</a>
				</div>
				<div class="btn-group">
					<a class="btn .btn-lg label-info"
						href="#"><i class="fa fa-file-o"></i>刷新</a>
				</div>
			</div>
			<table class="table" id="regTable"></table>
		</div>
	</div>

	<footer class="footer">
	<div class="container">
		<p class="text-muted">Copyright for Jandar</p>
	</div>
	</footer>


	<!-- 模态框（Modal） -->
	<div class="modal fade" id="add_draggable" tabindex="-1" role="dialog"
		aria-labelledby="add_reg" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="add_reg">新增</h4>
				</div>
				<div class="modal-body">
					<form id="add_reg_from" class="bs-example bs-example-form"
						role="form">
						<div class="input-group">
							<span class="input-group-addon">姓名</span> <input type="text"
								name="name" class="form-control" placeholder=""> <span
								class="input-group-addon">身份证号</span> <input type="text"
								name="idNumber" class="form-control" placeholder="">
						</div>
						<br>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" id="add_lan" class="btn btn-green">新增</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭
					</button>
					<button type="button" id="add_save" class="btn btn-primary">提交</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
	</div>


	<!-- 模态框（Modal） -->
	<div class="modal fade" id="edit_draggable" tabindex="-2" role="dialog"
		aria-labelledby="edit_reg" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="edit_reg">登记表</h4>
				</div>
				<div class="modal-body">
					<form id="edit_reg_from" class="bs-example bs-example-form"
						role="form">
						<div class="input-group">
							<span class="input-group-addon">ID</span> <input type="text" readonly
								name="id" class="form-control" placeholder="">
						</div>
						<br>
						<div class="input-group">
							<span class="input-group-addon">姓名</span> <input type="text"
								name="name" class="form-control" placeholder="">
						</div>
						<br>
						<div class="input-group">
							<span class="input-group-addon">身份证号</span> <input type="text"
								name="idNumber" class="form-control" placeholder="">
						</div>
						<br>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" id="edit_save" class="btn btn-primary">提交</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="list_estate_draggable" tabindex="-3"
		role="dialog" aria-labelledby="list_estate" aria-hidden="true">
		<div class="modal-dialog" style="width:80%;">
			<div class="modal-content" >
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="list_estate">反馈结果</h4>
				</div>
				<div class="modal-body">
					<table id="list-estate-table" class="table table-bordered table-hover">
						<thead>
							<tr>
								<th>权限编号</th>
								<th>权利类型</th>
								<th width=100px>权利人身份证号</th>
								<th>权利人姓名</th>
								<th width="200px">房屋坐落</th>
								<th>建筑面积</th>
								<th>房产性质</th>
								<th>时间</th>
								<th>金额</th>
								<th>是否历史</th>
								<th>是否查封</th>
								<th>是否抵押</th>
								<th>备注</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
				</div>
				<div class="modal-footer">
					<button type="button" id="excel-estate" data-id="0" class="btn btn-success">导出Excel</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
<!-- 					<button type="button" class="btn btn-primary">提交</button> -->
				</div>
			</div>
			<!-- /.modal-content -->
		</div>


		<script type="text/javascript" src="<%=basePath%>js/jquery-1.10.4.min.js"></script>
		<script type="text/javascript" src="<%=basePath%>js/jquery-ui-1.10.4.min.js"></script>
		
		<script src="<%=basePath%>assets/js/bootstrap.min.js"></script>
		<script src="<%=basePath%>assets/table/bootstrap-table.js"></script>
		<script src="<%=basePath%>assets/table/locale/bootstrap-table-zh-CN.js"></script>
		<script type="text/javascript" src="<%=basePath%>js/tableExport.js"></script>
		<script type="text/javascript" src="<%=basePath%>js/index.js"></script>
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script src="<%=basePath%>assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>





