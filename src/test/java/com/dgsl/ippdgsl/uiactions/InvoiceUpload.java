package com.dgsl.ippdgsl.uiactions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dgsl.ippdgsl.test.Keywords;
import com.dgsl.ippdgsl.util.Resources;

public class InvoiceUpload extends Resources{
	
	public String documentType(){
		try{
			Keywords.getWebElement("invoiceupload.documentType").click();
			List<WebElement> dropdownOptions = Keywords.getWebElements("invoiceupload.documenttypeoption");
			for(WebElement optionName : dropdownOptions){
				if(optionName.getText().equalsIgnoreCase(TestData)){
					optionName.click();
					break;
				}
			}
		}catch(Exception e){
			return "Failed : Unable To Select Document Type From Dropdown";
		}
	return "Pass";
	}
	
	
	public String uploadInvoiceLink(){
		try{
			WebElement menuOption = Keywords.getWebElement("menu.vendor");
			WebElement subMenuOption = Keywords.getWebElement("submenu.invoiceLink");
			WebElement clickLink = Keywords.getWebElement("submenu.invoiceUploadLink");
			Actions builder = new Actions(driver);
			builder.moveToElement(menuOption).moveToElement(subMenuOption)
					.moveToElement(clickLink).click().build().perform();
		}catch(Exception e){
			return "Failed : Unable To Click On Upload Invoice Link";
		}
		return "Pass";
	}
}
