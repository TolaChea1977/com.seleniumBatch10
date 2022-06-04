package excelLession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilities.Constants;

public class writeExcelTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream(Constants.excel_filePath);
		//get workbook
		XSSFWorkbook workbook  = new XSSFWorkbook(fs);
		//get sheet index of
		Sheet sheet = workbook.getSheetAt(1);
		//get the last row number
		int lastRow = sheet.getLastRowNum();
		System.out.println(lastRow);
		for (int i = 0; i<=lastRow; i++) {
			Row row = sheet.getRow(i);
			
			Cell cell = row.createCell(1);
			Cell cell2 = row.createCell(2);
			
			cell.setCellValue("Batch-10");
//			cell.setCellValue(""); //to delect
			cell2.setCellValue("Doley Madision");
		}
		
		FileOutputStream fos = new FileOutputStream(Constants.excel_filePath);
		
		workbook.write(fos);
		fos.close();
	}

}
