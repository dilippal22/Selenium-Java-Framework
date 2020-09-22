package com.dgsl.selenium.scenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.dgsl.util.selenium.Constants;

public class SelectDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER);
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://www.naukri.com/");

		// click on job category dropdown
		driver.findElement(By.xpath("//li[p[text()='Job Category']]//span")).click();

		// get all the options from the dropdown
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='fareaSL']//option"));

		// print last option
		System.out.println("last option is" + allOptions.get(allOptions.size() - 1).getText());

		Actions act = new Actions(driver); // its not always mandatory to use double click
		act.doubleClick(allOptions.get(allOptions.size() - 1)).perform();

		// to confirm what value has been selected inside box String value =
		driver.findElement(By.xpath("//li[p[text()='Job Category']]//span/input")).getAttribute("value");
		System.out.println("the option has been selected is " + "IT");
	}

	public static void main1(String[] args) {

		System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER);

		driver = new FirefoxDriver();
		driver.get("https://makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div//span[2][contains(@class,'flL travelers rght_space room_sec1')]")).click();
		Actions act = new Actions(driver);

		// press down key two times to select 3
		act.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
	}

	public static void main2(String[] args) {

		System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER);

		driver = new FirefoxDriver();
		driver.get("https://makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click on drop down
		WebElement dropdown = driver.findElement(By.id("dropdown_button"));
		dropdown.click();

		// get all the drop down values in a list
		List<WebElement> dropdownValues = dropdown.findElements(By.id("allDropdown_Values"));

		for (WebElement eachValue : dropdownValues) {
			if (eachValue.getText().equals("naukri")) {
				eachValue.click();
				break;
			}
		}
	}

	public static void main3(String[] args) {

		System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER);

		driver = new FirefoxDriver();
		driver.get("https://makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement dropdown = driver.findElement(By.id("dropdown_button"));

		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Dilip");

	}
}
