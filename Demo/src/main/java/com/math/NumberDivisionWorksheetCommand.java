package com.math;

public class NumberDivisionWorksheetCommand implements IWorksheetCommand {
	private IWorksheetReceiver iworksheetReceiver;

	public NumberDivisionWorksheetCommand() {

	}

	public NumberDivisionWorksheetCommand(IWorksheetReceiver iworksheetReceiver) {
		this.iworksheetReceiver = iworksheetReceiver;
	}

	@Override
	public IWorksheetOutput generate(IWorksheetInput worksheetInput) {
		return iworksheetReceiver.generateWorksheet(worksheetInput);
	}
}
