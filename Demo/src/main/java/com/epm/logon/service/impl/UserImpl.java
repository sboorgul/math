/**
 * 
 */
package com.epm.logon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epm.logon.commons.CryptoUtil;
import com.epm.logon.dao.impl.UserDAOImpl;
import com.epm.logon.model.User;
import com.epm.logon.service.IUser;

/**
 * @author root
 *
 */

@Service("userService")
public class UserImpl implements IUser {
	
	@Autowired
	private UserDAOImpl userDAO;
	
	@Transactional
	public void addUser(User user) {
		CryptoUtil cryptoUtil = new CryptoUtil();
		String encPwd = null;
		try{
		encPwd = cryptoUtil.encrypt(user.getPassword());
		}catch(Exception e){
			e.printStackTrace();
		}
		if(encPwd != null)
			user.setPassword(encPwd);
		userDAO.addUser(user);
		System.out.println("User added successfully"+user.getUserName());
		
	}

	@Transactional
	public User getUser(String userName) {
		return userDAO.getUser(userName);
	}

	@Transactional
	public void updateUser(User user) {
		userDAO.updateUser(user);
		System.out.println("User updated successfully"+user.getUserName());
	}

	@Transactional
	public void deleteUser(String userName) {
		userDAO.deleteUser(userName);
		System.out.println("User deleted successfully"+userName);
	}
	@Transactional
	public User getUserById(String userId) {
		return userDAO.getUserById(userId);
	}
	
	@Transactional
	public boolean validate(String userName, String password) {
		try{
			CryptoUtil cryptoUtil = new CryptoUtil();
			String encPwd = null;
			encPwd = cryptoUtil.encrypt(password);
			User user = getUser(userName);
			return encPwd.equals(user.getPassword());
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
