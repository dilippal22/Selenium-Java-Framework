package com.dgsl.ippdgsl.uiactions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dgsl.ippdgsl.test.Keywords;
import com.dgsl.ippdgsl.util.Constants;
import com.dgsl.ippdgsl.util.Resources;
import com.dgsl.ippdgsl.util.Xls_Reader;

public class VendorCreation extends Resources{
	
	public static String contactPerson;
	protected static Xls_Reader reader;
	
	public String selectActivity(){
		try{
			Keywords.getWebElement("vendor.activityNameDropdown").click();
			System.out.println("Selecting Activity From Dropdown");
			List<WebElement> allActivityOption = Keywords.getWebElements("vendor.activityAllDropdownOption");
			for(WebElement optionName : allActivityOption){
				if(optionName.getText().equals(TestData)){
					optionName.click();
					break;
				}
			}
		}catch(Exception e){
			return "Failed : Unable To Select Activity From Dropdown";
		}
		return "pass";
	}
	
		
	public String userLink(){
		try{
			WebElement menuOption = Keywords.getWebElement("menu.administrator");
			WebElement subMenuOption = Keywords.getWebElement("menu.userManagement");
			WebElement clickLink = Keywords.getWebElement("submenu.userLink");
			Actions builder = new Actions(driver);
			builder.moveToElement(menuOption).moveToElement(subMenuOption)
					.moveToElement(clickLink).click().build().perform();
		}catch(Exception e){
			return "Failed : Unable To Click On User Link";
		}
		return "Pass";
	}
	
	
	public String contactPerson(){
		try{
		WebElement tableRow = Keywords.getWebElement("vendor.tableRow");
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id='LineItemGrid']/table/tbody/tr[1]/td[2]"));
		contactPerson = cellIneed.getText();
		reader = new Xls_Reader(Constants.TEST_SUITE_DATA);
		reader.setCellData("TC02", "contactperson", 2, contactPerson);
		}catch(Exception e){
			return "Failed - Unable To Select Value";
		}
		return "Pass";
	}
	
	
	public String userName(){
		try{
			WebElement tableRow = Keywords.getWebElement("user.tableRow");
			WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id='example']/tbody/tr/td[3]"));
			String username = cellIneed.getText();
			reader = new Xls_Reader(Constants.TEST_SUITE_DATA);
			reader.setCellData("TC02", "vendorusername", 2, username);
		}catch(Exception e){
			return "Failed - Unable To Select Value";
		}
		return "Pass";
	}
	
	
	/*public String doubleClickTransactionValue(){
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
	}*/
	
	
	/*public String doubleClickVendorValue(){
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
			return "Faile - Unable To Double Click in Vendor Table";
		}
		return "Pass";
	}*/
	
	
	public String uploadInvoiceFile(){
		try {
			Runtime.getRuntime().exec(TestData);
		} catch (IOException e) {
			return "Failed : Unable To Find the File";
		}
		return "Pass";
	}
	
	
	public String logoutApp(){
		try {
			WebElement usernameLinkHover = Keywords.getWebElement("vendor.usernameLinkHover");
			WebElement logoutLink = Keywords.getWebElement("vendor.logoutLink");
			Actions builder = new Actions(driver);
			builder.moveToElement(usernameLinkHover).moveToElement(logoutLink).click().build().perform();
		} catch (Exception e) {
			return "Failed : Unable To Select Activity From Dropdown";
		}
		return "Pass";
	}
}
