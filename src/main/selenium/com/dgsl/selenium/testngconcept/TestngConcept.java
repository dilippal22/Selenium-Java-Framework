package com.dgsl.selenium.testngconcept;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngConcept {
	
	WebDriver driver;
	
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("BeforeSuite -- Setting System property for Browser");
	}
	
	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("BeforeTest -- Launching Browser");
	}
	
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("BeforeClass -- Entering URL");
	}
	
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("BeforeMethod -- Logging into the Application");
	}
	
	
	@Test
	public void TestCase(){
		System.out.println("TestCase -- Actual Test Case/Test Scenarios");
	}
	
	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("AfterMethod -- Logging out of the Applications");
	}
	
	
	@AfterClass
	public void AfterClass(){
		System.out.println("AfterClass -- Delete All Cookies");
	}
	
	
	@AfterTest
	public void AfterTest(){
		System.out.println("AfterTest -- Closing the Browser");
	}
	
	
	@AfterSuite
	public void AfterSuite(){
		System.out.println("AfterSuite -- Generating Report");
	}

}
