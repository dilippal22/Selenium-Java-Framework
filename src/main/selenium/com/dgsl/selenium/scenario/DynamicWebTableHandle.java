package com.dgsl.selenium.scenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class DynamicWebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/web-table-element.php");

		WebElement table = driver.findElement(By.xpath("//*[@class='dataTable']/tbody"));

		List<WebElement> tableRows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < tableRows.size(); i++) {

			WebElement eachRow = tableRows.get(i);

			List<WebElement> rowColumn = eachRow.findElements(By.tagName("td"));

			for (int j = 0; j < rowColumn.size(); j++) {

				if (rowColumn.get(j).getText().trim().equalsIgnoreCase("Vakrangee")) {
					System.out.println(rowColumn.get(j).getText());
					rowColumn.get(j).click();

				}
				break;
			}

		}

	}

}
