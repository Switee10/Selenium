package com.TestNG;
//https://codeshare.io/nzB1NV
//import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelUsingApachePOI {
	
	@Test
	public void readData()
	{
		
		XSSFWorkbook workbook=null;
		
		try
		{
			//System.getProperty("user.dir")--> will give the path of the current working directory
			workbook= new XSSFWorkbook(System.getProperty("user.dir")+"exceltitle.xlsx");
			XSSFSheet worksheet= workbook.getSheetAt(0);
			XSSFRow row= worksheet.getRow(0);
			
			//it will return the no. of rows in that specific sheet
			int noOfRows= worksheet.getPhysicalNumberOfRows();
			 
			//it will return the no.of cells in that specific row (row no->1)
			int noOfCells= row.getPhysicalNumberOfCells();
			
			for (int i=1;i<noOfRows;i++)
			{
				for(int j=0;j<noOfCells;j++)
				{
					String cellValue= worksheet.getRow(i).getCell(j).getStringCellValue();
					//String writeValue=worksheet.createRow(6).createCell(0).setCellValue("");
					System.out.println("Cell Value -->"+cellValue);
					
							
				}
			}
			
		}
		catch(Exception ex)
		{
			
		}
	}
	

}

/*
 * four classes for reading excel using Apache POI
 * 
 * XSSFWorkbook
 * XSSFSheet
 * XSSFRow
 * XSSFCell
 * 
 */
