package org.meto.api.endpoints;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.network.Network;
//import org.openqa.selenium.devtools.v118.network.Network;

public class CaptureRequest {

	DevTools devTools;
	
	public void capturehttpRequest(WebDriver driver, String setPlatformName) {
		devTools = setPlatformName("Android");
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.addListener(Network.requestWillBeSent(), entry->{
			System.out.println("Request URL is:"+entry.getRequest().getUrl());
			System.out.println("Request type is:"+entry.getRequest().getMethod());
			
		});
		
		 driver.get("workflow");
		
	}

	private DevTools setPlatformName(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
