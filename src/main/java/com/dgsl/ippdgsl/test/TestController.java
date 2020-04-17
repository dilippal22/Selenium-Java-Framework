package com.dgsl.ippdgsl.test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.dgsl.ippdgsl.testbase.TestBase;
import com.dgsl.ippdgsl.util.Resources;
import com.dgsl.ippdgsl.util.ScreenshotUtil;
import com.dgsl.ippdgsl.util.WebEventListener;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class TestController extends Resources{
	
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	@BeforeMethod
	public void initBrowser() throws IOException{
		Initialize();
		}
	
	
	@BeforeTest
	public void setExtent(){
		report = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReport.html", true);
		report.addSystemInfo("Host Name", "Dilip - PC");
		report.addSystemInfo("Username", "dilip.pal");
		report.addSystemInfo("Environment", "Test");
	}
	
	
	@Test
	public void TestCaseController() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, IOException, InvocationTargetException {
		//test = report.startTest("TestCaseController");
		
		// loop through the test cases
		for(int TC=2; TC<=TestSuite.getRowCount("TestCases"); TC++) {
			
			String TestCaseID = TestSuite.getCellData("TestCases", "TCID", TC);
			String RunMode = TestSuite.getCellData("TestCases", "RunMode", TC);
			
			if(RunMode.equals("Y")){
				
				String TSStatus="Pass";
				
				new TestBase();
				
				TestBase.initBrowser();
				
				e_driver = new EventFiringWebDriver(driver);
				// Now create object of EventListerHandler to register it with EventFiringWebDriver
				eventListener = new WebEventListener();
				e_driver.register(eventListener);
				driver = e_driver;
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				int rows = TestSuiteData.getRowCount(TestCaseID);
				if(rows<2) { 
				rows=2;
				}		
				
				//loop through test data
				for(int TD=2;TD<=rows;TD++ ) {
				
					// loop through the test steps				
					for(int TS=2; TS<=TestSuite.getRowCount(TestCaseID); TS++) {
					
					keyword = TestSuite.getCellData(TestCaseID, "Keyword", TS);
					webElement = TestSuite.getCellData(TestCaseID, "WebElement", TS);
					TSID = TestSuite.getCellData(TestCaseID, "TSID", TS);
					Description = TestSuite.getCellData(TestCaseID, "Description", TS);
					
					TestDataField = TestSuite.getCellData(TestCaseID, "TestDataField", TS);
						
						
					TestData = TestSuiteData.getCellData(TestCaseID, TestDataField, TD);
									
						Method method = Keywords.class.getMethod(keyword);
						TSStatus = (String) method.invoke(method);
						
						if(TSStatus.contains("Fail")){
							//Take the Screenshot
							String fileName = Thread.currentThread().getStackTrace()[1].toString();
							ScreenshotUtil.getScreenshot(fileName);
						}
					}
				}
			}
		}
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		if(result.getStatus() == ITestResult.SUCCESS){
			test.log(LogStatus.PASS, "Test Case Passed is : " + result.getName());
			}else if(result.getStatus() == ITestResult.FAILURE){
				test.log(LogStatus.FAIL, "Test Case Failed is : " + result.getName());
				test.log(LogStatus.FAIL, "Test Case Failed is : " + result.getThrowable());
				
				String screenshotPath = ScreenshotUtil.getScreenshot(result.getName());
				//To Attach screenshot in report
				test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
			}else if(result.getStatus() == ITestResult.SKIP){
				test.log(LogStatus.SKIP, "Test Skipped is : " + result.getName());
			}
		
		report.endTest(test);
		driver.quit();
	}
	
	
	@AfterTest
	public void endReport() throws IOException{
	report.flush();
	report.close();
	}
}
	