package com.datamatics.meritor.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.datamatics.meritor.util.Constants;
import com.datamatics.meritor.util.TestUtil;

public class TestBase {

	private static WebDriver driver;

	protected static File file;
	protected static FileInputStream inputStream;
	protected static Properties prop;

	private static TestBase testBase_Instance = null;

	protected TestBase() {

		file = new File(Constants.CONFIG_FILE);
		try {
			inputStream = new FileInputStream(file);
			prop = new Properties();
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER);
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					Constants.CHROME_DRIVER);
		} else {
			System.out.println("Invalid Browser Name!");
		}

		TestBase testBase = TestBase.testBaseInstance();

		WebDriver driver_instance = testBase.getDriver();

		driver_instance.manage().window().maximize();

		driver_instance.manage().deleteAllCookies();

		driver_instance.manage().timeouts()
				.implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver_instance.get(prop.getProperty("url"));

	}

	public static TestBase testBaseInstance() {
		if (testBase_Instance == null) {
			testBase_Instance = new TestBase();
		}
		return testBase_Instance;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
