package cn.com.jandar.lawyer.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.lawyer.dao.LawFirmDao;
import cn.com.jandar.lawyer.model.LawFirm;
/**
 * 律师事务所 service
 * @author Chengw
 * @since 2017年3月1日 下午4:58:38 
 *
 */
@Transactional
@Service("lawFirmService")
public class LawFirmService {

	@Resource
	LawFirmDao lawFirmDao;
	
	public void saveLawFirmList(List<LawFirm> lawfirms){
		int i = 0;
		for(LawFirm lawFirm:lawfirms){
			lawFirmDao.getSession().saveOrUpdate(lawFirm);
			if(i/100==0){
				lawFirmDao.getSession().flush();
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<LawFirm> findByParam(Date lastUpdateDate,Integer pageNum,Integer pageSize){
		Criteria c = lawFirmDao.getSession().createCriteria(LawFirm.class);
		if(lastUpdateDate!= null){
			c.add(Restrictions.ge("lastUpdateDate", lastUpdateDate));
		}
		c.setMaxResults(pageSize);
		c.setFirstResult(pageNum*pageSize+1);
		c.addOrder(Order.desc("laseUpdateDate"));
		return c.list();
	}
	
	public LawFirm findById(String id){
		Criteria c = lawFirmDao.getSession().createCriteria(LawFirm.class);
		c.add(Restrictions.eq("id", id));
		return (LawFirm) c.uniqueResult();
	}
	
	/**
	 * 根据执业证号查询律师事务所
	 * @param licenseNumber
	 * @return
	 */
	public LawFirm findByLicenseNumber(String licenseNumber){
		Criteria c = lawFirmDao.getSession().createCriteria(LawFirm.class);
		c.add(Restrictions.eq("licenseNumber", licenseNumber));
		return (LawFirm) c.uniqueResult();
	}
	/**
	 * 根据人员id 查询律师事务所
	 * @param personId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<LawFirm> findByPersonId(String personId){
		Criteria c = lawFirmDao.getSession().createCriteria(LawFirm.class);
		c.add(Restrictions.eq("personId", personId));
		return c.list();
	}
	/**
	 * 根据最后更新时间去查询律师事务所
	 * @param lastUpdateDate
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<LawFirm> findByLastUpdateDate(Date lastUpdateDate){
		Criteria c = lawFirmDao.getSession().createCriteria(LawFirm.class);
		c.add(Restrictions.ge("lastUpdateDate", lastUpdateDate));
		return c.list();
	}
	
	
}
