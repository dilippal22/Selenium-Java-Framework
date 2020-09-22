package com.dgsl.selenium.scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.dgsl.util.selenium.Constants;

public class AlertPopUpHandle2 {

	WebDriver driver;

	@Test
	public void verifyAlertPopUpTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));

		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Dilip");
		alert.accept();

		driver.close();
	}
}
