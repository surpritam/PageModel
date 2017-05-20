package com.Appium.pageModel.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.Appium.pageModel.Pages.LandingPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AbstractTest {

	//initialize driver
	public static AppiumDriver driver;
	
	//initialize the driver only once
	@BeforeClass
	public static void createEnvironment(){
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", System.getProperty("platformName"));
		capabilities.setCapability("platformVersion", System.getProperty("platformVersion"));
		capabilities.setCapability("deviceName", "iPhone Simulator");
		capabilities.setCapability("app", "//Users//pritamsur//Library//Developer//Xcode//DerivedData//UIKitCatalog-dtjxycwtldffllapniniwspstlkh//Build//Products//Debug-iphonesimulator//UIKitCatalog.app");
		capabilities.setCapability("bundleId", "com.example.apple-samplecode.UIKitCatalog");
		try {
			driver =new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//connection to the landing page- Page factory is used to initialize the elements of the landing<next> page
		PageFactory.initElements(new AppiumFieldDecorator(driver), new LandingPage());
	}
	
	@AfterClass
	public static void teardownEnv(){
		driver.quit();
	}
	
}
