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

	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Cliente\"]")
	private WebElement businessp;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Selfie en el negocio']")
	private WebElement fotonegocio;
	
	//@AndroidFindBy(xpath="//android.widget.RadioButton[@text=No]")
	//private WebElement nodenegocio;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@hint='Tiempo función en años']")
	private WebElement timeanio;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@hint='Experiencia en años']")
	private WebElement expanios;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Inicio de la actividad']")
	private WebElement inicioact;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@hint='Tipo de establecimiento']")
	private WebElement tipoest;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Número de empleados']")
	private WebElement numemp;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement savenegocio;

	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextnegocio;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	public FormBusiness BussinesP() {
		businessp.click();
		return this;

	}
	
	public FormBusiness photoSelfie() {
	//	Thread.sleep(5000);
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
	
	public FormRse nextBusiness() throws InterruptedException  {
		nextnegocio.click();
		return new FormRse(driver);
		
	}
	
	public FormBusiness swipeScreenOneBusiness() {
		swipeScreen();
		return this;
		
	}
}
