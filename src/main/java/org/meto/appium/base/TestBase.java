package org.meto.appium.base;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.utils.AppiumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class TestBase extends AppiumUtils{

	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;
	public static FormPage formPage;
	public static FormProspect formProspect;
	
	
	@BeforeSuite
	//@BeforeClass
	public void setup(ITestContext testContext)  throws IOException{
		Properties prop = new Properties();
		FileInputStream filn = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//meto//appium//resources//data.properties");
		
		String ipAddress = System.getProperty("ipAddress")!=null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
		prop.load(filn);
		String port = prop.getProperty("port");
		service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//meto//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress(ipAddress).usingPort(Integer.parseInt(port)).build();
				service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setDeviceName("samsung SM-T575"); //Active 3   samsung SM-T395
	//	options.setChromedriverExecutable("//AppiumFrameworkSurgir//src//test//resources//driver//chromedriver.exe");
		options.setUdid("RX2RB00S4HN"); //meto 
	//	options.setUdid("RX2RC000F1E"); //meto 2
	//	options.setUdid("RX2R900434R");  // walther
	//	options.setUdid("RX2RB00S5WJ"); //meto xx
		options.setApp("com.android.contacts");
		options.setAutomationName("UiAutomator2");
		options.setCapability("ignoreHiddenApiPolicyError", true);
		options.setCapability("waitForIdleTimeout", 70); //nuevo
		options.setCapability("enableMultiWindows", true);
		options.setCapability("noReset", false);
		options.setCapability("autoGrantPermissions", "true");
		options.setCapability("desableWindowAnimation", "true");
		options.setCapability("logLevel", "error");
		options.setCapability("noSign", true);
		
		options.setChromedriverExecutable(System.getProperty("user.dir")+"//src//test//resources//driver//chromedriver");
		options.setApp(System.getProperty("user.dir")+"//src//test//resources//app//24-10-28_1548_Surgir_debug_6.7.4-guarantees-QA-V4.apk");
	//	options.setApp(System.getProperty("user.dir")+"//src//test//resources//app//23-11-14_1033_Surgir_debug_6.0.11_Release6.0.11.apk"); //de 5 a 11
		
		options.setAppWaitActivity("com.saucelabs.mydemoapp.rn.MainActivity"); //nuevo

		options.setCapability("appWaitActivity", ".ui.login.LoginActivity,.ui.splash.SplashActivity");
		options.setCapability("browserstack.networkLogs", "true");
		
	//	options.setCapability("browserstack.debug", "true");//activar los registros visuales de log
			
		driver = new AndroidDriver(service.getUrl(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		formPage = new FormPage(driver); 	
		formProspect = new FormProspect(driver); 


	}
	

	@AfterSuite
	public void teardown() {
		 driver.quit();
		 service.stop();
		// service.close();
		 
	}

}
