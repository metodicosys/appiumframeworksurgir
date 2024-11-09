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

public class FormContract extends AndroidActions{
	
	AndroidDriver driver;
	
	public FormContract(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de desembolso']")
	private WebElement fpago;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Entidad bancaria']")
	private WebElement entFinan;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Comprobante de cuenta']")
	private WebElement fotoCuen;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de cuenta']")
	private WebElement numcuen;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Código de cuenta interbancario']")
	private WebElement cinterb;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/chkLink")
	private WebElement check1;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/etInputGeneral")
	private WebElement coment;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement savecontr;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextcontr;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;

	
	
	public FormContract formaPago() throws InterruptedException {
		fpago.click();
		Thread.sleep(1000);
		formadePago();
		return this;

	}
	
	public FormContract financialEntity() {
		entFinan.click();
		entidadFinanciera();
		return this;
		
	}
	
	public FormContract fotoCuenta() {
		fotoCuen.click();
		fotoCuen.click();
		fotoCuentas();
		nListo.click();
		return this;
		
	}
	
	public FormContract accountNumber(String ncuen) {
		numcuen.sendKeys(ncuen);
		return this;
		
	}
	
	public FormContract cci(String cinterbank) {
		cinterb.sendKeys(cinterbank);
		return this;
		
	}

	public FormContract linkagePolice() {
		check1.click();
		return this;
		
	}
	
	public FormContract comment(String mesages) {
		coment.sendKeys(mesages);
		return this;
		
	}
	
	public FormContract saveContract() {
		savecontr.click();
		return this;
		
	}
		
	public FormContract nextOneContract() {
		scrollToPageContract();
		return this;
		
	}
	
	public FormSignature nextContract() {
		nextcontr.click();
		//Thread.sleep(1000);
		return new FormSignature(driver);
		
	}
	

}
