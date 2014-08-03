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
import com.math.NumberDivision;
import com.math.NumberDivisionInput;
import com.math.NumberDivisionOutput;
import com.math.NumberDivisionWorksheetCommand;
import com.math.NumberDivisionWorksheetReceiver;
import com.math.NumberWorksheetCommand;
import com.math.WorksheetInvoker;


@Controller
public class NumberDivisionInputController{
	private String SUCCESS = "success";
	
	private NumberDivisionInput numberDivisionInput;
	private NumberDivisionOutput numberDivisionOutput;
	
	/**
	 * @return the numberDivisionInput
	 */
	public NumberDivisionInput getNumberDivisionInput() {
		return this.numberDivisionInput;
	}

	/**
	 * @param numberDivisionInput the numberDivisionInput to set
	 */
	public void setNumberDivisionInput(NumberDivisionInput numberDivisionInput) {
		this.numberDivisionInput = numberDivisionInput;
	}

	
	
	
	public NumberDivisionOutput getNumberDivisionOutput() {
		return this.numberDivisionOutput;
	}

	public void setNumberDivisionOutput(NumberDivisionOutput numberDivisionOutput) {
		this.numberDivisionOutput = numberDivisionOutput;
	}

	public String show() {
		return SUCCESS;
	}
	@RequestMapping(value="/generatediv", method=RequestMethod.POST)
	public ModelAndView generate(@ModelAttribute NumberDivisionInput nmli, Map<String, Object> map) {
		NumberDivisionWorksheetReceiver numberDivisionWorksheetReceiver = new NumberDivisionWorksheetReceiver();
		IWorksheetCommand ndc = new NumberDivisionWorksheetCommand(
				numberDivisionWorksheetReceiver);

		WorksheetInvoker nmi = new WorksheetInvoker(ndc,
				nmli);
		NumberDivisionOutput numberDivisionOutput = (NumberDivisionOutput) nmi
				.createWorksheet();
		this.setNumberDivisionOutput(numberDivisionOutput);
		Map<Integer,NumberDivision> maps = numberDivisionOutput.getDivisionProblems();
		Collection<NumberDivision> nums = maps.values();
		Iterator<NumberDivision> itr = nums.iterator();
		System.out.println("Generated Division sheet");
		while(itr.hasNext()){
			NumberDivision ns = (NumberDivision)itr.next();
			System.out.println(ns.getDivisor());
			System.out.println(ns.getFormatDividend());
			
			System.out.println("Answer : "+ns.getAnswer());
		}
		return new ModelAndView("math/numberDivisionOutput","numberDivisionOutput",numberDivisionOutput);
	}
	
	@RequestMapping("/showdiv")
	public ModelAndView setupForm( Map<String, Object> map){
		//System.out.println("request param name : "+name);
		System.out.println("Inside NumberDivisionInputController setupForm");
		return new ModelAndView("math/numberDivisionInput", "command", new NumberDivisionInput());
	}

}
