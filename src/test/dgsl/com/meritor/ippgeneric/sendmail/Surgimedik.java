package com.meritor.ippgeneric.sendmail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Surgimedik {

	public static void main(String[] args) throws InterruptedException,
			AWTException {
		System.setProperty(
				"webdriver.gecko.driver",
				"D:\\Project\\IPM\\SendMeritorMail\\browserdriver\\geckodriver-v0.16.0-win64.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://surgimedik.esoftech.in/out/out.UsrMgr.php");
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("12345");
		driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"))
				.click();
		driver.findElement(By.xpath(".//*[@id='menu']/div/ul[2]/li[2]/a"))
				.click();
		driver.findElement(By.xpath(".//*[@id='admin-tools']/div[1]/a[1]"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='form']/table/tbody/tr[9]/td[2]/span/span[1]/span"))
				.click();

		Thread.sleep(3000);
		// List<WebElement> options =
		// driver.findElements(By.xpath("//*[@id='select2-groups-vc-results']"));
		List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id='select2-groups-vc-results']/li"));
		// driver.findElement(By.xpath("//*[@id='select2-groups-vc-results']")).sendKeys(Keys.ARROW_DOWN);
		// System.out.println(options);
		// int optionsSize = options.size();
		// System.out.println(optionsSize);
		for (WebElement singleOption : allOptions) {
			if (singleOption.getText().equalsIgnoreCase("abhishek")) {
				Robot rb = new Robot();
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
			}
		}
		for (WebElement secondOption : allOptions) {
			if (secondOption.getText().equalsIgnoreCase("continue")) {
				Robot rb = new Robot();
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
			}
		}

		/*
		 * Robot rb = new Robot(); rb.keyPress(KeyEvent.VK_ENTER);
		 * rb.keyRelease(KeyEvent.VK_ENTER);
		 */

	}

}
