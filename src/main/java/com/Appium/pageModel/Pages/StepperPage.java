package com.Appium.pageModel.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Appium.pageModel.utils.AbstractPage;

public class StepperPage extends AbstractPage{
	
	//object
	@FindBy(name="Increment")
	private static WebElement uiIncrement;
	
	@FindBy(name="Back")
	private static WebElement uiNavClick;
	
	//method
	
	public static void increaseCounter(){
		uiIncrement.click();
	}
	
	public static void clickUICatalog(){
		uiNavClick.click();
	}

}
