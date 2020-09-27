package com.dgsl.selenium.scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		WebDriver driver = new ChromeDriver();

		driver.get("www.google.com");

	}

}
