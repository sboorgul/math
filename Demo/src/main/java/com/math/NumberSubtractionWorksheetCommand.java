package com.math;

public class NumberSubtractionWorksheetCommand implements IWorksheetCommand{

	private IWorksheetReceiver iworksheetReceiver;

	public NumberSubtractionWorksheetCommand(){
		
	}
	
	public NumberSubtractionWorksheetCommand(IWorksheetReceiver iworksheetReceiver) {
		this.iworksheetReceiver = iworksheetReceiver;
	}

	@Override
	public IWorksheetOutput generate(IWorksheetInput worksheetInput) {
		System.out.println("Received command to execute Decimal worksheet");
		return iworksheetReceiver.generateWorksheet(worksheetInput);
	}
}
