package com.math.controller;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.epm.logon.model.User;
import com.math.IWorksheetCommand;
import com.math.IWorksheetInput;
import com.math.NumberAddition;
import com.math.NumberAdditionFormat;
import com.math.NumberAdditionInput;
import com.math.NumberAdditionOutput;
import com.math.NumberAdditionWorksheetReceiver;
import com.math.NumberWorksheetCommand;
import com.math.WorksheetInvoker;

@Controller
public class NumberAdditionInputController{
	private String SUCCESS = "success";
	
	private NumberAdditionInput numberAdditionInput;
	private NumberAdditionOutput numberAdditionOutput;
	
	/**
	 * @return the numberAdditionInput
	 */
	public NumberAdditionInput getNumberAdditionInput() {
		return this.numberAdditionInput;
	}

	/**
	 * @param numberAdditionInput the numberAdditionInput to set
	 */
	public void setNumberAdditionInput(NumberAdditionInput numberAdditionInput) {
		this.numberAdditionInput = numberAdditionInput;
	}

	
	
	
	public NumberAdditionOutput getNumberAdditionOutput() {
		return this.numberAdditionOutput;
	}

	public void setNumberAdditionOutput(NumberAdditionOutput numberAdditionOutput) {
		this.numberAdditionOutput = numberAdditionOutput;
	}

	public String show() {
		return SUCCESS;
	}
	@RequestMapping(value="/generate", method=RequestMethod.POST)
	public ModelAndView generate(@ModelAttribute NumberAdditionInput nai, Map<String, Object> map) {
		NumberAdditionWorksheetReceiver numberAdditionWorksheetReceiver = new NumberAdditionWorksheetReceiver();
		IWorksheetCommand nwc = new NumberWorksheetCommand(numberAdditionWorksheetReceiver);
		IWorksheetInput worksheetInput = new NumberAdditionInput(nai);
		WorksheetInvoker wsi = new WorksheetInvoker(nwc, worksheetInput);
		NumberAdditionOutput numberAdditionOutput = (NumberAdditionOutput) wsi.createWorksheet();
		this.setNumberAdditionOutput(numberAdditionOutput);
		return new ModelAndView("math/numberAdditionOutput","numberAdditionOutput",numberAdditionOutput);
	}
	
	@RequestMapping("/show")
	public ModelAndView setupForm( Map<String, Object> map){
		//System.out.println("request param name : "+name);
		System.out.println("Inside NumberAdditionInputController setupForm");
		return new ModelAndView("math/numberAdditionInput", "command", new NumberAdditionInput());
	}

}
