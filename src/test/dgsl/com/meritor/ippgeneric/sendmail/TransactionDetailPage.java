package com.meritor.ippgeneric.sendmail;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TransactionDetailPage {
	static WebDriver driver;
	static Robot keyboard;

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty(
				"webdriver.chrome.driver",
				"D:\\Project\\IPM\\SendMeritorMail\\browserdriver\\chromedriver-v2.36-win32.exe");
		driver = new ChromeDriver();
		driver.get("http://172.1.254.215:81/Meritor/");
		driver.manage().window().maximize();

//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.id("User_Name")).sendKeys("puser2");
		driver.findElement(By.id("User_Password")).sendKeys("Sysadmin@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
	}

	@Test
	public void TransactionPage() throws Exception {
		driver.findElement(
				By.xpath("//select[@id='selectActivityCode']/parent::span"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//ul[@id='selectActivityCode_listbox']/li[6]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='viewTransaction']")).click();		
		Thread.sleep(5000);

		String Currency = driver.findElement(By.id("FielSaveInvoice_Currency"))
			.getAttribute("value");

		while (Currency.equalsIgnoreCase("EUR")) {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By
					.xpath("//*[@class='k-input' and text()='--Please Select--']")));
			
			WebElement tranDropdown = driver.findElement(
					By.xpath("//*[@class='k-input' and text()='--Please Select--']"));
			
			tranDropdown.click();

			keyboard = new Robot();
			keyboard.keyPress(KeyEvent.VK_DOWN);
			keyboard.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);

			keyboard.keyPress(KeyEvent.VK_DOWN);
			keyboard.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);

			keyboard.keyPress(KeyEvent.VK_ENTER);
			keyboard.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

			WebElement submitBtn = driver.findElement(By.id("Update2"));
			submitBtn.click();
			System.out.println("First Submit Click performed!!");
//			Thread.sleep(2000);
			
			/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(20, TimeUnit.SECONDS)
			.pollingEvery(2, TimeUnit.SECONDS)
			.ignoring(ElementNotVisibleException.class);
			
			wait.until(ExpectedConditions.visibilityOf(submitBtn));
			submitBtn.click();*/	
			
			wait.until(ExpectedConditions.visibilityOf(submitBtn));	
			
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
			submitBtn.click();

			/*Actions action = new Actions(driver);
			action.moveToElement(submitBtn).click().perform();*/
			
			/*JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", submitBtn);*/
			
			Thread.sleep(6000);
			
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
