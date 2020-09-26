package com.dgsl.selenium.waitconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomExplicitWaitUtility {

	static WebDriver driver;

	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void sendKeyValue(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(value);
	}

	public static WebElement getWebElement(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	public static void main(String[] args) {

		clickOn(driver, driver.findElement(By.id("id")), 10);

		sendKeyValue(driver, driver.findElement(By.xpath("//*[Contains(text(),'username')]")), 20, "Dilip");

		getWebElement(driver, driver.findElement(By.xpath("//*[contains(text(),'username')]")), 20);
	}

}
