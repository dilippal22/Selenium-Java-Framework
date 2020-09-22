package com.dgsl.selenium.scenario;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class RandomCheckboxHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-2/checkbox-2.html");

		List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[@class='checkboxes']/li/label/input"));

		Random ram = new Random();

		int nextRandomNum = ram.nextInt(checkBoxes.size());

		if (!checkBoxes.get(nextRandomNum).isSelected()) {

			checkBoxes.get(nextRandomNum).click();

		}

	}

}
