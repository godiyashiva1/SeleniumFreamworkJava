package utils;

public class ExcelDataProvider {

	public void testData(String excelpath, String sheetName ) {
		
		ExcelUtils excel = new ExcelUtils(excelpath, sheetName);
		
		int rowcount = excel.getRowCount();
		int colcount =excel.getColCount();
		
		for(int i= 1; i<rowcount; i++) {
			
			for(int j=1; j<colcount; j++) {
				
				String celldata = excel.getcellDataString(i, j);
			}
		}
	}
}
