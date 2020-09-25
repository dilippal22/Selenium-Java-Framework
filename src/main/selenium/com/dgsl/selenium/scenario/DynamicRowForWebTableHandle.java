package com.dgsl.selenium.scenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class DynamicRowForWebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/web-table-element.php");

		WebElement table = driver.findElement(By.xpath("//*[@class='dataTable']/tbody"));

		WebElement tableColumn = table.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[4]"));

		List<WebElement> columnRows = tableColumn.findElements(By.tagName("tr"));

		// Iterating through rows
		for (int i = 0; i < columnRows.size(); i++) {

			WebElement eachRow = columnRows.get(i);

			WebElement checkboxElement = eachRow.findElement(By.id("checkbox"));

			if (!checkboxElement.isDisplayed()) {
				continue;
			} else
				break;

		}

	}
}
