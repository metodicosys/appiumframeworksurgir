package org.meto.appium.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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

public class FormBusiness extends AndroidActions{
	
	AndroidDriver driver;
	
	public FormBusiness(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}

	//driver.findElement(By.xpath("//android.widget.TextView[@text='Selfie en el negocio']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Selfie en el negocio']")
	private WebElement fotonegocio;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Tiempo función en años']")).click();
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tiempo función en años']")
	private WebElement timeanio;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Experiencia en años']")).click();
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Experiencia en años']")
	private WebElement expanios;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Inicio de la actividad']")).sendKeys("01/01/2020");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Inicio de la actividad']")
	private WebElement inicioact;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de establecimiento']")).click();
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de establecimiento']")
	private WebElement tipoest;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Número de empleados']")).sendKeys("1");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de empleados']")
	private WebElement numemp;
	
	//	driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessSave")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement savenegocio;

	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessNext")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextnegocio;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	public FormBusiness photoSelfie() {
		fotonegocio.click();
		fotonegocio.click();
		fotoExpir();
		nListo.click();
		return this;
		
	}
	
	public FormBusiness timeAnios() {
		timeanio.click();
		timeFuncAnios();
		return this;
		
	}
	
	public FormBusiness experienciaAnios() {
		expanios.click();
		experAnios();
		return this;
	}
	
	public FormBusiness inicioActividad(String activida) {
		inicioact.sendKeys(activida);;
		return this;
		
	}
	
	public FormBusiness tipoEstabelcimiento() {
		tipoest.click();
		tipoEstabelcim();
		return this;
		
	}
	
	public FormBusiness numEmpleados(String empleado) {
		numemp.sendKeys(empleado);
		return this;
		
	}
	
	public FormBusiness saveBusiness() {
		savenegocio.click();
		return this;
		
	}
	/*
	public FormBusiness nextBusiness() {
		nextnegocio.click();
		return this;
		
	}*/
	
	public FormRse nextBusiness() throws InterruptedException  {
		nextnegocio.click();
		return new FormRse(driver);
		
	}
	
	public FormBusiness swipeScreenOneBusiness() {
		swipeScreen();
		return this;
		
	}
}
