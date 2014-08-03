package com.math;

import java.util.List;
import java.util.Map;

public class CommandClient {
  public static void main(String args[]){
	  NumberAdditionWorksheetReceiver numberAdditionWorksheetReceiver = new NumberAdditionWorksheetReceiver();
	  IWorksheetCommand nwc = new NumberWorksheetCommand(numberAdditionWorksheetReceiver);
	  IWorksheetInput worksheetInput=new NumberAdditionInput(20,3,100,200);
	  WorksheetInvoker wsi= new WorksheetInvoker(nwc,worksheetInput);
	  NumberAdditionOutput numberAdditionOutput= (NumberAdditionOutput)wsi.createWorksheet();
	  Map<Integer, NumberAddition> map = numberAdditionOutput.getNumberProblems();
	  for (Map.Entry<Integer, NumberAddition> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
			NumberAddition na=(NumberAddition)entry.getValue();
			for (NumberAdditionFormat num:na.getNumbers()){
				System.out.println(num.getNumber());
			}
			System.out.println("-------------");
			System.out.println("-------------");
	  }
	  //decimal addition
	  
	  DecimalAdditionWorksheetReceiver decimalAdditionWorksheetReceiver = new DecimalAdditionWorksheetReceiver();
	  IWorksheetCommand dwc = new DecimalWorksheetCommand(decimalAdditionWorksheetReceiver);
	  IWorksheetInput decimalWorksheetInput=new DecimalAdditionInput(10,3,100.34,200.45);
	  WorksheetInvoker dwsi= new WorksheetInvoker(dwc,decimalWorksheetInput);
	  DecimalAdditionOutput decimalAdditionOutput= (DecimalAdditionOutput)dwsi.createWorksheet();
	  /*
	  Map<String, List<DecimalAddition>> dmap = decimalAdditionOutput.getDecimalProblems();
	  for (Map.Entry<String, List<DecimalAddition>> entry : dmap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
			for (DecimalAddition na:entry.getValue()){
				System.out.println(na.getNumber());
			}
			System.out.println("-------------");
			System.out.println("-------------");
	  }
	  */
	  //number multiplication
	  
	  NumberMultiplicationWorksheetReceiver numberMultiplicationWorksheetReceiver = new NumberMultiplicationWorksheetReceiver();
	  IWorksheetCommand nmc = new DecimalWorksheetCommand(numberMultiplicationWorksheetReceiver);
	  IWorksheetInput numberMultiplicationlWorksheetInput=new NumberMultiplicationInput(10,90,100,50,60);
	  WorksheetInvoker nmi= new WorksheetInvoker(nmc,numberMultiplicationlWorksheetInput);
	  NumberMultiplicationOutput numberMultiplicationOutput= (NumberMultiplicationOutput)nmi.createWorksheet();
	  Map<Integer, NumberMultiplication> nmap = numberMultiplicationOutput.getMultiplicationProblems();
	  for (Map.Entry<Integer, NumberMultiplication> entry : nmap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
			NumberMultiplication nm=entry.getValue();
			System.out.println(nm.getMultiplicationNumber());
			System.out.println(nm.getMultiplier());
			System.out.println("-------------");
			System.out.println("-------------");
			System.out.println("Answer: "+nm.getAnswer());
	  }
	  
	  NumberSubtractionWorksheetReceiver numberSubtractionWorksheetReceiver = new NumberSubtractionWorksheetReceiver();
	  IWorksheetCommand nsc = new NumberSubtractionWorksheetCommand(numberSubtractionWorksheetReceiver);
	  IWorksheetInput numberSubtractionWorksheetInput=new NumberSubtractionInput(10,90,100,50,60);
	  WorksheetInvoker nsi= new WorksheetInvoker(nsc,numberSubtractionWorksheetInput);
	  NumberSubtractionOutput numberSubtractionOutput= (NumberSubtractionOutput)nsi.createWorksheet();
	  Map<Integer, NumberSubtraction> nsap = numberSubtractionOutput.getSubtractionProblems();
	  for (Map.Entry<Integer, NumberSubtraction> entry : nsap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
			NumberSubtraction ns=entry.getValue();
			System.out.println(ns.getSubtractFrom());
			System.out.println(ns.getSubtractTo());
			System.out.println("-------------");
			System.out.println("-------------");
			System.out.println("Answer: "+ns.getAnswer());
	  }	  
  }
}
