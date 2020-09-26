package com.dgsl.selenium.waitconcept;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {

	static WebDriver driver;

	public static void ImplicitWait() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void ExplicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id")));

	}

	public static void FluentWait() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
				.withMessage("Fluent Wait Got Failed");

	}

	public static void main(String[] args) {

		ImplicitWait();

		ExplicitWait();

		FluentWait();

		CustomWaitUtility.isElementPresnt(driver, ".//[contains(text(),'name')]", 10);

		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//To iterate over keys only
		Iterator<Integer> itr = map.keySet().iterator();
		
		//To iterate over Values only
		Iterator<String> itr1 = map.values().iterator();
		
		//To iterate over keys-value pair only
		Iterator<Entry<Integer, String>> itr2 = map.entrySet().iterator();
	}
}
