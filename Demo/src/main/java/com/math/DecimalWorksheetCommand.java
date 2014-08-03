package com.math;


public class DecimalWorksheetCommand implements IWorksheetCommand {
	private IWorksheetReceiver iworksheetReceiver;

	public DecimalWorksheetCommand(){
		
	}
	
	public DecimalWorksheetCommand(IWorksheetReceiver iworksheetReceiver) {
		this.iworksheetReceiver = iworksheetReceiver;
	}

	@Override
	public IWorksheetOutput generate(IWorksheetInput worksheetInput) {
		System.out.println("Received command to execute Decimal worksheet");
		return iworksheetReceiver.generateWorksheet(worksheetInput);
	}
}
