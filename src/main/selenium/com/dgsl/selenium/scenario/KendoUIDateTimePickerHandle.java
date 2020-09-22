package com.dgsl.selenium.scenario;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class KendoUIDateTimePickerHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		String dateTime = "10/16/2020 2:00 PM";

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");

		WebElement dateTable = driver
				.findElement(By.xpath("//*[@class='k-select']/span[1][@aria-label='Open the date view']"));

		dateTable.click();

		// Element to go to Previous Month
		WebElement previousMonth = driver.findElement(By.xpath("//*[@class='k-header']//child::a[1]"));

		// Element to click on to the header of the Month
		WebElement monthHeader = driver.findElement(By.xpath("//*[@class='k-header']//child::a[2]"));

		// Element to go to Next Month
		WebElement nextMonth = driver.findElement(By.xpath("//*[@class='k-header']//child::a[3]"));

		// Split date time to get only date part
		String[] date = dateTime.split(" ")[0].split("/");

		// Above line of code is same as this
		/*
		 * String[] d1 = dateTime.split(" "); String[] d2 = d1[0].split("/");
		 */

		// Get year difference of Current year and the year which is to set in calendar
		int yearDiff = Integer.parseInt(date[2]) - Calendar.getInstance().get(Calendar.YEAR);

		if (yearDiff != 0) {

			// If need to move to next year
			if (yearDiff > 0) {
				for (int i = 0; i < yearDiff; i++) {

					System.out.println("Year Difference is: " + i);
					monthHeader.click();
					nextMonth.click();
				}
			}

			// If need to move to previous year
			if (yearDiff < 0) {
				for (int i = 0; i < (yearDiff * (-1)); i++) {

					System.out.println("Year Difference is: " + i);
					monthHeader.click();
					previousMonth.click();

				}
			}
		}

		// Get all the months from the calendar to select the desired one
		List<WebElement> allMonth = driver
				.findElements(By.xpath("//table[@class='k-content k-meta-view k-year']/tbody/tr/td"));

		// Get month difference of Current month and the month which is to set in
		// Calendar
		int monthDiff = Integer.parseInt(date[0]) - Calendar.getInstance().get(Calendar.MONTH);

		if (monthDiff != 0) {

			// If need to select next month
			if (monthDiff > 0) {
				for (int i = 0; i < monthDiff; i++) {
					allMonth.get(Integer.parseInt(date[0]) - 1).click();
					// allMonth.get(i).click();

				}
			}

			// If need to select previous month
			if (monthDiff < 0) {
				for (int i = 0; i < (monthDiff * (-1)); i++) {
					allMonth.get(Integer.parseInt(date[0]) - 1).click();
					// allMonth.get(i).click();
				}
			}
		}

		int currentDate = Calendar.getInstance().get(Calendar.DATE);

		// For Time Selection
		WebElement timeDropdown = driver.findElement(By.xpath("//*[@class='k-select']/span[2]"));

		timeDropdown.click();

		// Get list of all Times
		List<WebElement> allTimes = driver.findElements(By.xpath("//*[@id='datetimepicker_timeview']/li"));

		// Splitting DateTime to get only Time
		dateTime = dateTime.split(" ")[1] + " " + dateTime.split(" ")[2];

		// Selecting the desired time
		for (WebElement element : allTimes) {
			if (element.getText().equalsIgnoreCase(dateTime)) {
				element.click();
			}
		}

	}

}
