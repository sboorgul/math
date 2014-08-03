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
import com.math.NumberSubtraction;
import com.math.NumberSubtractionInput;
import com.math.NumberSubtractionOutput;
import com.math.NumberSubtractionWorksheetReceiver;
import com.math.NumberWorksheetCommand;
import com.math.WorksheetInvoker;


@Controller
public class NumberSubtractionInputController{
	private String SUCCESS = "success";
	
	private NumberSubtractionInput numberSubtractionInput;
	private NumberSubtractionOutput numberSubtractionOutput;
	
	/**
	 * @return the numberSubtractionInput
	 */
	public NumberSubtractionInput getNumberSubtractionInput() {
		return this.numberSubtractionInput;
	}

	/**
	 * @param numberSubtractionInput the numberSubtractionInput to set
	 */
	public void setNumberSubtractionInput(NumberSubtractionInput numberSubtractionInput) {
		this.numberSubtractionInput = numberSubtractionInput;
	}

	
	
	
	public NumberSubtractionOutput getNumberSubtractionOutput() {
		return this.numberSubtractionOutput;
	}

	public void setNumberSubtractionOutput(NumberSubtractionOutput numberSubtractionOutput) {
		this.numberSubtractionOutput = numberSubtractionOutput;
	}

	public String show() {
		return SUCCESS;
	}
	@RequestMapping(value="/generatesub", method=RequestMethod.POST)
	public ModelAndView generate(@ModelAttribute NumberSubtractionInput nsi, Map<String, Object> map) {
		NumberSubtractionWorksheetReceiver numberSubtractionWorksheetReceiver = new NumberSubtractionWorksheetReceiver();
		IWorksheetCommand nmc = new DecimalWorksheetCommand(numberSubtractionWorksheetReceiver);
		WorksheetInvoker nmi = new WorksheetInvoker(nmc,nsi);
		NumberSubtractionOutput numberSubtractionOutput = (NumberSubtractionOutput) nmi.createWorksheet();
		this.setNumberSubtractionOutput(numberSubtractionOutput);
		Map<Integer,NumberSubtraction> maps = numberSubtractionOutput.getSubtractionProblems();
		Collection<NumberSubtraction> nums = maps.values();
		Iterator<NumberSubtraction> itr = nums.iterator();
		System.out.println("Generated Subration sheer");
		while(itr.hasNext()){
			NumberSubtraction ns = (NumberSubtraction)itr.next();
			System.out.println(ns.getProblemNumber());
			System.out.println(ns.getSubtractFrom());
			System.out.println(ns.getSubtractTo());
			
			System.out.println("Answer : "+ns.getAnswer());
		}
		return new ModelAndView("math/numberSubtractionOutput","numberSubtractionOutput",numberSubtractionOutput);
	}
	
	@RequestMapping("/showsub")
	public ModelAndView setupForm( Map<String, Object> map){
		//System.out.println("request param name : "+name);
		System.out.println("Inside NumberSubtractionInputController setupForm");
		return new ModelAndView("math/numberSubtractionInput", "command", new NumberSubtractionInput());
	}

}
