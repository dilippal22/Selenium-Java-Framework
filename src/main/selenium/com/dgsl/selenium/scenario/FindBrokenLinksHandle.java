package com.dgsl.selenium.scenario;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class FindBrokenLinksHandle {

	static HttpURLConnection conn;

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://parabank.parasoft.com/");

		// getting all the links from page
		List<WebElement> all_Links = driver.findElements(By.tagName("a"));

		ArrayList<String> URL_list = new ArrayList<String>();

		// adding all the urls in a list
		for (int i = 0; i < all_Links.size(); i++) {
			URL_list.add(all_Links.get(i).getAttribute("href"));

			// creating url object
			try {
				URL url_link = new URL(URL_list.get(i));

				// creating connection object for the URL
				conn = (HttpURLConnection) url_link.openConnection();
			} catch (MalformedURLException e) {
				System.out.println("unable to create URL of the links OR unable to open the connection");
			}

			conn.setRequestMethod("GET");
			conn.setReadTimeout(2000);

			conn.connect();

			if (conn.getResponseCode() == 200) {
				System.out.println("Link is not broken. Status code is: " + conn.getResponseCode() + " and URL is: "
						+ URL_list.get(i));
			} else {
				System.err.println(
						"Link is broken. Status code is: " + conn.getResponseCode() + " and URL is: " + URL_list.get(i));
			}
		}
	}
}
