package cn.com.jandar.lawyer.quartz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.com.jandar.lawyer.model.LawFirm;
import cn.com.jandar.lawyer.model.Lawyer;
import cn.com.jandar.lawyer.service.LawFirmService;
import cn.com.jandar.lawyer.service.LawyerService;
import cn.com.jandar.utils.DataUtils;
import cn.com.jandar.utils.DateUtils;


public class QuartzJob {
	
	Log log=  LogFactory.getLog(QuartzJob.class);
	
	@Resource
	LawyerService lawyerService;
	
	@Resource
	LawFirmService lawfirmService;
	
	private static final int pageSize = 1000;
	
	public void work(){
		long t1 = System.currentTimeMillis();
		getLawyerData();
		long t2 = System.currentTimeMillis();
		log.info("getLawyerData time :"+(t2-t1)+"ms");
		getLawFirmData();
		long t3 = System.currentTimeMillis();
		log.info("getLawFirmData time :"+(t3-t2)+"ms");
	}
	
	/**
	 * 保存律师数据
	 */
	public void getLawyerData(){
		int pageNum = 0;
		String dateStr = DateUtils.getFormatDate(DateUtils.getDateByDay(new Date(), -1));
		while(true){
			List<com.lenchy.lms.service.ws2.Lawyer> lawyers  = DataUtils.searchLawyers(dateStr, pageNum, pageSize);
			if(lawyers.size() == 0){
				break;
			}
			lawyerService.saveLawyerList(getLawyerList(lawyers));
			pageNum++;
		}
		
	}
	
	/**
	 * 保存律师事务所
	 */
	public void getLawFirmData(){
		int pageNum = 0;
		String dateStr = DateUtils.getFormatDate(DateUtils.getDateByDay(new Date(), -1));
		while(true){
			List<com.lenchy.lms.service.ws2.LawFirm> lawfirms  = DataUtils.searchLawFirms(dateStr, pageNum, pageSize);
			if(lawfirms.size() == 0){
				break;
			}
			lawfirmService.saveLawFirmList(getLawFirmList(lawfirms));
			pageNum++;
		}
	}
	/**
	 * 律师接口类 转化 律师类
	 * @param lawyers
	 * @return
	 */
	public List<cn.com.jandar.lawyer.model.Lawyer> getLawyerList(List<com.lenchy.lms.service.ws2.Lawyer> lawyers){
		List<Lawyer> result = new ArrayList<Lawyer>();
		for(com.lenchy.lms.service.ws2.Lawyer l :lawyers){
			Lawyer lawyer = new Lawyer();
			lawyer.setId(l.getId());
			lawyer.setAddress(l.getAddress());
			lawyer.setCreateDate(l.getCreateDate());
			lawyer.setEducation(l.getEducation());
			lawyer.setEmail(l.getEmail());
			lawyer.setFax(l.getFax());
			lawyer.setGender(l.getGender());
			lawyer.setIdNumber(l.getIdNumber());
			lawyer.setLastUpdateDate(l.getLastUpdateDate());
			lawyer.setLicenseDate(l.getLicenseDate());
			lawyer.setLicenseNumber(l.getLicenseNumber());
			lawyer.setMobile(l.getMobile());
			lawyer.setName(l.getName());
			lawyer.setPersonId(l.getPersonId());
			lawyer.setPhone(l.getPhone());
			lawyer.setPolitic(l.getPolitic());
			lawyer.setPostcode(l.getPostcode());
			lawyer.setPracticeOrg(l.getPracticeOrg());
			lawyer.setPracticeStatus(l.getPracticeStatus());
			lawyer.setPracticeType(l.getPracticeType());
			lawyer.setQualificationNumber(l.getQualificationNumber());
			lawyer.setQualificationDate(l.getQualificationDate());
			lawyer.setPortrait(l.getPortrait());
			lawyer.setNation(l.getNation());
			result.add(lawyer);
		}
		return result;
	}
	/**
	 * 律师事务所接口类 转化 律师事务所类
	 * @param lawfirms
	 * @return
	 */
	public List<LawFirm> getLawFirmList(List<com.lenchy.lms.service.ws2.LawFirm> lawfirms){
		List<LawFirm> result = new ArrayList<LawFirm>();
		for(com.lenchy.lms.service.ws2.LawFirm l : lawfirms){
			LawFirm lawfirm = new LawFirm();
			lawfirm.setAddress(l.getAddress());
			lawfirm.setApproveDate(l.getApproveDate());
			lawfirm.setCreateDate(l.getCreateDate());
			lawfirm.setDirector(l.getDirector());
			lawfirm.setDirectorId(l.getDirectorId());
			lawfirm.setEmail(l.getEmail());
			lawfirm.setFax(l.getFax());
			lawfirm.setId(l.getId());
			lawfirm.setJusticeBureau(l.getJusticeBureau());
			lawfirm.setLastUpdateDate(l.getLastUpdateDate());
			lawfirm.setLawFirmType(l.getLawFirmType());
			lawfirm.setLicenseNumber(l.getLicenseNumber());
			lawfirm.setName(l.getName());
			lawfirm.setPersonId(l.getPersonId());
			lawfirm.setPhone(l.getPhone());
			lawfirm.setPostcode(l.getPostcode());
			lawfirm.setPracticeStatus(l.getPracticeStatus());
			lawfirm.setRegisteredCapital(l.getRegisteredCapital());
			lawfirm.setWebsite(l.getWebsite());
			result.add(lawfirm);
		}
		return result;
	}
}
