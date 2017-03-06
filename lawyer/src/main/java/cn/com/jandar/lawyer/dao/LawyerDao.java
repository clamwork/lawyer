package cn.com.jandar.lawyer.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
/**
 * 律师dao
 * @author Chengw
 * @since 2017年3月1日 下午4:28:23 
 *
 */
@Repository("lawyerDao")
public class LawyerDao {

	@Resource
	protected SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
