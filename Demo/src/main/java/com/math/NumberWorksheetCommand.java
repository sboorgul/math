package com.math;


public class NumberWorksheetCommand implements IWorksheetCommand {
	private NumberAdditionWorksheetReceiver numberAdditionWorksheetReceiver;

	public NumberWorksheetCommand(){
		
	}
	
	public NumberWorksheetCommand(NumberAdditionWorksheetReceiver numberAdditionWorksheetReceiver) {
		this.numberAdditionWorksheetReceiver = numberAdditionWorksheetReceiver;
	}

	@Override
	public IWorksheetOutput generate(IWorksheetInput worksheetInput) {
		System.out.println("Received command to execute number worksheet");
		return numberAdditionWorksheetReceiver.generateWorksheet(worksheetInput);
	}

}
