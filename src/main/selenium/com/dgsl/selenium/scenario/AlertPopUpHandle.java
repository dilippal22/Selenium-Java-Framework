package com.dgsl.selenium.scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class AlertPopUpHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		// Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();

		System.out.println(alertText);

		if (alertText.equals("Please enter a valid user name")) {
			System.out.println("correct alert message");
		} else {
			System.out.println("incorrect alert message");
		}

		alert.accept();

		driver.close();
	}
}
