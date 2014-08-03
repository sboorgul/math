package com.math;

public class DecimalDivisionWorksheetCommand implements IWorksheetCommand {
	private IWorksheetReceiver iworksheetReceiver;

	public DecimalDivisionWorksheetCommand() {

	}

	public DecimalDivisionWorksheetCommand(IWorksheetReceiver iworksheetReceiver) {
		this.iworksheetReceiver = iworksheetReceiver;
	}

	@Override
	public IWorksheetOutput generate(IWorksheetInput worksheetInput) {
		return iworksheetReceiver.generateWorksheet(worksheetInput);
	}
}
