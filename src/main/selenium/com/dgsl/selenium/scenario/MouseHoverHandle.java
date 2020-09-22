package com.dgsl.selenium.scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.dgsl.util.selenium.Constants;

public class MouseHoverHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://artoftesting.com/sampleSiteForSelenium.html");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Tools Tutorial')]"))).build().perform();

		driver.findElement(By.linkText("Selenium WebDriver")).click();
	}

}
