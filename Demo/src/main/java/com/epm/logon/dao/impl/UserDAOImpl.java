package com.epm.logon.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epm.logon.dao.IUserDAO;
import com.epm.logon.model.User;
@Repository("userDAOImpl")
public class UserDAOImpl implements IUserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);

	}

	
	public User getUser(String userName) {
		// TODO Auto-generated method stub
		System.out.println("Inside getUser for name "+userName);
		Query query = sessionFactory.getCurrentSession().createQuery("from User where userName = :userName ");
		query.setParameter("userName", userName);
		List<User> list = query.list();
		System.out.println("List size returned :"+list.size());
		if(list.size()>0){
		return list.get(0);
		}else{
			return null;
		}
	}
	
	
	public User getUserById(String userId) {
		
		return (User)sessionFactory.getCurrentSession().get(User.class, userId);
	}

	
	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	
	public void deleteUser(String userName) {
		sessionFactory.getCurrentSession().delete(getUser(userName));

	}

}
