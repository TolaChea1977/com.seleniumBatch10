package excelLession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilities.Constants;

public class readExcelTest {

	public static void main(String[] args) throws IOException  {
		
		DataFormatter objectFormat = new DataFormatter();
		
		FileInputStream fs = new FileInputStream(Constants.excel_filePath);
		XSSFWorkbook workbook  = new XSSFWorkbook(fs);
//		XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
//		Row  row = sheet.getRow(2);
//		Cell cell = row.getCell(0);
//		
//		System.out.println(sheet.getRow(2).getCell(0));
		
		
		//// Automate read all
		
		for (Row row:sheet) {
			for (Cell cell:row) {
				
//				String cellValue = objectFormat.formatCellValue(cell);
//				
//				XSSFCell cells = row.getCell(c);
				
				switch(cell.getCellType()) {
				case STRING: System.out.println(cell.getStringCellValue()); break;
				case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
				
				}
				System.out.println("");
			}
			
			workbook.close();
			
		}
		
//		
//		int rows = sheet.getLastRowNum();
//		int cols = sheet.getRow(1).getLastCellNum();
//		
//		for(int r = 0; r<=rows; r++ ) {
//			XSSFRow row = sheet.getRow(r);
//			for (int c = 0; c<cols; c++) {
//				
//				XSSFCell cells = row.getCell(cell);
//				switch(cell.getCellType()) {
//				case STRING: System.out.println(cell.getStringCellValue()); break;
//				case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
//				case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
//				
				}
//			}
//			System.out.println();
//		}
//			
//	}

}
