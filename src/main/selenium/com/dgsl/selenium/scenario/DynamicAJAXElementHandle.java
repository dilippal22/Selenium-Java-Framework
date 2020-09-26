package com.dgsl.selenium.scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.dgsl.selenium.waitconcept.CustomExplicitWaitUtility;
import com.dgsl.util.selenium.Constants;

public class DynamicAJAXElementHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/");

		// WebDriverWait wait = new WebDriverWait(driver, 10);

		try {
			WebElement webElementText = driver.findElement(By.linkText("CRUDEOIL"));
			// wait.until(ExpectedConditions.visibilityOf(webElementText)).click();
			CustomExplicitWaitUtility.clickOn(driver, webElementText, 10);

			String actualElementText = webElementText.getText();

			Assert.assertEquals(actualElementText, "CRUDEOIL", "The term 'CRUDEOIL' is not present on the page");
		} catch (NoSuchElementException e) {
			System.out.println("Could click on element. Thrown NoSuchElementException");
		}

		Thread.sleep(2000);

		driver.quit();

	}

}
