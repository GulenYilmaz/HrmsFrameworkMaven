package com.hrms.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	private static Workbook book;
	private static Sheet sheet;

	private static void openExcel(String filePath) {
		try {
			FileInputStream fileIS = new FileInputStream(filePath);
			book = new XSSFWorkbook(fileIS);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);
	}

	private static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	private static int colsCount(int rowIndex) {
		return sheet.getRow(rowIndex).getLastCellNum();
	}

	private static String cellData(int rowIndex, int colIndex) {
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
	}

	// return a 2d object array of data
	public static Object[][] excelIntoArray(String filePath, String sheetName) {
		openExcel(filePath);
		loadSheet(sheetName);

		int rows = rowCount();
		int cols = colsCount(0);

		
		
		Object[][] data = new Object[rows - 1][cols];// but we need zero rows to restore our data to 2 dimensional array

		// iterating rows
		for (int i = 1; i < rows; i++) {//we do not need keys or headers //eliminate header

			// iterating cols
			for (int j = 0; j < cols; j++) {
				
				//retrieving value from excel by specified row and colums
				data[i - 1][j] = cellData(i, j);
			}
		}

		return data;
	}

	//HW Create a method that will return a List of Maps
	
	@DataProvider (name="ExcelData")
	public Object [][] excelData(){
	return	ExcelUtility.excelIntoArray(Constants.TESTDATA_FILEPATH, "Sheet1");
		
	}
}