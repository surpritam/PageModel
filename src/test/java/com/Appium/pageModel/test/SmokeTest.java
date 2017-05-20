package com.Appium.pageModel.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.Appium.pageModel.Pages.CatalogPage;
import com.Appium.pageModel.Pages.LandingPage;
import com.Appium.pageModel.Pages.StepperPage;
import com.Appium.pageModel.utils.AbstractPage;

public class SmokeTest extends AbstractPage{
	
	@Test
	public void increamentStepper(){
		LandingPage.clickNavUICatalog();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CatalogPage.catalogClick();
		StepperPage.increaseCounter();
		StepperPage.clickUICatalog();
		
	}
}
