package com.dgsl.phptravels.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.dgsl.phptravels.base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener{
	
	TestUtil testutil;
	
	public void beforeNavigateTo(String url, WebDriver driver){
		System.out.println("Before navigating to: '" + url + "'");
	}
	
	public void afterNavigateTo(String url, WebDriver driver){
		System.out.println("Navigateing to: '" + url + "'");
	}
	
	public void beforeChangeValueOf(WebElement element, WebDriver driver){
		System.out.println("Value of the:" + element.toString() + " before any changes made");
	}
	
	public void afterChangeValueOf(WebElement element, WebDriver driver){
		System.out.println("Element value changed to:" + element.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Trying to click on: " + element.toString());
	}
	
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked on:" + element.toString());		
	}
	
	public void beforeFindBy(By arg0, WebElement element, WebDriver driver){
		System.out.println("Trying to find element by : " +element.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Found element by : " + by.toString());
	}
	
	public void beforeNavigateBack(WebDriver driver){
		System.out.println("Navigating back to previuos page");
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigated back to prevoius page");		
	}
	
	public void beforeNavigateForward(WebDriver element) {
		System.out.println("navigating forward to next page");	
	}

	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("Navigated forward to next page");
	}
	
	public void onException(Throwable error, WebDriver driver){
		System.out.println("Exception occured: " + error);
		try{
		testutil.takeScreenshotAtEndOfTest();
		}catch(Throwable e){
			e.printStackTrace();
		}
	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

}
