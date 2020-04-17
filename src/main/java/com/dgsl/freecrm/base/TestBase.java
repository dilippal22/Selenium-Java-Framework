package com.dgsl.freecrm.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dgsl.freecrm.util.Constants;
import com.dgsl.freecrm.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static File file;
	public static FileInputStream inputstream;

	public TestBase() {
		file = new File(Constants.CONFIG_FILE);
		try {
			inputstream = new FileInputStream(file);
			prop = new Properties();
			prop.load(inputstream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initBrowser() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER);
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chromer.driver", Constants.CHROME_DRIVER);
			driver = new ChromeDriver();
		} else {
			System.out.println("Invalid browser name");
		}

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLCIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

}
