package com.epm.logon.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.epm.logon.model.User;
import com.epm.logon.service.impl.UserImpl;

@Controller
public class LoginController {
	@Autowired
	UserImpl userImpl;
	
	@RequestMapping("/login")
	public ModelAndView setupForm( Map<String, Object> map){
		//System.out.println("request param name : "+name);
		System.out.println("Inside LoginController setupForm");
		return new ModelAndView("login", "command", new User());
	}
	
	
	@RequestMapping(value="/auth", method=RequestMethod.POST)
    public String authenticate(@ModelAttribute User user, Map<String, Object> map){
		try{
			System.out.println("Inside authenticate ....");
		
			System.out.println("User name, Password  "+user.getUserName()+" , "+ user.getPassword());
			if(userImpl.validate(user.getUserName(), user.getPassword())){
				return "loginsuccess";
			}else{
				return "loginfailed";
			}
		
		}catch(Exception e){
			e.printStackTrace();
			return "loginfailed";
		}
    }
	
	

}

