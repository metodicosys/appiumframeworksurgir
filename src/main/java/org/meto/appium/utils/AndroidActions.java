package org.meto.appium.utils;

import org.testng.annotations.Test;
import java.sql.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.TapOptions.tapOptions;

public class AndroidActions<W3cActions, AndroidElement, MobileElement> {
	AndroidDriver driver;
//	String segmento = driver.findElement(By.id("pe.com.surgir.surgirapp:id/id_segment")).getText();
	
	public AndroidActions(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
				"duration",2000));
	}
	
	
	public void scrollToEndAction()
	{
		boolean canScrollMore;
		do
		{
		canScrollMore = (Boolean) ((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", ImmutableMap.of(null, null,null,null,null,null,null,null,null,null)
				
			//	ImmutableMap.of("left", 100, "top", 100, "width", 200,"height",200,"direction", "down","percent", 3.0)
		);
		
		}while(canScrollMore);
	}
	
	//NO FUNCIONO PARA DROPDOWN DE DEPARTAMETO
	public void scrollToTest() {
		//pe.com.surgir.surgirapp:id/rol_layout
		//pe.com.surgir.surgirapp:id/form_department
		
		//WebElement provdropdown = driver.findElement(By.xpath("//android.widget.EditText[@text='Departamento']"));
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
	
	public void scrollToTestTwo() {
		//pe.com.surgir.surgirapp:id/rol_layout
		//pe.com.surgir.surgirapp:id/form_department
		
		//WebElement provdropdown = driver.findElement(By.xpath("//android.widget.EditText[@text='Departamento']"));
		WebElement provdropdown = driver.findElement(By.id("pe.com.surgir.surgirapp:id/form_department"));
		provdropdown.click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().description(\"LIMA\")).scrollForward()"));
	//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().description(\"LIMA\")).scrollBackward()"));

		

	}

	
	public void scrollToDepart() {

		//driver.findElement(By.xpath("//android.widget.EditText[@text='Departamento']")).sendKeys("LIMA");

	
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector().scrollable(true).instancia(1)).scrollIntoView(new UiSelector().textContains(\"LIMA\").instance(0);"));
					

	}
	
	public void scrollToPage(WebElement selectProspect, String text2) {
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"AAAAA\"));"));
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));	    
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/atomicNumberDefinition\")).scrollIntoView(new UiSelector().textMatches(\"Autorización de uso de datos personales\").instance(0))")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\""+selectProspect+"\")).scrollIntoView(new UiSelector().textMatches(\""+text2+"\").instance(0))"));

		
	}
	
	//subi al inicio
	public void scrollToPageCustomer1() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Apellido materno\").instance(0))"));

	}
	
	public void scrollToPageCustomer2() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Domicilio\").instance(0))"));
		
	}
		
	public void scrolluseData() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/atomicNumberDefinition\")).scrollIntoView(new UiSelector().textMatches(\"Autorización de uso de datos personales\").instance(0))")).click();
	//	driver.findElement(By.id("pe.com.surgir.surgirapp:id/positive_radio_button")).click();
		
	}
	
	public void scrollToPageProposal() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Seguros\").instance(0))"));
		
	}
	
	public void scrollToPageBeneficiari() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Seguros asociados\").instance(0))"));
		
	}
	
	public void scrollToPageContract() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Firma de contrato\").instance(0))"));
		
	}
	
	public void scrollToPageSignature() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/primaryScroll\")).scrollIntoView(new UiSelector().textMatches(\"Uso de datos personales\").instance(0))"));
	//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/primaryScroll\")).scrollIntoView(new UiSelector().textMatches(\"Uso de datos personales\").instance(0))")).click();

	}
	
	public void scrollToPageSignaturetwo() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/primaryScroll\")).scrollIntoView(new UiSelector().textMatches(\"Descartar\").instance(0))"));
	//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/primaryScroll\")).scrollIntoView(new UiSelector().textMatches(\"Uso de datos personales\").instance(0))")).click();

	}
	
	
	public void touchAgencia(String text) {
		List<WebElement> lists1 = driver.findElements(By.xpath("//android.widget.EditText[@text='"+text+"']"));
		TouchAction touch = new TouchAction<>(driver);
		touch.press(PointOption.point(466, 1048));
		touch.release();
		touch.perform();
		
	}
	
	public void touchRol(String text) {
		List<WebElement> lists1 = driver.findElements(By.xpath("//android.widget.EditText[@text='"+text+"']"));
		TouchAction touch = new TouchAction<>(driver);
		touch.press(PointOption.point(383, 1176));
		touch.release();
		touch.perform();

	}
	
	/*
	public void touchGenero(String text) {
		List<WebElement> lists1 = driver.findElements(By.xpath("//android.widget.EditText[@text='"+text+"']"));
		TouchAction touch = new TouchAction<>(driver);
		touch.press(PointOption.point(250, 549));
		touch.release();
		touch.perform();

	}*/
	
	//Usando DropDown
	/*
	public void gradoInstruction() {
		Select dropdown = new Select(driver.findElement(By.id("pe.com.surgir.surgirapp:id/list")));
	//	dropdown.selectByVisibleText("SECUNDARIA");
	//	dropdown.selectByIndex(1);
		dropdown.selectByValue("SECUNDARIA");
		
	}*/
	
	public void gradoInstruction() {
		List<WebElement> lists8 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch8 = new TouchAction<>(driver);
		touch8.press(PointOption.point(121,1149));
		touch8.release();
		touch8.perform(); 
		
	}

	public void profesion() {
		List<WebElement> lists9 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch9 = new TouchAction<>(driver);
		touch9.press(PointOption.point(731,1082));
		touch9.release();
		touch9.perform(); 
		
	}
	
	public void codigodearea() {
		List<WebElement> lists10 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch10 = new TouchAction<>(driver);
		touch10.press(PointOption.point(64,850));
		touch10.release();
		touch10.perform(); 
		
	}
	
	public void operadordeTelef() {
		List<WebElement> lists11 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch11 = new TouchAction<>(driver);
		touch11.press(PointOption.point(104,887));
		touch11.release();
		touch11.perform();
		
	}
	
	public void tipoComprobante() {
		List<WebElement> lists13 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch13 = new TouchAction<>(driver);
		touch13.press(PointOption.point(131,1092));
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
	
	/*
	public void casaHabita() {
		List<WebElement> lists15 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch15 = new TouchAction<>(driver);
		touch15.press(PointOption.point(67,825)); //69,915
		touch15.release();
		touch15.perform();
		
	}*/
	
	/*// Cuando no tenia lista
	public void casaHabita() {
		List<WebElement> lists15 = driver.findElements(By.className("android.widget.EditText"));
		System.out.println("Count dropdown:"+lists15.size());
        for(WebElement e:lists15)
        {
            String val=e.getText();
    		System.out.println("casa dropdown:"+val);
           
            if(val.equalsIgnoreCase("DE FAMILIARES"))  	
            	
            {
                e.click();
                break;
            }
        }
		
	}*/
	
	//DE CONSULTA EXTERNO
	
	public void casaHabita() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	List<WebElement> elementsx = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")"));   
	//	List<MobileElement> allCheckBoxes=(List<MobileElement>) driver.findElements(By.xpath("//*[@class='android.widget.EditText']"));
		List<MobileElement> allListText=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListText) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("OTRO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	public void numPersonas() {
		List<WebElement> lists16 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch16 = new TouchAction<>(driver);
		touch16.press(PointOption.point(121,1225));
		touch16.release();
		touch16.perform();
	}
	
	public void departament() {
		List<WebElement> lists17 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch17 = new TouchAction<>(driver);
		touch17.press(PointOption.point(85,1069));
		touch17.release();
		touch17.perform();
		
	}
	
	public void provincia() {
		List<WebElement> lists18 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch18 = new TouchAction<>(driver);
		touch18.press(PointOption.point(728	,705));//684
		touch18.release();
		touch18.perform();
		
	}
	
	public void distrito() {
		List<WebElement> lists19 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch19 = new TouchAction<>(driver);
		touch19.press(PointOption.point(108,865));
		touch19.release();
		touch19.perform();
		
	}
	
	public void tipoviac() {
		List<WebElement> lists20x = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch20x = new TouchAction<>(driver);
		touch20x.press(PointOption.point(110,1170));
		touch20x.release();
		touch20x.perform();
		
	}
	
	public void permanenciaanios() {
		List<WebElement> lists21 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch21 = new TouchAction<>(driver);
		touch21.press(PointOption.point(701,1143));
		touch21.release();
		touch21.perform();
		
	}

	public void tiporeferencia() {
		List<WebElement> lists22 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch22 = new TouchAction<>(driver);
		touch22.press(PointOption.point(117,1124));
		touch22.release();
		touch22.perform();	
		
	}
	
	// esta funcionando ok desplazamiento de departamento
	public void departament1() {
		List<WebElement> lists17 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction action = new TouchAction(driver); 
        action.press(PointOption.point(80, 1057)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(80, 798));
        action.release();
        action.perform();
		
	}
	
	public void departament2() {
		List<WebElement> lists17 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction action = new TouchAction(driver); 
        action.press(PointOption.point(145, 1140)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7))) //(70, 1097)
                        .moveTo(PointOption.point(145, 670));  //(70, 800)
        action.release();
        action.perform();
        
		TouchAction touch17 = new TouchAction<>(driver);
		touch17.press(PointOption.point(104,1150));  //(70,1103)
		touch17.release();
		touch17.perform();
		
	}
	
	//Business
	public void fotoExpir() {
		List<WebElement> lists23 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touch23 = new TouchAction<>(driver);
		touch23.press(PointOption.point(341,255));
		touch23.release();
		touch23.perform();
		
	}
	
	public void timeFuncAnios() {
		List<WebElement> lists12 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch12 = new TouchAction<>(driver);
		touch12.press(PointOption.point(84,1402));
		touch12.release();
		touch12.perform();
		
	}
	
	public void experAnios() {
		List<WebElement> lists24 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch24 = new TouchAction<>(driver);
		touch24.press(PointOption.point(704,1402));
		touch24.release();
		touch24.perform(); 
		
	}
	
	public void tipoEstabelcim() {
		List<WebElement> lists30 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch30 = new TouchAction<>(driver);
		touch30.press(PointOption.point(728,1581));
		touch30.release();
		touch30.perform(); 
		
	}
	
	//RSE
	public void autocompGiro() {
		List lists31 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/rl1"));
		TouchAction touch31 = new TouchAction<>(driver);
		touch31.press(PointOption.point(140,253));
		touch31.release();
		touch31.perform(); 
	}
	
	public void unidaddemedida() {
		List<WebElement> lists1 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch1 = new TouchAction<>(driver);
		touch1.press(PointOption.point(340,1082));
		touch1.release();
		touch1.perform(); 
		
	}
	
	public void destinoDeuda() {
		List<WebElement> lists2 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch2 = new TouchAction<>(driver);
		touch2.press(PointOption.point(347,826));
		touch2.release();
		touch2.perform(); 
		
	}
	
	public void fotoConsOtroIng() {
		List<WebElement> lists33 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touch33 = new TouchAction<>(driver);
		touch33.press(PointOption.point(341,255));
		touch33.release();
		touch33.perform();
		
	}
	
	public void origendeOtroIng() {
		List<WebElement> lists35 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch35 = new TouchAction<>(driver);
		touch35.press(PointOption.point(104,1352));//128,750
		touch35.release();
		touch35.perform(); 
		
	}
	
	//Proposal
	
	public void product() {
		List<WebElement> lists37 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch37 = new TouchAction<>(driver);
		touch37.press(PointOption.point(128,988));//145,681  //145,721 SEGUNDO
		touch37.release();
		touch37.perform();
		
	}
	
	public void destinopr() {
		List<WebElement> lists38 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch38 = new TouchAction<>(driver);
		touch38.press(PointOption.point(728,972));
		touch38.release();
		touch38.perform(); 
		
	}

	public void fotoPres() {
		List<WebElement> lists23 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touch23 = new TouchAction<>(driver);
		touch23.press(PointOption.point(341,255));
		touch23.release();
		touch23.perform();
		
	}
	
	public void freccuota() {
		List<WebElement> lists40 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS); 
		TouchAction touch40 = new TouchAction<>(driver);
		touch40.press(PointOption.point(725,1409));
		touch40.release();
		touch40.perform();
		
	}
	
	public void canticuota() {
		List<WebElement> lists39 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch39 = new TouchAction<>(driver);
		touch39.press(PointOption.point(78,1122));
		touch39.release();
		touch39.perform(); 
		
	}
	
	public void segurob() {
		List<WebElement> lists42 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch42 = new TouchAction<>(driver);
		touch42.press(PointOption.point(111,1571));
		touch42.release();
		touch42.perform(); 
		
	}
	
	public void tipodocumentoptative() {
		List<WebElement> lists44 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch44 = new TouchAction<>(driver);
		touch44.press(PointOption.point(334,769));
		touch44.release();
		touch44.perform(); 
		
	}
	
	public void sueCivil() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> lists45 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch45 = new TouchAction<>(driver);
		touch45.press(PointOption.point(351,1399));
		touch45.release();
		touch45.perform(); 
		
	}
	
	public void suGenero() {
		List<WebElement> lists45x = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch45x = new TouchAction<>(driver);
		touch45x.press(PointOption.point(357,1492)); //FEMENINO
		touch45x.release();
		touch45x.perform(); 
		
	}
	
	/*
	public void parentesc() {
		List<WebElement> lists46 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		TouchAction touch46 = new TouchAction<>(driver);
		touch46.press(PointOption.point(264,897)); // arriba 250, 557
		touch46.release();
		touch46.perform();
		
	}*/
	
	public void scrollToTextRelation() {
	//	driver.findElement(By.xpath("//*[@text='Parentesco']")).click(); 
		
	//	driver.findElement(By.id("pe.com.surgir.surgirapp:id/dialog_relationship")).click();
		
	//  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"AMISTAD\"));"));
	//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(textMatches(\"AMISTAD\"));"));
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/dialog_relationship\")).scrollIntoView(new UiSelector().textMatches(\"AMISTAD\").instance(0))"));
		
		List<WebElement> lists46 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch46 = new TouchAction<>(driver);
		touch46.press(PointOption.point(362,1540)); // arriba 250, 557 --- abajo 264,896
		touch46.release();
		touch46.perform();
		
	}
	
	public void seguroAsocia() {
		List<WebElement> lists47 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/txt_view"));
		TouchAction touch47 = new TouchAction<>(driver);
		touch47.press(PointOption.point(234,954));
		touch47.release();
		touch47.perform(); 
		
	}
	
	//Contract
	public void formadePago() {
		List lists43 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		TouchAction touch43 = new TouchAction<>(driver);
		touch43.press(PointOption.point(90,811)); //102, 827
		touch43.release();
		touch43.perform(); 
		
	}
	
	public void entidadFinanciera() {
		List lists44 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch44 = new TouchAction<>(driver);
		touch44.press(PointOption.point(46,567));  //46, 567
		touch44.release();
		touch44.perform(); 
	
	}
	
	public void fotoCuentas() {
		List lists45 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touch45 = new TouchAction<>(driver);
		touch45.press(PointOption.point(229,174));
		touch45.release();
		touch45.perform();
		
	}
	
	//Signature
	public void signatureCustomer() {
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(285, 731))
	               .moveTo(PointOption.point(448, 722))
	               .release()
	               .perform();
	}
	
	public void avance1() {
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.press(PointOption.point(560, 789)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(560, 260)).release().perform();
		
	}
	
	public void avance2() {
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.press(PointOption.point(345, 860)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(345, 462)).release().perform();
		
	}
		
	public void politics() {
		
		FormProposal prospecta = new FormProposal(driver);
		System.out.println(prospecta.segmentos());
		
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
	

}
