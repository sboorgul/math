package com.math;

import java.util.List;

import org.springframework.stereotype.Component;


public interface IWorksheetCommand {
  public IWorksheetOutput generate(IWorksheetInput worksheetInput);
}
