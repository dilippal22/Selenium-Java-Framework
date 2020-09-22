package com.dgsl.selenium.scenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class SelectDropDown {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://semantic-ui.com/modules/dropdown.html");

		driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[6]/div/input[2]")).click();

		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='menu transition visible']/div"));

		for (int i = 0; i < allOptions.size(); i++) {

			System.out.println(allOptions.get(i).getText());

			if (allOptions.get(i).getText().equalsIgnoreCase("Angola")) {
				allOptions.get(i).click();

			}
		}

	}

}
