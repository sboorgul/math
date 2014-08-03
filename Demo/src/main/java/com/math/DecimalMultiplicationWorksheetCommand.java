package com.math;

public class DecimalMultiplicationWorksheetCommand implements IWorksheetCommand{
	private IWorksheetReceiver iworksheetReceiver;

	public DecimalMultiplicationWorksheetCommand() {

	}

	public DecimalMultiplicationWorksheetCommand(IWorksheetReceiver iworksheetReceiver) {
		this.iworksheetReceiver = iworksheetReceiver;
	}

	@Override
	public IWorksheetOutput generate(IWorksheetInput worksheetInput) {
		return iworksheetReceiver.generateWorksheet(worksheetInput);
	}
}
