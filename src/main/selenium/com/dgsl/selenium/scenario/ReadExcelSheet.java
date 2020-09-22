package com.dgsl.selenium.scenario;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dgsl.util.selenium.Constants;

public class ReadExcelSheet {

	static WebDriver driver;
	static FileInputStream inputStream;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;

	@Test(dataProvider = "inputData")
	public static void testData(String username, String password) {
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://ui.freecrm.com/");

		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

	}

	@DataProvider(name = "inputData")
	public static Object[][] getExcelData() throws IOException {

		inputStream = new FileInputStream(Constants.TEST_DATA);

		workbook = new XSSFWorkbook(inputStream);

		sheet = workbook.getSheet("CRMData");

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		int columnCount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) {
			row = sheet.getRow(i);

			for (int j = 0; j < columnCount; j++) {
				cell = row.getCell(j);
				data[i - 1][j] = cell.getStringCellValue();
			}
		}

		workbook.close();
		return data;
	}

}
