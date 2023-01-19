package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		
		ExcelUtils excel = new ExcelUtils(path + "/excel/data.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getcellDataNumber(1, 1);
		excel.getcellDataString(0, 0);
		

	}

}
