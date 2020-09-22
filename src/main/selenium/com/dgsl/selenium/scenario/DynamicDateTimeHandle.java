package com.dgsl.selenium.scenario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class DynamicDateTimeHandle {

	static WebDriver driver;

	public static void selectDate(WebDriver driver, WebElement calendar, String year, String monthName, String day) {

		calendar.click();
		
		//Get current year from Calendar
		driver.findElement(By.xpath(""));
	}

	// Get Java month number
	public static int getMonthNumber(String monthName) {

		Date date = null;
		try {
			date = new SimpleDateFormat("MMMM").parse(monthName);
		} catch (ParseException e) {
			System.out.println("Unable to Parse month name");
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.MONTH);
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.makemytrip.com/");

		WebElement departCal = driver.findElement(By.id("departure"));

		selectDate(driver, departCal, "2019", "October", "23");
	}

}
