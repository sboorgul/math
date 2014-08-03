package com.epm.logon.test;


import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.CleanupFailureDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.epm.logon.commons.CommonUtils;
import com.epm.logon.model.User;
import com.epm.logon.service.impl.UserImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {                                     
                                    "file:src/main/resources/spring-servlet.xml",
                                  })
public class TestUserImpl {
	  
	 @Autowired
	 private UserImpl userService;
	
	//@BeforeClass
	public static void setUp() throws Exception {
		System.out.println("Inside setUp cleaning up ......");
		//cleanUp();
		System.out.println("Cleanup completed.");
	}

	//@AfterClass
	public static void tearDown() throws Exception {
		System.out.println("Inside tearDown cleaning up ......");
		//cleanUp();
		System.out.println("Cleanup completed.");
	}
	
	@Test
	public void cleanUp() {
		try{
			System.out.println("Inside cleanUp cleaning up ......");
			
			System.out.println("Cleanup completed.");
		}catch(Exception e){
			System.out.println("Eror while deleting all permissions");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDeleteUser() {
		try{
			//System.out.println();
			userService.deleteUser("santosh");
			System.out.println("User with name santosh deleted successfully");
			userService.deleteUser("tanish");
			System.out.println("User with name tanish deleted successfully");
			
			junit.framework.Assert.assertEquals(true, true);
		}catch(Exception e){
			System.out.println("Testcase: testUpdatePermission failed");
			junit.framework.Assert.assertEquals(true, false);
		}
	}
	@Test
	public void testAddUser() {
		try{
			    System.out.println("Inside testAddUser");
		
				User user = new User();
				user.setUserId(CommonUtils.getUniqId());
				user.setUserName("santosh");
				user.setPassword("Lab123");
				userService.addUser(user);
				System.out.println("User with name santosh.");
			
				user = new User();
				user.setUserId(CommonUtils.getUniqId());
				user.setUserName("tanish");
				user.setPassword("Lab123");
				userService.addUser(user);
				System.out.println("User with name tanish saved.");
				junit.framework.Assert.assertEquals(true, true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Testcase: testAddPermission failed");
			junit.framework.Assert.assertEquals(true, false);
		}
	}
	
	@Test
	public void testLogin(){
		boolean status = false;
		try{
			System.out.println("Inside testLogin");
			status = userService.validate("santosh", "Lab123");
			junit.framework.Assert.assertEquals(status, true);
			status = userService.validate("tanish", "Lab123");
			junit.framework.Assert.assertEquals(status, true);
			System.out.println("End testLogin");
		}catch(Exception e){
			
		}
	}
	
	@Test
	public void testInvalidLogin(){
		boolean status = true;
		try{
			status = userService.validate("santosh", "Root123");
			junit.framework.Assert.assertEquals(status, false);
			status = userService.validate("tanish", "Root123");
			junit.framework.Assert.assertEquals(status, false);
		}catch(Exception e){
			
		}
	}
	
	//@Test
	public void testGetUser() {
		try{
			System.out.println("Inside testGetPermission ..");
			User user = userService.getUser("santosh");
			System.out.println("User details "+ user.toString());
			junit.framework.Assert.assertEquals(true, true);
		}catch(Exception e){
			System.out.println("Testcase: testGetPermission failed");
			junit.framework.Assert.assertEquals(true, false);
		}
	}
	
	//@Test
	public void testUpdatePermission() {
		try{
			//System.out.println();
			User user = userService.getUser("santosh");
			userService.updateUser(user);
			System.out.println("User with name santosh modified successfully");
			user = userService.getUser("tanish");
			userService.updateUser(user);
			System.out.println("User with name tanish modified successfully");
			junit.framework.Assert.assertEquals(true, true);
		}catch(Exception e){
			System.out.println("Testcase: testUpdatePermission failed"+e);
			e.printStackTrace();
			junit.framework.Assert.assertEquals(true, false);
		}
	}
	
	
	
	
		
	

}
