package cn.com.jandar.lawyer.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cn.com.jandar.lawyer.model.LawFirm;

/**
 * 律师事务所 dao
 * @author Chengw
 * @since 2017年3月1日 下午4:28:46 
 *
 */
@Repository("lawFirmDao")
public class LawFirmDao {

	@Resource
	protected SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public LawFirm findById(Long id) {
		return (LawFirm) this.getSession().createCriteria(LawFirm.class).add(Restrictions.eq("id", id)).uniqueResult();
	}
}
