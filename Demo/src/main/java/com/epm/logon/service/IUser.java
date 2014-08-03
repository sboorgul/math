package com.epm.logon.service;

import com.epm.logon.model.User;

public interface IUser {
	public void addUser(User user);
	public User getUser(String userName);
	public void updateUser(User user);
	public void deleteUser(String userName);
	public User getUserById(String userId);
	public boolean validate(String userName, String password);
}
