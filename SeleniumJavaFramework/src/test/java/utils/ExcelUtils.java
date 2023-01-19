package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String path ;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelpath, String sheetName){
		
		try {
			
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetName);	
		}
		catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		//getRowCount();
		getcellDataString(0,0);
		getcellDataNumber(1,1);
	}
	
	public static int getRowCount()   {
		
		int rowcount = 0;
		try {
		  rowcount= sheet.getPhysicalNumberOfRows();
			System.out.println("Number of Rows : "+rowcount);
			
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		return rowcount;
	}
	
public static int getColCount()   {
		
	int colcount= 0;
		try {
		 colcount= sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of Rows : "+colcount);
			
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		return colcount;
	}
	public static String getcellDataString(int rownum, int colnum) {
		String celldata= null;
		try {
			
			celldata= sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println("Cell data : " + celldata);
		}
		catch(Exception exp) {
			exp.printStackTrace();
		}
		return celldata;
	}
	
	public static void getcellDataNumber(int rowNum, int colnumNum) {
		try {
			double celldata= sheet.getRow(rowNum).getCell(colnumNum).getNumericCellValue();
			System.out.println("Cell data : " + celldata);
		}
		catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}

}
