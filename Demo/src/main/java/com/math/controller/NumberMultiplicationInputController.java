package com.math.controller;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.math.DecimalWorksheetCommand;
import com.math.IWorksheetCommand;
import com.math.IWorksheetInput;
import com.math.NumberMultiplication;
import com.math.NumberMultiplicationInput;
import com.math.NumberMultiplicationOutput;
import com.math.NumberMultiplicationWorksheetReceiver;
import com.math.NumberWorksheetCommand;
import com.math.WorksheetInvoker;


@Controller
public class NumberMultiplicationInputController{
	private String SUCCESS = "success";
	
	private NumberMultiplicationInput numberMultiplicationInput;
	private NumberMultiplicationOutput numberMultiplicationOutput;
	
	/**
	 * @return the numberMultiplicationInput
	 */
	public NumberMultiplicationInput getNumberMultiplicationInput() {
		return this.numberMultiplicationInput;
	}

	/**
	 * @param numberMultiplicationInput the numberMultiplicationInput to set
	 */
	public void setNumberMultiplicationInput(NumberMultiplicationInput numberMultiplicationInput) {
		this.numberMultiplicationInput = numberMultiplicationInput;
	}

	
	
	
	public NumberMultiplicationOutput getNumberMultiplicationOutput() {
		return this.numberMultiplicationOutput;
	}

	public void setNumberMultiplicationOutput(NumberMultiplicationOutput numberMultiplicationOutput) {
		this.numberMultiplicationOutput = numberMultiplicationOutput;
	}

	public String show() {
		return SUCCESS;
	}
	@RequestMapping(value="/generatemul", method=RequestMethod.POST)
	public ModelAndView generate(@ModelAttribute NumberMultiplicationInput nmli, Map<String, Object> map) {
		NumberMultiplicationWorksheetReceiver numberMultiplicationWorksheetReceiver = new NumberMultiplicationWorksheetReceiver();
		IWorksheetCommand nmc = new DecimalWorksheetCommand(numberMultiplicationWorksheetReceiver);
		WorksheetInvoker nmi = new WorksheetInvoker(nmc,nmli);
		NumberMultiplicationOutput numberMultiplicationOutput = (NumberMultiplicationOutput) nmi.createWorksheet();
		this.setNumberMultiplicationOutput(numberMultiplicationOutput);
		Map<Integer,NumberMultiplication> maps = numberMultiplicationOutput.getMultiplicationProblems();
		Collection<NumberMultiplication> nums = maps.values();
		Iterator<NumberMultiplication> itr = nums.iterator();
		System.out.println("Generated Multiplication sheet");
		while(itr.hasNext()){
			NumberMultiplication ns = (NumberMultiplication)itr.next();
			System.out.println(ns.getFormatMultiplicationNumber());
			System.out.println(ns.getFormatMultiplier());
			
			System.out.println("Answer : "+ns.getAnswer());
		}
		return new ModelAndView("math/numberMultiplicationOutput","numberMultiplicationOutput",numberMultiplicationOutput);
	}
	
	@RequestMapping("/showmul")
	public ModelAndView setupForm( Map<String, Object> map){
		//System.out.println("request param name : "+name);
		System.out.println("Inside NumberMultiplicationInputController setupForm");
		return new ModelAndView("math/numberMultiplicationInput", "command", new NumberMultiplicationInput());
	}

}
