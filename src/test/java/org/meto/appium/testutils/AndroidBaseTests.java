package org.meto.appium.testutils;

import java.io.File;
import java.util.Properties;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AndroidBaseTests {

	public AppiumDriverLocalService service;
	
	/*
	public AppiumDriverLocalService startAppiumServer() {
		Properties prop = new Properties();	
		service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//meto//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		return service;
		
	}*/
}
