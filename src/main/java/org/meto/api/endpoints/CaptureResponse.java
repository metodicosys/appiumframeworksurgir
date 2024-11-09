package org.meto.api.endpoints;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Request;
import org.openqa.selenium.devtools.v85.network.model.Response;
import org.testng.annotations.Test;

public class CaptureResponse {
	//System.setProperty("webdriver.chrome.driver","C:\\full_path\\Driver\\chromedriver.exe");
	
	ChromeDriver driver;
	
	@Test
	public void captureTest() {
		driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.addListener(Network.requestWillBeSent(), requestConsumer ->{
			Request request = requestConsumer.getRequest();
			System.out.println(request.getUrl());
		});
		
		devTools.addListener(Network.responseReceived(), responseConsumer->{
			Response response = responseConsumer.getResponse();
			System.out.println(response.getStatus()+""+response.getUrl());
			
			if(response.getUrl().contains("natural-persons")) {
				System.out.println("RRRRR: "+response.getUrl());
				
			}
		});
		
		
	driver.get("https://stg.api.customers.saf-pe.cobiscloud.com/generic/v2/customers/natural-persons/by-identification");
		
	}
	

}
