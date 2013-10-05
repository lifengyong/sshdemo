package cn.lifengyong.testssh.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.lifengyong.entity.User;

public class UserDAOImpl implements UserDAO {
	private SessionFactory sessionFactory;

	public User queryUserByName(String name) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from User as u where u.name = ?");
		query.setString(0, name);
		User u = (User) query.uniqueResult();
		return u;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
