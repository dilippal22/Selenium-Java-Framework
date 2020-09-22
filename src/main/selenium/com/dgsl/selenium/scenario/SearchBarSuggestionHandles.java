/*Scenario: Automate sceanrio where user enters a character in google search bar and it shows lot of suggestions
and user prints all the suggestion on console.*/

package com.dgsl.selenium.scenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class SearchBarSuggestionHandles {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Java");
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));

		for (int i = 0; i < allSuggestions.size(); i++) {
			// System.out.println(allSuggestions.get(i).getText());
			if (allSuggestions.get(i).getText().equalsIgnoreCase("java")) {
				Thread.sleep(5000);
				allSuggestions.get(i).click();
				break;
			}

		}
	}
}
