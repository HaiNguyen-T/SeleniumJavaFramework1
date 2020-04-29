package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsDemo {
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;
	static String filePath;
	//static String mySheet = "Sheet1";
	//static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userDir = System.getProperty("user.dir");
		//filePath = userDir+"\\Excel\\TestData.xlsx";
		ExcelUtils excel = new ExcelUtils(userDir+"\\Excel\\TestData.xlsx", "Sheet1");
		ExcelUtils.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		
		
	}
		
}
