package org.meto.appium.pages;

import java.time.Duration;

import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;

public class FormSignature extends AndroidActions{
	AndroidDriver driver;
	
	public FormSignature(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/chk")).click(); 
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/chk")            
	private WebElement chekone;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/confirmationSignDucAsesorCheckbox")).click(); 
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/confirmationSignDucAsesorCheckbox")
	private WebElement okasesor;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/confirmationSignDucClienteCheckbox")).click(); 
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/confirmationSignDucClienteCheckbox")
	private WebElement okclient;
	
	//driver.findElement(By.xpath("//*[@text='Continuar']")).click();
	@AndroidFindBy(xpath="//*[@text='Continuar']")
	private WebElement nextConfrm;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/id_chk_acepta")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/id_chk_acepta")
	private WebElement okfirma;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/llSaveSign")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/llSaveSign")
	private WebElement savefirmprev;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnGuardar")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnGuardar")
	private WebElement savebtn;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFirmarSeguros")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFirmarSeguros")
	private WebElement finaliza;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/negative_radio_button")).click(); 
	//MobileElement el1 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/negative_radio_button");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/negative_radio_button")
	private WebElement chkusodat;
	
	//driver.findElement(By.xpath("//android.widget.Button[@text='Continuar']")).click();
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continuar']")
	private WebElement continua;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFinalizar")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFinalizar")
	private WebElement envia;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btn_add_guarantee")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_add_guarantee")
	private WebElement agregagarantia;
	
	
	public FormSignature chekFirma() {
		chekone.click();
		return this;
		
	}
	
	public FormSignature confirmaAsesor() {
		okasesor.click();
		return this;
		
	}
	
	public FormSignature confirmaCliente() {
		okclient.click();
		return this;
		
	}
	
	public FormSignature nextConfirm() {
		nextConfrm.click();
		return this;
		
	}
	
	public FormSignature aceptaFirma() {
		okfirma.click();
		return this;
		
	}
	
	public FormSignature saveSignaturePreview() throws InterruptedException {
		savefirmprev.click();
		Thread.sleep(3000);
		return this;
		
	}
	
	public FormSignature saveSignature() {
		savebtn.click();
		return this;
		
	}
	
	public FormSignature finishSignature() {
		finaliza.click();
		return this;
		
	}
	
	public FormSignature checkDate() {
		chkusodat.click();
		return this;
		
	}
	
	public FormSignature nextDate() {
		continua.click();
		return this;
		
	}
	
	public FormSignature politicdate() {
		politics();
		return this;
		
	}
	
	/*
	public FormSignature finishSend() throws InterruptedException {		
		envia.click();
		return this;
		
	}*/
	
	public FormSignature finishSend() throws InterruptedException {		
		envia.click();
				
		
		return this;
		
	}
	
	
	public FormGuarantor addGuarantor() throws InterruptedException  {
		agregagarantia.click();
		Thread.sleep(1000);
		return new FormGuarantor(driver);
		
	}
	
	/*
	public FormSignature nextOneSignature() {
		scrollToPageSignature();
		return this;
		
	}*/
	
	/*
	public FormSignature nextTwoSignature() {
		swipeScreen();
		return this;
		
	}*/

}
