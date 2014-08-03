package com.epm.logon.dao;

import com.epm.logon.model.User;

public interface IUserDAO {
	public void addUser(com.epm.logon.model.User user);
	public User getUser(String userName);
	public void updateUser(User user);
	public void deleteUser(String userName);
	public User getUserById(String userId);
}
