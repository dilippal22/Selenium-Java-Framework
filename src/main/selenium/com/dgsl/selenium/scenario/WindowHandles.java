package com.dgsl.selenium.scenario;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dgsl.util.selenium.Constants;

public class WindowHandles {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/popup.php");

		driver.findElement(By.xpath("//*[contains(text(),'Click Here')]")).click();

		// Parent Window ID
		String parentWindow = driver.getWindowHandle();

		// All the child window ID
		Set<String> childWindows = driver.getWindowHandles();

		Iterator<String> itr = childWindows.iterator();

		while (itr.hasNext()) {

			String childWindow = itr.next();

			if (!parentWindow.equalsIgnoreCase(childWindow)) {

				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("Guru");
				driver.findElement(By.name("btnLogin")).click();

				driver.close();
			}
		}

		driver.switchTo().window(parentWindow);

		driver.close();

	}

}
