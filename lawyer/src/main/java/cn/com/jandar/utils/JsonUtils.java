package cn.com.jandar.utils;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.druid.support.json.JSONUtils;

import cn.com.jandar.lawyer.enums.PracticeStatusEnum;
import cn.com.jandar.lawyer.model.LawFirm;
import cn.com.jandar.lawyer.model.Lawyer;

public class JsonUtils {

	public static String getLawyerJson(Lawyer lawyer) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (lawyer != null) {
			map.put("律师执业证号", lawyer.getLicenseNumber());
			map.put("身份证号", lawyer.getIdNumber());
			map.put("姓名", lawyer.getName());
			map.put("政治面貌", lawyer.getPolitic());
			map.put("最高学历", lawyer.getEducation());
			map.put("性别", lawyer.getGender());
			map.put("执业证类别", lawyer.getPracticeType());
			map.put("执业机构", lawyer.getLawFirm().getName());
			map.put("发证机关", "");
			map.put("发证日期", lawyer.getLicenseDate().getTime());
			map.put("执业状态", PracticeStatusEnum.valueOf(lawyer.getPracticeStatus()).getValue());
			map.put("联系电话", lawyer.getPhone());
			map.put("手机号码", lawyer.getMobile());
			map.put("电子邮箱", lawyer.getEmail());
			map.put("邮政编码", lawyer.getPostcode());
			map.put("联系地址", lawyer.getAddress());
			map.put("备注", "");
			map.put("创建时间", lawyer.getCreateDate().getTime());
			map.put("更新时间", lawyer.getLastUpdateDate().getTime());
		} else {
			map.put("查询结果", "未找到该律师信息");
		}
		return JSONUtils.toJSONString(map);
	}

	public static String getLawFirmJson(LawFirm lawfirm) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (lawfirm != null) {
			map.put("名称", lawfirm.getName());
			map.put("组织形式", lawfirm.getLawFirmType());
			map.put("执业证号", lawfirm.getLicenseNumber());
			map.put("负责人", lawfirm.getDirector());
			map.put("联系地址", lawfirm.getAddress());
			map.put("邮政编码", lawfirm.getPostcode());
			map.put("手机号码", lawfirm.getPhone());
			map.put("电子邮箱", lawfirm.getEmail());
		} else {
			map.put("查询结果", "未找到该律师事务所信息");
		}
		return JSONUtils.toJSONString(map);
	}

}
