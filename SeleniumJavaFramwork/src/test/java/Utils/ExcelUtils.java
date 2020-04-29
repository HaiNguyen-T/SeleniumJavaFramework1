package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static int rowCount = 0;
	static int colCount = 0;
	static String cellData = null;
	XSSFWorkbook workBook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		getRowCount();
		getColCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
// Constructor
	public ExcelUtils(String filePath, String sheetName) {
		try {
			//String getPath = System.getProperty("user.dir");
			workBook = new XSSFWorkbook(filePath);
			sheet = workBook.getSheet(sheetName);
		}
		catch (Exception exp){
			exp.printStackTrace();
		}

	}
	
	//function getRowCount
	public static int getRowCount() {

		try {
			System.out.println("Called getRowCount");
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of row count is "+ rowCount);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return rowCount;
	} 
	
	//functin getColCount
	public static int getColCount() {
		try {
			System.out.println("Called get colCount");
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of row count is "+ colCount);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return colCount;
	} 
	
	public static String getCellDataString(int rowNum, int cellNum) {
		
		try {
		   cellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("The string cell Data is "+cellData);
		}
	
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return cellData;
	}

	public static void getCellDataNumber(int rowNum, int cellNum) {
	
		try {
			double cellDataDouble = sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
			System.out.println("The numeric cell Data is "+ cellDataDouble);
		}
		
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

}

