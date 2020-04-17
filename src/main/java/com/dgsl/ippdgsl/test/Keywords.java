package com.dgsl.ippdgsl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dgsl.ippdgsl.uiactions.InvoiceUpload;
import com.dgsl.ippdgsl.uiactions.VendorCreation;
import com.dgsl.ippdgsl.util.Resources;

public class Keywords extends Resources{
	
	static VendorCreation vendorcreation;
	static InvoiceUpload invoiceupload;
	
	public static WebElement getWebElement(String locator) throws Exception{
		test = report.startTest("getWebElement");
		//System.out.println("Locator Data : "+ locator + "is--" + prop.getProperty(locator));
		return getLocator(prop.getProperty(locator));
		}
	
	
	public static List<WebElement> getWebElements(String locator) throws Exception{
		return getLocators(prop.getProperty(locator));
		}
	
	
	public static String Navigate() {
		test = report.startTest("Navigate");
		driver.get(webElement);
		return "Pass";
		}
	
	
	public static WebElement getLocator(String locator) throws Exception {
		test = report.startTest("getLocator");
        String[] split = locator.split("--");
		String locatorType = split[0];
		String locatorValue = split[1];

		if (locatorType.toLowerCase().equals("id"))
			return driver.findElement(By.id(locatorValue));
		else if (locatorType.toLowerCase().equals("xpath"))
			return driver.findElement(By.xpath(locatorValue));
		else if (locatorType.toLowerCase().equals("linktext"))
			return driver.findElement(By.linkText(locatorValue));
		else
			throw new Exception("Invalid locator type '" + locatorType + "'");
	}
	
	
	public static List<WebElement> getLocators(String locator) throws Exception {
		test = report.startTest("getLocators");
        String[] split = locator.split("--");
		String locatorType = split[0];
		String locatorValue = split[1];

		if (locatorType.toLowerCase().equals("id"))
			return driver.findElements(By.id(locatorValue));
		else if (locatorType.toLowerCase().equals("xpath"))
			return driver.findElements(By.xpath(locatorValue));
		else if (locatorType.toLowerCase().equals("linktext"))
			return driver.findElements(By.linkText(locatorValue));
		else
			throw new Exception("Invalid locator type '" + locatorType + "'");
	}
	
	
	public static String InputText() {
		test = report.startTest("InputText");
		try {
			getWebElement(webElement).sendKeys(TestData);
			}catch (Throwable t) {
				return "Failed - Element not found " + webElement;
				}
		return "Pass";
		}
	
	
	public static String ClickOnLink() {
		test = report.startTest("ClickOnLink");
		try {
			getWebElement(webElement).click();
			}catch (Throwable t) {
				return "Failed - Element not found " + webElement;
				}
		return "Pass";
		}
	
	
	public static String VerifyText() {
		test = report.startTest("VerifyText");
		try {
			String ActualText= getWebElement(webElement).getText();
			System.out.println("Actual Successful Vendor Registration Message is : " + ActualText);
			if(!ActualText.equals(TestData)) {
				return "Failed - Actual text " + ActualText +" is not equal to to expected text " + TestData;
				}
			}catch (Throwable t){
				return "Failed - Element not found " + webElement;
				}
		return "Pass";
		}
	
	
	public static String expliciteWait() throws Exception {
		test = report.startTest("expliciteWait");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(getWebElement(webElement)));
		return "Pass";
		}
	
	
	public static String SelectActivityNameDropDown() {
		test = report.startTest("SelectActivityNameDropDown");
		return vendorcreation.selectActivity();
		}
	
	
	public static String MouseHoverUserLink(){
		test = report.startTest("MouseHover");
		return vendorcreation.userLink();
	}
	
	
	public static String WaitFor() throws InterruptedException {
		test = report.startTest("WaitFor");
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				return "Failed - Unable To Load Page";
				}
		return "Pass";
		}
	
	
	public static String Alert(){
		test = report.startTest("Alert");
		driver.switchTo().alert().accept();
		return "Pass";
	}
	
	
	public static String GetContactPersonFromTable(){
		test = report.startTest("GetContactPersonFromTable");
		return vendorcreation.contactPerson();
	}
	
	
	public static String GetUsernameFromTable(){
		test = report.startTest("GetUsernameFromTable");
		return vendorcreation.userName();
	}
	
	
	public static String DoubleClickInTransactionTable(){
		test = report.startTest("DoubleClickInTransactionTable");
		try{
			List<WebElement> allTableValue = Keywords.getWebElements("vendor.transactionTableOptions");
			for(WebElement value : allTableValue){
				if(value.getText().equals(TestData)){
				Actions builder = new Actions(driver);
				builder.doubleClick(value).build().perform();
				break;
				}
				}
			}catch(Exception e){
				return "Failed : Unable To Double Click Value in Dropdown";
			}
			return "Pass";
	}
	
	
	public static String DoubleClickInVendorTable(){
		test = report.startTest("DoubleClickInVendorTable");
		try{
			List<WebElement> tableValues = Keywords.getWebElements("vendor.tableValues");
			for(WebElement vendorValue : tableValues){
				if(vendorValue.getText().equals(TestData)){
				Actions builder = new Actions(driver);
				builder.doubleClick(vendorValue).build().perform();
				break;
				}
			}
		}catch(Exception e){
			return "Failed - Unable To Double Click in Vendor Table";
		}
		return "Pass";
	}
	
	
	public static String AutoItUploadFiles(){
		test = report.startTest("UploadFiles");
		return vendorcreation.uploadInvoiceFile();
	}
	
	
	public static String ClickOnUploadInvoiceLink(){
		test = report.startTest("ClickOnUploadInvoiceLink");
		return invoiceupload.uploadInvoiceLink();
	}
	
	
	public static String SelectDocumentTypeDropdown(){
		test = report.startTest("SelectDocumentTypeDropdown");
		return invoiceupload.documentType();
	}
	
	
	public static void Logout(){
		test = report.startTest("Logout");
		vendorcreation.logoutApp();
	}
	
	
	public static void CloseBrowser(){
		test = report.startTest("closeBrowser");
		driver.quit();
		}

}