package com.dgsl.selenium.scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class AuthenticationAlert {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.get("https://dilip:qwerty@crs.3m.com/");

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("http://username:password@crs.3m.com/");
	}

}
