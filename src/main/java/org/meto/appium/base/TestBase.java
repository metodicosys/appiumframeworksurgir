package org.meto.appium.base;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.utils.AppiumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class TestBase extends AppiumUtils{

	public static AndroidDriver driver;
	public AppiumDriverLocalService service;
	public static FormPage formPage;
	public static FormProspect formProspect;
	
	@BeforeSuite
	public static void setup(ITestContext testContext) throws MalformedURLException {
		
		/*
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//meto//appium//resources//data.properties");
		prop.load(fis);
		String ipAddress = prop.getProperty("ipAddress");
		String port = prop.getProperty("port");
		service = startAppiumServer(ipAddress, ,Integer.parseInt(port));
		*/
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setDeviceName("samsung SM-T575"); //Active 3   samsung SM-T395
		options.setUdid("RX2RB00S4HN"); //meto  
		options.setApp("com.android.contacts");
		options.setCapability("ignoreHiddenApiPolicyError", true);
		
		options.setCapability("enableMultiWindows", true);   // nuevo
		options.setChromedriverExecutable(System.getProperty("user.dir")+"//src//test//resources//driver//chromedriver");
	//	options.setCapability("setWindowRect", true);
	//	options.setApp("C://code//AppiumFrameworkSurgir6//src//test//resources//app//Surgir_debug4.5.0_test.apk");
		options.setApp(System.getProperty("user.dir")+"//src//test//resources//app//Surgir_debug_5.3.0_validaagosto_de5.apk"); //de 5 a 11

		options.setAppWaitActivity("com.saucelabs.mydemoapp.rn.MainActivity"); //nuevo

		options.setCapability("appWaitActivity", ".ui.login.LoginActivity,.ui.splash.SplashActivity");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), options);
	//	driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//WebElement msgge = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]"));
		//System.out.println(msgge);
		
		formPage = new FormPage(driver); 

		
		formProspect = new FormProspect(driver); 


	}
	


	@AfterSuite
	public void teardown() {
		 driver.quit();
		 service.stop();
		 
	}

}
