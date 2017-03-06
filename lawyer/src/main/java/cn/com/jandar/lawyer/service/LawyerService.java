package cn.com.jandar.lawyer.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.lawyer.dao.LawyerDao;
import cn.com.jandar.lawyer.model.Lawyer;
/**
 * 律师 service
 * @author Chengw
 * @since 2017年3月1日 下午4:30:13 
 *
 */
@Transactional
@Service("lawyerService")
public class LawyerService {

	@Resource
	LawyerDao lawyerDao;
	/**
	 * 根据id 查询律师
	 * @param id
	 * @return
	 */
	public Lawyer findById(String id){
		Criteria c =lawyerDao.getSession().createCriteria(Lawyer.class);
		c.add(Restrictions.eq("id", id));
		return (Lawyer) c.uniqueResult();
	}
	
	/**
	 * 根据律师执业证号查询律师
	 * @param licenseNumber
	 * @return
	 */
	public Lawyer findByLicenseNumber(String licenseNumber){
		Criteria c =lawyerDao.getSession().createCriteria(Lawyer.class);
		c.add(Restrictions.eq("licenseNumber", licenseNumber));
		return (Lawyer) c.uniqueResult();
	}
	/**
	 * 根据身份证号查询律师
	 * @param idNumber
	 * @return
	 */
	public Lawyer findByIdNumber(String idNumber){
		Criteria c =lawyerDao.getSession().createCriteria(Lawyer.class);
		c.add(Restrictions.eq("idNumber", idNumber));
		return (Lawyer) c.uniqueResult();
	}
	/**
	 * 根据人员id查询律师
	 * @param personId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Lawyer> findByPersonId(String personId){
		Criteria c =lawyerDao.getSession().createCriteria(Lawyer.class);
		c.add(Restrictions.eq("personId", personId));
		return c.list();
	}
	
	/**
	 * 根据律师事务所的id查询律师
	 * @param practiceOrg
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Lawyer> findByPracticeOrg(String practiceOrg){
		Criteria c =lawyerDao.getSession().createCriteria(Lawyer.class);
		c.add(Restrictions.eq("practiceOrg", practiceOrg));
		return c.list();
	}
	/**
	 * 根据最后更新时间查询律师
	 * @param lastUpdateDate
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Lawyer> findByLastUpdateDate(Date lastUpdateDate){
		Criteria c = lawyerDao.getSession().createCriteria(Lawyer.class);
		c.add(Restrictions.ge("lastUpdateDate", lastUpdateDate));
		return c.list();
	}
	/**
	 * 模拟接口中分页查询
	 * @param lastUpdateDate
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Lawyer> findByParam(Date lastUpdateDate,Integer pageNum,Integer pageSize){
		Criteria c = lawyerDao.getSession().createCriteria(Lawyer.class);
		if(lastUpdateDate!= null){
			c.add(Restrictions.ge("lastUpdateDate", lastUpdateDate));
		}
		c.setMaxResults(pageSize);
		c.setFirstResult(pageNum*pageSize+1);
		c.addOrder(Order.desc("laseUpdateDate"));
		return c.list();
	}
	
	/**
	 * 保存
	 * @param lawyers
	 */
	public void saveLawyerList(List<Lawyer> lawyers){
		int n = 0;
		for(Lawyer lawyer:lawyers){
			lawyerDao.getSession().saveOrUpdate(lawyer);
			if(n/100==0){
				lawyerDao.getSession().flush();
			}
		}
	}
}
