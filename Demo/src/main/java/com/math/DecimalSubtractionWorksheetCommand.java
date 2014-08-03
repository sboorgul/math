package com.math;

public class DecimalSubtractionWorksheetCommand implements IWorksheetCommand {
	private IWorksheetReceiver iworksheetReceiver;

	public DecimalSubtractionWorksheetCommand(){
		
	}
	
	public DecimalSubtractionWorksheetCommand(IWorksheetReceiver iworksheetReceiver) {
		this.iworksheetReceiver = iworksheetReceiver;
	}

	@Override
	public IWorksheetOutput generate(IWorksheetInput worksheetInput) {
		return iworksheetReceiver.generateWorksheet(worksheetInput);
	}
}
