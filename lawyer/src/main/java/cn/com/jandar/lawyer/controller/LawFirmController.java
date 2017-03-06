package cn.com.jandar.lawyer.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.jandar.lawyer.model.LawFirm;
import cn.com.jandar.lawyer.service.LawFirmService;
import cn.com.jandar.utils.JsonUtils;

@Controller
@RequestMapping("/lawFirm")
public class LawFirmController {

	@Resource
	LawFirmService lawfirmService;
	
	@ResponseBody
	@RequestMapping(value="/list", method = RequestMethod.POST)
	public Map<String,Object> list(Date lastUpdateDate,Integer pageNum,Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			List<LawFirm> result = lawfirmService.findByParam(lastUpdateDate,pageNum,pageSize);
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public Map<String, Object> findById(@PathVariable("id") String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			LawFirm result = lawfirmService.findById(id);
			map.put("data", result);
			map.put("state", "success");
		} catch (Exception e) {
			map.put("state", "error");
			map.put("error", e);
		}

		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="/id", method = RequestMethod.POST)
	public Map<String,Object> postId(String id){
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			LawFirm result = lawfirmService.findById(id);
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
	@ResponseBody
	@RequestMapping(value = "/cn/licenseNumber/{licenseNumber}", method = RequestMethod.GET,produces={"text/html;charset=UTF-8;","application/json;"})
	public String findCnByLicenseNumber(@PathVariable("licenseNumber") String licenseNumber) {
		LawFirm result = lawfirmService.findByLicenseNumber(licenseNumber);
		return JsonUtils.getLawFirmJson(result);
	}
	
	@ResponseBody
	@RequestMapping(value = "/licenseNumber/{licenseNumber}", method = RequestMethod.GET)
	public Map<String, Object> findByLicenseNumber(@PathVariable("licenseNumber") String licenseNumber) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			LawFirm result = lawfirmService.findByLicenseNumber(licenseNumber);
			map.put("data", result);
			map.put("state", "success");
		} catch (Exception e) {
			map.put("state", "error");
			map.put("error", e);
		}

		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="/licenseNumber", method = RequestMethod.POST)
	public Map<String,Object> postLicenseNumber(String licenseNumber){
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			LawFirm result = lawfirmService.findByLicenseNumber(licenseNumber);
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="/person", method = RequestMethod.POST)
	public Map<String,Object> postPerson(String personId){
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			List<LawFirm> result = lawfirmService.findByPersonId(personId);
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/person/{personId}", method = RequestMethod.GET)
	public Map<String, Object> findlicenseNumber(@PathVariable("personId") String personId) {
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			List<LawFirm> result = lawfirmService.findByPersonId(personId);
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
	
}
