package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class NewTest 
{
  
  @Test
  public void f() throws BiffException, IOException 
  {
	  Workbook wb;
	  Sheet sh = null;
	  File f = new File("C:\\Jayu\\UserDetails.xls");
	  FileInputStream input = new FileInputStream(f);
	  wb = Workbook.getWorkbook(input);
	  sh = wb.getSheet("User_Details");
	  
	  for (int i =0; i<2; i++)
	  {
		  for (int j =0; j<3; j++)
		  {
			  System.out.println("Value "+sh.getCell(i, j).getContents());
		  }
	  }
  }
}
