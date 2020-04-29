package Utils;

public class ExcelDataProvider {
	static int rowCount = 0;
	static int colCount = 0;
	
	public static void main(String[] args) {
		String excelPath = "C:\\Users\\hai_n\\eclipse-workspace\\SeleniumJavaFramwork\\Excel\\TestData.xlsx";
		String sheetName  = "Sheet1";
		testData(excelPath, sheetName);
	}
	public static void testData(String excelPath, String sheetName)
	{
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		rowCount = excel.getRowCount();
		colCount = excel.getColCount();
		
		//i starts at 1 because first row (0) is header
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++)
			{
				String cellData = excel.getCellDataString(i, j);
				System.out.println (cellData + "| ");
			}
		}
		System.out.println("111");
	}

}
