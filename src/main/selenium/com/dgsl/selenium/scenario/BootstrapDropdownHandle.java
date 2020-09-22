package com.dgsl.selenium.scenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class BootstrapDropdownHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		// clicking on bootstrap drop down
		driver.findElement(By.xpath("//*[@title='HTML, CSS']")).click();

		// getting all the drop down values
		List<WebElement> allOptions = driver
				.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li"));

		System.out.println(allOptions.size());

		for (int i = 0; i < allOptions.size(); i++) {

			System.out.println(allOptions.get(i).getText());

			if (allOptions.get(i).getText().equalsIgnoreCase("java")) {
				allOptions.get(i).click();
				break;
			}
		}
	}

}
