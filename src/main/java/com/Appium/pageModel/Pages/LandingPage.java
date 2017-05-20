package com.Appium.pageModel.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Appium.pageModel.utils.AbstractPage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage extends AbstractPage{
	
	//objects
	@FindBy(name="Back")
	private static WebElement navUICatalog;

	
	//method
	public static void clickNavUICatalog(){
		navUICatalog.click();
		PageFactory.initElements(new AppiumFieldDecorator(driver),new CatalogPage());
	}
	

}
