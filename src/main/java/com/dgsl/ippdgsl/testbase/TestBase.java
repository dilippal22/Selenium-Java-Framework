package com.dgsl.ippdgsl.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dgsl.ippdgsl.util.Constants;
import com.dgsl.ippdgsl.util.Resources;

public class TestBase extends Resources {
	
	public TestBase() throws IOException{
		if(driver == null){
			initConfig();
		}
	}

	
	public static void initConfig() throws IOException{
		file = new File(Constants.CONFIG_FILE);
		inputstream = new FileInputStream(file);
		prop.load(inputstream);
	}
	
	
	public static void initBrowser(){
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", Constants.IE_DRIVER);
		}else{
			System.out.println("Invalid Browser Name");
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	}
}
