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

import cn.com.jandar.lawyer.model.Lawyer;
import cn.com.jandar.lawyer.service.LawFirmService;
import cn.com.jandar.lawyer.service.LawyerService;
import cn.com.jandar.utils.DateUtils;
import cn.com.jandar.utils.JsonUtils;


@Controller
@RequestMapping("/lawyer")
public class LawyerController {
	
	@Resource
	LawyerService lawyerService;
	
	@Resource
	LawFirmService lawfirmService;

	@ResponseBody
	@RequestMapping(value="/list", method = RequestMethod.POST)
	public Map<String,Object> list(Date lastUpdateDate,Integer pageNum,Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			List<Lawyer> result = lawyerService.findByParam(lastUpdateDate,pageNum,pageSize);
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
			Lawyer result = lawyerService.findById(id);
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
			Lawyer result = lawyerService.findById(id);
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/idNumber/{idNumber}", method = RequestMethod.GET)
	public Map<String, Object> findByIdNumber(@PathVariable("idNumber") String idNumber) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Lawyer result = lawyerService.findByIdNumber(idNumber);
			map.put("data", result);
			map.put("state", "success");
		} catch (Exception e) {
			map.put("state", "error");
			map.put("error", e);
		}

		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="/idNumber", method = RequestMethod.POST)
	public Map<String,Object> postIdNumber(String idNumber){
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			Lawyer result = lawyerService.findByIdNumber(idNumber);
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
		Lawyer result = lawyerService.findByLicenseNumber(licenseNumber);
		return JsonUtils.getLawyerJson(result);

	}
	
	@ResponseBody
	@RequestMapping(value = "/licenseNumber/{licenseNumber}", method = RequestMethod.GET)
	public Map<String, Object> findByLicenseNumber(@PathVariable("licenseNumber") String licenseNumber) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Lawyer result = lawyerService.findByLicenseNumber(licenseNumber);
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
			Lawyer result = lawyerService.findByLicenseNumber(licenseNumber);
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
			List<Lawyer> result = lawyerService.findByPersonId(personId);
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
			List<Lawyer> result = lawyerService.findByPersonId(personId);
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="/practiceOrg", method = RequestMethod.POST)
	public Map<String,Object> postPracticeOrg(String practiceOrg){
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			List<Lawyer> result = lawyerService.findByPracticeOrg(practiceOrg);
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/practiceOrg/{practiceOrg}", method = RequestMethod.GET)
	public Map<String, Object> findByPracticeOrg(@PathVariable("practiceOrg") String practiceOrg) {
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			List<Lawyer> result = lawyerService.findByPracticeOrg(practiceOrg);
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/lastUpdateDate/{lastUpdateDate}", method = RequestMethod.GET)
	public Map<String, Object> findLastUpdateDate(@PathVariable("lastUpdateDate") String lastUpdateDate) {
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			List<Lawyer> result = lawyerService.findByLastUpdateDate(DateUtils.dateFormat(lastUpdateDate, "yyyy-MM-dd"));
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
	

	@ResponseBody
	@RequestMapping(value="/lastUpdateDate", method = RequestMethod.POST)
	public Map<String,Object> postLastUpdateDate(Date lastUpdateDate){
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			List<Lawyer> result = lawyerService.findByLastUpdateDate(lastUpdateDate);
			map.put("data", result);
			map.put("state", "success");
		}catch(Exception e){
			map.put("state","error");
			map.put("error",e);
		}
		return map;
	}
}
