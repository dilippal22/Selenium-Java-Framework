package com.dgsl.selenium.scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class FileUploadHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://fineuploader.com/demos.html");

		// This will work in case of file "type=file" in HTML DOM
		driver.findElement(By.xpath("//*[@id=\"fine-uploader-gallery\"]/div/div[3]/input"))
				.sendKeys("D:\\Dilip\\Wrist Tattoo_1.jpg");

	}

}
