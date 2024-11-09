package org.meto.appium.utils;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AndroidActionsGuarantor<W3cActions> {

	AndroidDriver driver;
	
	public AndroidActionsGuarantor(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public void tipgarant() {
		List lists44 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch44 = new TouchAction<>(driver);
		touch44.press(PointOption.point(225,715));  //46, 567
		touch44.release();
		touch44.perform(); 
	
	}
	
	public void scrolluseData() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/atomicNumberDefinition\")).scrollIntoView(new UiSelector().textMatches(\"Autorización de uso de datos personales\").instance(0))")).click();
		
	}
	
	public void gradoInstruction() {
		List<WebElement> lists8 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch8 = new TouchAction<>(driver);
		touch8.press(PointOption.point(93,876));
		touch8.release();
		touch8.perform(); 
		
	}
	
	public void profesion() {
		List<WebElement> lists9 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch9 = new TouchAction<>(driver);
		touch9.press(PointOption.point(518,881));
		touch9.release();
		touch9.perform(); 
		
	}
	
	//sube al inicio
	public void scrollToPageCustomer1() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Apellido materno\").instance(0))"));

	}
	
	public void scrollToPageCustomer2() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Domicilio\").instance(0))"));
		
	}
	
	public void codigodearea() {
		List<WebElement> lists10 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch10 = new TouchAction<>(driver);
		touch10.press(PointOption.point(64,839));
		touch10.release();
		touch10.perform(); 
		
	}
	
	public void operadordeTelef() {
		List<WebElement> lists11 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch11 = new TouchAction<>(driver);
		touch11.press(PointOption.point(69,526));
		touch11.release();
		touch11.perform();
		
	}
	
	public void tipoComprobante() {
		List<WebElement> lists13 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch13 = new TouchAction<>(driver);
		touch13.press(PointOption.point(106,740));
		touch13.release();
		touch13.perform();
		
	}
	
	public void fotoComprobDomicilio() {
		List<WebElement> lists14 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		TouchAction touch14 = new TouchAction<>(driver);
		touch14.press(PointOption.point(625,762));
		touch14.release();
		touch14.perform();
		
	}
	
	public void fotoConstPatrimonio() {
		List<WebElement> lists14p = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		TouchAction touch14p = new TouchAction<>(driver);
		touch14p.press(PointOption.point(625,762));
		touch14p.release();
		touch14p.perform();
		
	}
	
	public void casaHabita() {
		List<WebElement> lists15 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch15 = new TouchAction<>(driver);
		touch15.press(PointOption.point(69,915));
		touch15.release();
		touch15.perform();
		
	}
	
	public void numPersonas() {
		List<WebElement> lists16 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch16 = new TouchAction<>(driver);
		touch16.press(PointOption.point(465,903));
		touch16.release();
		touch16.perform();
	}
	
	public void departament() {
		List<WebElement> lists17 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch17 = new TouchAction<>(driver);
		touch17.press(PointOption.point(85,984));
		touch17.release();
		touch17.perform();
		
	}
	
	public void provincia() {
		List<WebElement> lists18 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch18 = new TouchAction<>(driver);
		touch18.press(PointOption.point(490	,903));
		touch18.release();
		touch18.perform();
		
	}
	
	public void distrito() {
		List<WebElement> lists19 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch19 = new TouchAction<>(driver);
		touch19.press(PointOption.point(80,1067));
		touch19.release();
		touch19.perform();
		
	}
	
	public void tipoviac() {
		List<WebElement> lists20 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch20 = new TouchAction<>(driver);
		touch20.press(PointOption.point(62,1097));
		touch20.release();
		touch20.perform();
		
	}
	
	public void permanenciaanios() {
		List<WebElement> lists21 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch21 = new TouchAction<>(driver);
		touch21.press(PointOption.point(465,1073));
		touch21.release();
		touch21.perform();
		
	}

	public void tiporeferencia() {
		List<WebElement> lists22 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch22 = new TouchAction<>(driver);
		touch22.press(PointOption.point(82,586));
		touch22.release();
		touch22.perform();	
		
	}
	
	@Test
	public void swipeScreen() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		int startx=width/2;
		int endx=width/2;
		int starty=(int) (height*.40);
		int endy= (int) (height*.10);
		
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(startx, starty))
		.moveTo(PointOption.point(endx, endy))
		.release()
		.perform();
		
	}
	

//}
	
	
}
