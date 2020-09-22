package com.dgsl.selenium.scenario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.dgsl.util.selenium.Constants;

public class WriteExcelSheet {

	static FileInputStream inputStream;
	static FileOutputStream outputStream;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;

	public static void writeExcel(String[] valueToWrite) throws IOException {

		inputStream = new FileInputStream(Constants.TEST_DATA);

		workbook = new XSSFWorkbook(inputStream);

		sheet = workbook.getSheet("CRMData");

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		int columnCount = sheet.getRow(0).getLastCellNum();

		row = sheet.createRow(rowCount + 1);

		for (int i = 0; i < columnCount; i++) {

			cell = row.createCell(i);

			cell.setCellValue(valueToWrite[i]);

		}

		inputStream.close();

		outputStream = new FileOutputStream(Constants.TEST_DATA);

		workbook.write(outputStream);

		outputStream.close();
	}

	public static void main(String[] args) throws IOException {

		String[] valueToWrite = { "Dilip", "DGSL" };

		writeExcel(valueToWrite);

	}

}
