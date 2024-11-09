package org.meto.appium.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public abstract class AppiumUtils {
	
	public static AppiumDriverLocalService service;	
	//Falta 98 -->8:00
	//AppiumDriver driver;
	/*
	public AppiumUtils(AppiumDriver driver){
		this.driver = driver;
		
	}*/
	
	public List<HashMap<String, String>> getJsonData(String jsonFilePath) throws IOException{
	//	String jsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+"//src//test//java//org//meto//appium//testdata//dlogin.json"), StandardCharsets.UTF_8);
	//	String jsonContent = FileUtils.readFileToString(new File(jsonFilePath), StandardCharsets.UTF_8);
		String jsonContent = FileUtils.readFileToString(new File(jsonFilePath), StandardCharsets.UTF_8);
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, String>>>(){
			
		});
		
		return data;
				
	}
	
	public static AppiumDriverLocalService startAppiumServer(String ipAdress, int port) {

			service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//meto//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
			.withIPAddress(ipAdress).usingPort(port).build();
			service.start();
			return service;
			
	}

	
	public void waitForElementToApper(WebElement ele, AppiumDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains((ele), "text", "Cart"));
	}
	
	public String getScreenshotPath(String testCaseName, AndroidDriver driver) throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"//reports"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
		
		
	}

	public void OnStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void OnTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}






