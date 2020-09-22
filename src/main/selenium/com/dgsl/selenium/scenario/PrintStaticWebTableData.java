package com.dgsl.selenium.scenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class PrintStaticWebTableData {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/table.html");

		WebElement table = driver.findElement(By.xpath("html/body/table/tbody"));

		List<WebElement> tableRows = table.findElements(By.tagName("tr"));

		int rowCount = tableRows.size();

		for (int i = 0; i < rowCount; i++) {

			// To get all the cell of that specific row
			List<WebElement> tableColumn = tableRows.get(i).findElements(By.tagName("td"));

			int columnCount = tableColumn.size();

			System.out.println("Number of Cell in a Row " + i + " are: " + columnCount);

			for (int j = 0; j < columnCount; j++) {

				// To retrieve cell from specific cell
				String cellText = tableColumn.get(j).getText();

				System.out.println("Cell Value of Row Number " + i + " and Column Number " + j + " is " + cellText);
			}
			System.out.println("");
		}

	}

}
