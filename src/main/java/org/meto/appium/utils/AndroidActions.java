package org.meto.appium.utils;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xdgf.usermodel.section.geometry.MoveTo;
import org.meto.appium.pages.FormProposal;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.remote.tracing.Tags;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
//import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;
import static org.testng.Assert.assertNotNull;

public class AndroidActions<W3cActions, AndroidElement, MobileElement> {
	AndroidDriver driver;

	static String numdoc;
	static String nsegment;
	static String casah;
	
	public AndroidActions(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
				"duration",2000));
	}
	
	/*
	public void scrollToEndAction()
	{
		boolean canScrollMore;
		do
		{
		canScrollMore = (Boolean) ((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", ImmutableMap.of(null, null,null,null,null,null,null,null,null,null)
				
			//	ImmutableMap.of("left", 100, "top", 100, "width", 200,"height",200,"direction", "down","percent", 3.0)
		);
		
		}while(canScrollMore);
	}*/
	
	//NO FUNCIONO PARA DROPDOWN DE DEPARTAMETO
	public void scrollToTest() {
		WebElement provdropdown = driver.findElement(By.id("pe.com.surgir.surgirapp:id/form_department"));
		provdropdown.click();
		// Calculate the coordinates to perform the scroll
		int startY = provdropdown.getLocation().getY() + provdropdown.getSize().getHeight();
		int endY = provdropdown.getLocation().getY() - provdropdown.getSize().getHeight();                                                     

		// Perform the scroll	
		TouchAction touchAction2 = new TouchAction(driver);
		touchAction2.press(PointOption.point(0, endY))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(20000)))
		.moveTo(PointOption.point(0, startY))
        .release()
        .perform();
		

	}
		
	public void scrollToPage(WebElement selectProspect, String text2) {
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"AAAAA\"));"));
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));	    
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/atomicNumberDefinition\")).scrollIntoView(new UiSelector().textMatches(\"Autorización de uso de datos personales\").instance(0))")).click();
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\""+selectProspect+"\")).scrollIntoView(new UiSelector().textMatches(\""+text2+"\").instance(0))"));

		
	}
	
	//subi al inicio
	public void scrollToPageCustomer1() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Domicilio\"));"));	
	//	driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Apellido materno\").instance(0))"));
	
	}
	
	public void scrollToPageCustomer2() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Domicilio\").instance(0))"));
		
	}
	
	//bajas hasta cliente iletrado
	public void scrollToPageCustomer3() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/rlFormCustomerGeneral\")).scrollIntoView(new UiSelector().textMatches(\"Cliente iletrado\").instance(0))"));

	}
	
	//bajas hasta ocupacion
	public void scrollToPageCustomer4() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/rlFormCustomerGeneral\")).scrollIntoView(new UiSelector().textMatches(\"Contacto\").instance(0))"));

	}
	
	//bajas hasta informacion complementaria --no ejecuta
	public void scrollToPagerse1() {	
		String locator = "UiScrollable(\"className(\"androidx.recyclerview.widget.RecyclerView\")\").scrollIntoView(resourceId(\"pe.com.surgir.surgirapp:id/rse_subtitle_monthly_business_expenses\"))";
		driver.findElement(MobileBy.AndroidUIAutomator(locator)).click();
		
	}
	
	public boolean scrollTest() {
		try {
			boolean isScrollable = Boolean.valueOf(driver.findElement(By.className("android.widget.ScrollView")).getAttribute("scrollable"));
			if(isScrollable) {
				
				driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				         ".scrollIntoView(new UiSelector().text(\"Activo fijo\"))"));
				return true;
			}else {
				return true;
			}
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	//validando propuesta
	public void testProposal() {
		//scroll
		int count = driver.findElements(By.id("")).size();
		for (int i=0;i<count;i++) {
			String texttasa=driver.findElements(By.id("")).get(i).getText();
			if(texttasa.equalsIgnoreCase("ABC"))
			{
				driver.findElements(By.id("")).get(i).click();
				break;
			}
		}
		//guardar
	}
	
	//calculanto valor total y validando
	public void amountp1() {
		String amount1 = driver.findElements(By.id("")).get(0).getText();
		double amount1value = getAmount(amount1);
		//double amount1value = Double.parseDouble(amount1);
		
		String amount2 = driver.findElements(By.id("")).get(0).getText();
		double amount2value = getAmount(amount2);
		//double amount2value = Double.parseDouble(amount2);
		
		double total1 = amount1value + amount2value;
		System.out.println(total1 + "Monto suma");
		
		String totalneto = driver.findElement(By.id("")).getText();
		double totalvalue = Double.parseDouble(totalneto);
		System.out.println(totalvalue + "Monto total vista");
		
		Assert.assertEquals(total1, totalvalue);
		
	}
	
	public double getAmount(String value)
	{
		double amount1value = Double.parseDouble(value);
		return amount1value;
		
	}
	
	
	//En resourceId se deb poner el id de page
	@Test public void findScrollablerse1() {
		System.out.println("Datos: " + driver.findElements(By.id("pe.com.surgir.surgirapp:id/etInputGeneral")).size());
		WebElement dater = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Activo fijo\").instance(0))"));
	//	WebElement dater1 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/atomicNumberDefinition\")).scrollIntoView(new UiSelector().text(\"Activo fijo\"));"));
		assertNotNull(dater.getLocation());
		
	}
	
	@Test public void findScrollablerse2() {
		System.out.println("Datos: " + driver.findElements(By.id("pe.com.surgir.surgirapp:id/etInputGeneral")).size());
		WebElement dater1 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Resultante pasivo corriente\").instance(0))"));
		assertNotNull(dater1.getLocation());
		dater1.click();
	}
	
	@Test public void findScrollablerse3() {
		System.out.println("Datos: " + driver.findElements(By.id("pe.com.surgir.surgirapp:id/etInputGeneral")).size());
		WebElement dater2 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Pasivo a largo plazo\").instance(0))"));
		assertNotNull(dater2.getLocation());
		
	}
	
	@Test public void findScrollablerse4() {
		System.out.println("Datos: " + driver.findElements(By.id("pe.com.surgir.surgirapp:id/etInputGeneral")).size());
		WebElement dater3 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Gastos familiares mensuales\").instance(0))"));
		assertNotNull(dater3.getLocation());
		
	}
	
	
	
	public void scrolluseData() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/atomicNumberDefinition\")).scrollIntoView(new UiSelector().textMatches(\"Autorización de uso de datos personales\").instance(0))")).click();
	//	driver.findElement(By.id("pe.com.surgir.surgirapp:id/positive_radio_button")).click();
		
	}
	
	public void crollToPageResp () {
		List<WebElement> listsResp = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction action = new TouchAction(driver); 
		action.longPress(PointOption.point(590, 1610)) //(70, 1097)
         .moveTo(PointOption.point(590, 690));  //(70, 800)
		action.release();
		action.perform();
		
		
	}
	
	public void scrollToPageProposal() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Seguro de desgravamen\").instance(0))"));
		
	}
	
	public void scrollToPageBeneficiari() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Seguros asociados\").instance(0))"));
		
	}
	
	public void scrollToPageContract() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Firma de contrato\").instance(0))"));
		
	}
	
	public void scrollToPageSignature() {
	//	driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/primaryScroll\")).scrollIntoView(new UiSelector().textMatches(\"Firma\").instance(0))"));
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Firma\").instance(0))"));

	}
	
	public void scrollToPageSignaturetwo() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/primaryScroll\")).scrollIntoView(new UiSelector().textMatches(\"Descartar\").instance(0))"));

	}
	
	//Cliente
	public void fotoExperiandet() {
		List<WebElement> lists4 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(2), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void fotofrenteDnidet() {
		List<WebElement> lists5 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(2), viewport(), 341, 548));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
		
	public void fotoreversoDnidet() {
		List<WebElement> lists6 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 638, 252));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void fotoClientedet(){
		List<WebElement> lists7 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
        
	}
	
	public void touchAgencia() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListAgency=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListAgency) {
		//	System.out.println(webElementmobileElement); //
		  //      System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("CANTO GRANDE INDIVIDUAL")){  //"CANTO GRANDE INDIVIDUAL"
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void touchRol(String role) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListAgency=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListAgency) {
		//	System.out.println(webElementmobileElement); //
		  //      System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals(role)){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	public void gradoInstruction() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		@SuppressWarnings("unchecked")
		List<MobileElement> ListGinstr=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListGinstr) {
		//	System.out.println(webElementmobileElement);
		  //      System.out.println(((WebElement) webElementmobileElement).getText());
		        String chac = ((WebElement) webElementmobileElement).getText();
		        if(chac.equals("SECUNDARIA")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	public void profesion() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		@SuppressWarnings("unchecked")
		List<MobileElement> ListProf=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListProf) {
			//System.out.println(webElementmobileElement);
		      //  System.out.println(((WebElement) webElementmobileElement).getText());
		        String chac = ((WebElement) webElementmobileElement).getText();
		        if(chac.equals("COMERCIANTE")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void ecivilselected(String ecselc) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		@SuppressWarnings("unchecked")
		List<MobileElement> ListEcivilselect=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListEcivilselect) {
		        String chac = ((WebElement) webElementmobileElement).getText();
		        if(chac.equals(ecselc)){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	//Estado civil
	/*
	public void estadCivil(String ec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		@SuppressWarnings("unchecked")
		List<MobileElement> allListTextec=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListTextec) {
		//	System.out.println(webElementmobileElement);
		     //   System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		      //  if(chab.equals("CASADO")){
		        if(chab.equals(ec)){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}*/
	
	
	public void codigodearea() {
		List<WebElement> lists10 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch10 = new TouchAction<>(driver);
		touch10.press(PointOption.point(64,850));
		touch10.release();
		touch10.perform(); 
		
	}
	
	public void operadordeTelef() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		@SuppressWarnings("unchecked")
		List<MobileElement> ListOpetelf=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListOpetelf) {
		//	System.out.println(webElementmobileElement);
		  //      System.out.println(((WebElement) webElementmobileElement).getText());
		        String chac = ((WebElement) webElementmobileElement).getText();
		        if(chac.equals("CLARO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void fotoComprobanteDomdet() {
		List<WebElement> lists7x = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
        
	}
	
	public void tipoComprobante() {		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			@SuppressWarnings("unchecked")
			List<MobileElement> ListCompPago=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			for (MobileElement webElementmobileElement : ListCompPago) {
			//	System.out.println(webElementmobileElement);
			  //      System.out.println(((WebElement) webElementmobileElement).getText());
			        String chac = ((WebElement) webElementmobileElement).getText();
			        if(chac.equals("Constancia de alojado")){
			        	((WebElement) webElementmobileElement).click();
			        	break;
			        }
			    }		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	/*
	public void fotoComprobDomicilio() {
		List<WebElement> lists14 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		TouchAction touch14 = new TouchAction<>(driver);
		touch14.press(PointOption.point(625,762));
		touch14.release();
		touch14.perform();
		
	}*/
	
	public void fotoConstPatrimonio() {
		List<WebElement> lists14p = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		TouchAction touch14p = new TouchAction<>(driver);
		touch14p.press(PointOption.point(625,762));
		touch14p.release();
		touch14p.perform();
		
	}
	
	//DE CONSULTA EXTERNO
	public void casaHabita() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListText=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListText) {
		//	System.out.println(webElementmobileElement); //
		 //       System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("OTRO")){
		        	((WebElement) webElementmobileElement).click();
		        //		casah = ((WebElement) webElementmobileElement).getText();
		        	break;
		        }
		        casah = ((WebElement) webElementmobileElement).getText();
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void numPersonas() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListNpers=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListNpers) {
			//System.out.println(webElementmobileElement); //
		      //  System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("2")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/*
	public void departament() {
		List<WebElement> lists17 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch17 = new TouchAction<>(driver);
		touch17.press(PointOption.point(85,1069));
		touch17.release();
		touch17.perform();
		
	}*/
	
	public void provincia() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListProv=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListProv) {
		//	System.out.println(webElementmobileElement); //
		  //      System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("LIMA")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void distrito() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListDistri=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListDistri) {
		//	System.out.println(webElementmobileElement); //
		  //      System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("LIMA")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void tipoviac() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListVia=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListVia) {
		//	System.out.println(webElementmobileElement); //
		  //      System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("Calle")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void permanenciaanios() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListPermanen=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListPermanen) {
		//	System.out.println(webElementmobileElement); //
		  //      System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("2")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	public void tiporeferencia() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListTipRef=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListTipRef) {
		    //    System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals("AMIGO (A)")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void tipdoc() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListEntidadB=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListEntidadB) {
		      //  System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals("DNI")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	public void genderCy(String dgender) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListGendercy=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListGendercy) {
		       // System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals(dgender)){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	public void fnacCy(String dfecna) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListFecna=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListFecna) {
		       // System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals(dfecna)){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	public void gradoinsCy(String dginstruc) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListGinst=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListGinst) {
		        //System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals(dginstruc)){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	public void ocupacCy(String docupac) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListOcupac=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListOcupac) {
		        //System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals(docupac)){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	public void tipodoctrCy(String dtdoctr) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListTipDoctr=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListTipDoctr) {
		        //System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals(dtdoctr)){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	//tipodociletrado
	public void tipodocIletr(String tdoctrIl) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListTipDocilt=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListTipDocilt) {
		        //System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals(tdoctrIl)){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	// esta funcionando ok desplazamiento de departamento
	/*
	public void departament1() {
		List<WebElement> lists17 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction action = new TouchAction(driver); 
        action.press(PointOption.point(80, 1057)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(80, 798));
        action.release();
        action.perform();
		
	}*/
	
	public void departament2() {		
		List<WebElement> lists17 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 145, 1140))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),145, 670))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListDepa=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListDepa) {
		//	System.out.println(webElementmobileElement); //
		 //       System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("LIMA")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	public void fotoIletrados () {
	/*	List<WebElement> listsIl = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touchIl = new TouchAction<>(driver);
		touchIl.press(PointOption.point(341,255));
		touchIl.release();
		touchIl.perform();*/
		
		List<WebElement> listsIl = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void metod () {
		//List<WebElement> listsIl = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touchIl = new TouchAction<>(driver);
		touchIl.press(PointOption.point(566,1279));
		touchIl.release();
		touchIl.perform();
		
	}
	
	//Business
	public void fotoExpir() {
		List<WebElement> lists23 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void timeFuncAnios() {
		List<WebElement> lists12 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 84, 1402));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void experAnios() {
		List<WebElement> lists24 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 704, 1402));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void tipoEstabelcim() {
		List<WebElement> lists30 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 728, 1581));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	//RSE
	public void autocompGiro() {
		List lists31 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/rl1"));		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 140, 620));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
	}
	
	public void unidaddemedida() {
		List<WebElement> lists1 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 340, 1082));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
		
	}
	
	public void destinoDeuda() {
		List<WebElement> lists2 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 347, 826));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void fotoConsOtroIng() {
		List<WebElement> lists33 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void origendeOtroIng() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<MobileElement> ListOtrIngr=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListOtrIngr) {
			//System.out.println(webElementmobileElement);
		    //    System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("OTRO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	//Proposal
	
	public void product() {	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListText=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListText) {
		//	System.out.println(webElementmobileElement); //
		   //     System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("CREDITO CONSTRUYENDO SUEÑOS")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void destinopr() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<MobileElement> ListSegBasic=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListSegBasic) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("ACTIVO FIJO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	public void fotoPres() {
		List<WebElement> lists23 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void freccuota() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListFrecCuot=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListFrecCuot) {
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("MES(ES)")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*List<WebElement> lists40 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS); 
		TouchAction touch40 = new TouchAction<>(driver);
		touch40.press(PointOption.point(730,1210));
		touch40.release();
		touch40.perform();*/
		
	}
	
	public void canticuota() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListCantCuot=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListCantCuot) {
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("9")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		List<WebElement> lists39 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch39 = new TouchAction<>(driver);
		touch39.press(PointOption.point(84,1588));
		touch39.release();
		touch39.perform();*/
		
	}
	
	public void segurob() {	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			List<MobileElement> ListSegBasic=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			for (MobileElement webElementmobileElement : ListSegBasic) {
			    //    System.out.println(((WebElement) webElementmobileElement).getText());
			        String chad = ((WebElement) webElementmobileElement).getText();
			        if(chad.equals("DESGRAV PORCENTUAL")){
			        	((WebElement) webElementmobileElement).click();
			        	break;
			        }
			    }		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void seguropt() {	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			List<MobileElement> ListSegOpt=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			for (MobileElement webElementmobileElement : ListSegOpt) {
			        String chad = ((WebElement) webElementmobileElement).getText();
			        if(chad.equals("SUPER SEGURO PLAN 4")){
			        	((WebElement) webElementmobileElement).click();
			        	break;
			        }
			    }		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void tipodocumentoptative() {
		List<WebElement> lists44 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 334, 769));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void sueCivil() {		
		List<MobileElement> ListEcivi=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListEcivi) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("SOLTERO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void suGenero() {
	/*	List<WebElement> lists45x = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch45x = new TouchAction<>(driver);
		touch45x.press(PointOption.point(351,1106)); //FEMENINO
		touch45x.release();
		touch45x.perform(); */
		
		List<MobileElement> ListGener=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListGener) {
			//System.out.println(webElementmobileElement);
		    //    System.out.println(((WebElement) webElementmobileElement).getText());
		        String chadg = ((WebElement) webElementmobileElement).getText();
		        if(chadg.equals("FEMENINO")){
		        	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void scrollToTextRelation() {
		List<WebElement> lists46 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 362, 1540));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	public void seguroAsocia() {
	/*	List<WebElement> lists47 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/txt_view"));
		TouchAction touch47 = new TouchAction<>(driver);
		touch47.press(PointOption.point(334,1460));
		touch47.release();
		touch47.perform(); */
		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 334, 1460));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
		
	//Contract
	public void formadePago() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListFpago=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListFpago) {
			//System.out.println(webElementmobileElement);
		      //  System.out.println(((WebElement) webElementmobileElement).getText());
		        String chapag = ((WebElement) webElementmobileElement).getText();
		        if(chapag.equals("Transferencia")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void entidadFinanciera() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListEntidadB=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListEntidadB) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals("BCP")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	public void fotoCuentas() {
		List lists45 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
	/*	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touch45 = new TouchAction<>(driver);
		touch45.press(PointOption.point(341,255));
		touch45.release();
		touch45.perform();*/
		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(List.of(swipe));
		
	}
	
	//Signature
	public void signatureCustomer() {			
	/*   TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(428, 1228))
	               .moveTo(PointOption.point(697, 1400))
	               .release()
	               .perform();*/
		/*
		 WebElement holdElement= driver.findElementById("element");

		  AndroidTouchAction t = new AndroidTouchAction(driver);   

		  t.longPress(LongPressOptions.longPressOptions()
		  .withElement(ElementOption.element(holdElement))
		  .withDuration(Duration.ofMillis(5000)))
		  .release()
		  .perform();*/
		
		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(PointOption.point(428, 1228))
		           .moveTo(PointOption.point(697, 1400))
		           .release()
		           .perform();
		  
		  
		//  long_press(element_location); 
	/*	  PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger"); 
		  Sequence longpress = new Sequence(finger, 1);
		  longpress.addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(), 428, 1228));
		  longpress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		  longpress.addAction(finger.createPointerMove(Duration.ofMillis(2000),PointerInput.Origin.viewport(), 697, 1400));
		  longpress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));*/
		  

		  
		//  driver.perform(Collections.singletonList(longpress));
		  
	    
		/*
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 428, 1228))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),697, 1400))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));*/
		
	    
	}
	
	public void avance1() {		
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 560, 1460))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),560, 530))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        
		
	}
	
	public void avancebeneseg() {        
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 500, 1268))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),50, 968))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		
	}
	
	
	public void avance2() {
		/*
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.longPress(PointOption.point(556, 1400)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(556, 700)).release().perform();*/
		
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 556, 1400))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),556, 700))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	
	public void avance3cy() {
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.longPress(PointOption.point(600, 1640)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                        .moveTo(PointOption.point(600, 800)).release().perform();
		
	}
	
	public void avance4cy() {
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.longPress(PointOption.point(600, 1640)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                        .moveTo(PointOption.point(600, 560)).release().perform();
		
	}
	
	public void avance5casado() {
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.longPress(PointOption.point(580, 1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(580, 1103)).release().perform(); //580, 1100
		
	}
	
	public void avancersegasto() {
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.longPress(PointOption.point(592, 1586)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(592, 679)).release().perform(); //580, 1100
		
	}
		
	//Capturando numero DNI
	public String numdocdni() {
		     WebElement nnumdniin = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
		     this.numdoc=nnumdniin.getText(); 
		     return numdoc;
			
		}
	
	public void segmentosdat() {
	 //   this.nsegment = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView[2]")).getText();
	     WebElement nsegmentin = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView[2]"));
	     this.nsegment=nsegmentin.getText();
		
	}
	
	public void politics() {
		System.out.println("validando casa habitacion: "+ casah); //+nproposal.segmentos()
		System.out.println("validando segmento "+ nsegment);
		System.out.println("Numero de DNI:" + numdoc);
		
		//String alerttitlenext2 = driver.findElement(By.id("android:id/content")).getText();
	  //  System.out.println(segmento.substring(10, 1));
	    /*
		int valuenext = 2;
		switch (valuenext) {
		  case 1:
			String alerttitle = driver.findElement(By.id("pe.com.surgir.surgirapp:id/tv_pending_policy_title")).getText();
		    System.out.println(alerttitle);
			if(alerttitle.equals("Validación de políticas")) {
				Assert.assertEquals(alerttitle, "Validación de políticas");
				driver.findElement(By.id("pe.com.surgir.surgirapp:id/btn_go_to_policy_module")).click();
				driver.findElement(By.id("pe.com.surgir.surgirapp:id/icon_return_home")).click();
				driver.findElement(By.id("pe.com.surgir.surgirapp:id/iv_module_menu")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@text='Módulo de garantías']")).click();
				}
		    break;
		  case 2:
		  	String alerttitlenext = driver.findElement(By.id("android:id/content")).getText();
		    System.out.println(alerttitlenext);
			if(alerttitlenext.equals("¿Enviar propuesta?")) {
				Assert.assertEquals(alerttitlenext, "¿Enviar propuesta?");
				driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnCancel")).click();
			//	driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnConfirm")).click();
				}
		    break;

		}*/
	}
	
	
	
	public void swipeScreenTwoRsen() {
		String text1 = driver.findElement(By.id("pe.com.surgir.surgirapp:id/rse_title_result_state")).getText();
		System.out.println(text1);
		if(text1.equals("Estado de resultados")) {
			swipeScreen();
		}
		
	}
	
	public void swipeScreenTreeRsen() {
		String text2 = driver.findElement(By.id("pe.com.surgir.surgirapp:id/tv_title_gross_income")).getText();
		System.out.println(text2);
		if(text2.equals("Ingreso bruto")) {
			swipeScreen();
		}else {
			swipeScreen();
		}
		
	}
	
	public void timeExplicit() {
		WebElement nverifica = (WebElement) driver.findElement(By.xpath("//android.widget.Button[@text='Verificar']"));
		nverifica.click();

		//con tiempo explicito
		By byElement = By.id("pe.com.surgir.surgirapp:id/component_datetime_input");
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(nverifica));
	}

	public void swipeAction(WebElement ele,String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
				"direction", direction,
				"percent", 0.75));
		
	}
	
	//Validaciones de Cliente
	public void validPExperian() {
		String pexperian = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Surgir")).getText();
		System.out.println(pexperian);
	//	System.out.println(pexperian.equals("Surgir"));
		
	/*	if(pexperian.isEmpty()) {
			//Assert.assertEquals(ddirecta, "vacio");
			System.out.println("Falta foto experian");
		}else {
			System.out.println("foto experian cargado");
		}*/
	}
	
	//Validaciones de propuesta 
	public void validResponsabilidad() {
	//	String mountPrestamo = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")).getText();
	//	String mountPrestamo = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")).getText();
		String mountPrestamo = driver.findElement(By.xpath("//android.widget.EditText[@hint='Monto del prestamo']")).getText();
		System.out.println("Monto de prestamo:"+mountPrestamo);
		//	String avdirecto =    driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.view.ViewGroup[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")).getText();
	//	WebElement deudirecta = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.view.ViewGroup[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"));
		WebElement deudirecta = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.view.ViewGroup[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"));
	//	WebElement resptotal = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.TextView[3]"));
		WebElement resptotal = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.TextView[3]"));
		//System.out.println("A:"+mountPrestamo);
		//System.out.println("AA:"+deudirecta);
		//System.out.println("AAA:"+resptotal);
		
		/*
		double dmountPrestamo = Double.parseDouble(mountPrestamo); 
	//	double avaldirecto = Double.parseDouble(avdirecto); 
		String cdeudadirecta = deudirecta.getText();
		String responstotal = resptotal.getText();
		
		String deudadirecta = cdeudadirecta.replace(",", "");
		double ndeudadirecta = Double.valueOf(deudadirecta.substring(0, deudadirecta.length()-2));

		String responsabtotal = responstotal.replace(",", "");
		double nresponsabtotal = Double.valueOf(responsabtotal.substring(0, responsabtotal.length()-2));
		
		Double resptotalcalc = dmountPrestamo;//+avaldirecto;
		
		System.out.println("A:"+dmountPrestamo);
	//	System.out.println("B:"+avaldirecto);
		System.out.println("C:"+ndeudadirecta);
		System.out.println("D:"+nresponsabtotal);
		
		System.out.println("E:"+resptotalcalc); // entero
*/
		
	//	Assert.assertEquals(nresponsabtotal, resptotalcalc);
		
	//	if(ddirecta.contains("")) {
		//	Assert.assertEquals(ddirecta, "vacio");
			
	//	}
	}
	
	public void pdownone() {
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(FINGER, 1)
		.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 540, 1315))
	    .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
	    .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),540, 380))//540, 380
	    .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(swipe));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}
	

	public void swipeScreen2() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		int startx=width/2;
		int endx=width/2;
		int starty=(int) (height*.45);
		int endy= (int) (height*.10);
		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(FINGER, 1)
		.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startx, starty))
	    .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
	    .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),endx, endy))
	    .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(swipe));
	}
	
	@Test
	public void swipeScreen() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		int startx=width/2;
		int endx=width/2;
		int starty=(int) (height*.40);//40
		int endy= (int) (height*.10);
		
	/*	TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(startx, starty))
		.moveTo(PointOption.point(endx, endy))
		.release()
		.perform();*/
		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(FINGER, 1)
		.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startx, starty))
	    .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
	    .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),endx, endy))
	    .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(swipe));
		
	}
	

}
