package com.meritor.ippgeneric.sendmail;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SendMail {

	static WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty(
				"webdriver.gecko.driver",
				"D:\\Project\\IPM\\SendMeritorMail\\browserdriver\\geckodriver-v0.16.0-win64.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://webmail.datamatics.com");
		driver.findElement(By.id("username")).sendKeys("dilip.pal");
		driver.findElement(By.id("password")).sendKeys("pass@098");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Test
	public void EmailTest() throws Exception {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Loop Count: " + i);
			driver.findElement(
					By.xpath("//button[@class='x-btn-text new-mail-icon']"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='to' and @tabindex='4']"))
					.sendKeys("adtzurich.apinvoices@datamatics.co.in");
			/*
			 * driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(
			 * "Invoice");
			 */
			driver.findElement(
					By.xpath("//button[@class='x-btn-text add-attachment-icon']"))
					.click();
			Runtime.getRuntime()
					.exec("D:\\Project\\IPM\\SendMeritorMail\\AutoIT\\VendorDocumentUpload.exe");
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//button[@class='x-btn-text send-icon']"))
					.click();
			Thread.sleep(3000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

		}

		driver.findElement(
				By.xpath("//*[@onclick='return false;' and @href='#']/span"))
				.click();
		driver.findElement(By.xpath("//*[text()='Log out']")).click();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
