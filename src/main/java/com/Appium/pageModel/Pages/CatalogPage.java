package com.Appium.pageModel.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Appium.pageModel.utils.AbstractPage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CatalogPage extends AbstractPage {
	
	//Objects on the page
	@FindBy(name ="Steppers")
	private static WebElement uiCatalogSteppers;
	
	
	//Methods to be performed on those objects
	public static void catalogClick(){
		uiCatalogSteppers.click();
		PageFactory.initElements(new AppiumFieldDecorator(driver), new StepperPage());
		
	}
}
