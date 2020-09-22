package com.dgsl.selenium.scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.dgsl.util.selenium.Constants;

public class MouseDragAndDropHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");

		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,1000);");
		 */
		// js.executeScript("arguments[0].scrollIntoView(true);", dragElement);

		Actions action = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));

		Thread.sleep(3000);

		action.clickAndHold(driver.findElement(By.xpath("//*[@ondragstart='drag(event)']")))
				.moveToElement(driver.findElement(By.xpath("//*[@ondrop='drop(event)']"))).release().build().perform();

	}

}
