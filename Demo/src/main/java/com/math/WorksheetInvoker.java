package com.math;

import org.springframework.stereotype.Component;



public class WorksheetInvoker {
	private IWorksheetCommand iWorksheetCommand;
	private IWorksheetInput worksheetInput;

	public WorksheetInvoker(IWorksheetCommand command,
			IWorksheetInput worksheetInput) {
		this.iWorksheetCommand = command;
		this.worksheetInput=worksheetInput;
	}

	public IWorksheetOutput createWorksheet() {
		System.out.println("Creating Invoker worksheet");
		return this.getiWorksheetCommand().generate(worksheetInput);
	}

	public IWorksheetCommand getiWorksheetCommand() {
		return iWorksheetCommand;
	}

	public void setiWorksheetCommand(IWorksheetCommand iWorksheetCommand) {
		this.iWorksheetCommand = iWorksheetCommand;
	}
}
