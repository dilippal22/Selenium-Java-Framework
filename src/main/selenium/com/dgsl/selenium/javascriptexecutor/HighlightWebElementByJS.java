package com.dgsl.selenium.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class HighlightWebElementByJS {

	static WebDriver driver;

	public static void highlightWebElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://parabank.parasoft.com/");

		WebElement username = driver.findElement(By.name("username"));
		highlightWebElement(driver, username);
		// username.sendKeys("dilippal22");

		WebElement password = driver.findElement(By.name("password"));
		highlightWebElement(driver, password);
		// password.sendKeys("Qwerty@22");

		WebElement clickBtn = driver.findElement(By.className("button"));
		highlightWebElement(driver, clickBtn);
		// clickBtn.click();

		Thread.sleep(2000);

		driver.quit();
	}

}
