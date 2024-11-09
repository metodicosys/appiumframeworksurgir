package org.meto.appium.pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class FormProspect extends AndroidActions{
	
	AndroidDriver driver;
	String segmentobasedata;
	
	public FormProspect(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}

	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/rlPropuesta")
	private WebElement propuesta;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/icon_return_home")
	private WebElement returnH;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnNuevaPropuesta")
	private WebElement btnPropuest;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnPropuestaHome")
	private WebElement propuestaHome;
	
	
	
	//Prospecto
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de documento']")
	private WebElement numDoc;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Verificar']")
	private WebElement nVerifica;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/component_datetime_input")
	private WebElement fecCaducidad;
	
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Primer nombre']")
	private WebElement firstName;
	
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Segundo nombre']")
	private WebElement secondName;
	
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Apellido paterno']")
	private WebElement firstSurname;
	
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Apellido materno']")
	private WebElement secondSurname;
	
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Fecha de Nacimiento']")
	private WebElement FecNa;
		
	//Teléfono
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Celular']")
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")	
	                  //    /hierarchy/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText
	private WebElement nMobile;	//	android.widget.EditText   //Celular
	
	//Correo
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Correo electrónico personal']")
//	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	                 //      /hierarchy/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText
	private WebElement  nMail;  //Correo electrónico personal
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_submit_prospect")
	private WebElement btnContinuarProspect;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/positive_radio_button")
	private WebElement checkData;
		
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/audp_button_continue")
	private WebElement btnContinuarData;
	
	//segmento en prospecto
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/id_segment")
	private WebElement segmentito;
	
	//Validacion de prospecto
	@AndroidFindBy (xpath="//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat")
	private WebElement mssgeBuro;// de buro
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continuar'][@enabled = 'true']")
	private WebElement btnContinuarValid;
	
	//Para validar campos de propecto
//AndroidFindBy(xpath="//android.widget.TextView[@text='El nombre ingresado no es válido']")
//rivate WebElement validFirstName;
	
	
	
	public FormProspect PropuestaButton() {
		propuesta.click();
		return this;

	}
	
	public FormProspect ReturnButton() {
		returnH.click();
		return this;
		
	}
	
	public FormProspect btnPropuesta () {
		btnPropuest.click();
		return this;
	}
	
	public FormProspect PropuestaHome() {
		propuestaHome.click();
		return this;
		
	}
	
	public FormProspect setNumDoc(String numdoc) {
		numDoc.sendKeys(numdoc);
		return this;
		
	}
		
	public FormProspect Verificando() {
		WebElement nverifica = (WebElement) driver.findElement(By.xpath("//android.widget.Button[@text='Verificar']"));
		nverifica.click();

		//con tiempo explicito
		By byElement = By.id("pe.com.surgir.surgirapp:id/component_datetime_input");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(nverifica));
		return this;
		
	}
		
	public FormProspect setFecCaducidad(String feccaducidad) throws InterruptedException {
		fecCaducidad.sendKeys(feccaducidad);
		Thread.sleep(1000);
		return this;
		
	}
	
	/*
	public FormProspect setFirstName(String firstname) {
		firstName.clear();
		firstName.sendKeys(firstname);
		if(firstname.equals("Automat Teste")) {
			System.out.println("Primer nombre correcto");
		}else {
			System.out.println("Primer nombre incorrecto");
		}
		Assert.assertEquals(firstname, "Automat Teste");
		return this;
		
	}*/
	
	public FormProspect setSecondName(String secondname) {
		secondName.clear();
		secondName.sendKeys(secondname);
		return this;
	}
	
	public FormProspect setSurName(String firstsurname) {
		firstSurname.clear();
		firstSurname.sendKeys(firstsurname);
		return this;

	}
	
	public FormProspect pdown() {
        pdownone();
		return this;
		
	}
	
	
	public FormProspect avance(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 560, 1200))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),560, 1000))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
	    return this;
	    
	}
	
	public FormProspect setFirstName(String firstname) throws InterruptedException {
		firstName.clear();
		firstName.sendKeys("El nombre ingresado");
		System.out.println(firstName.getText());
		String textname = firstName.getText();
		Assert.assertEquals(textname,"El nombre ingresado");
		firstName.clear();
		
		Thread.sleep(1000);
		firstName.sendKeys(firstname);
		return this;
		
	}
	
	
	public FormProspect setCleardata1() {
		secondSurname.clear();
		//FecNa.clear();
		nMobile.clear();
		nMail.clear();
		return this;
		
	}
	
	public FormProspect setSecondSureName(String secondsurname) {
		secondSurname.clear();
		secondSurname.sendKeys(secondsurname);
		return this;
		
	}
	
	public FormProspect setFecNa(String fecna) {
		FecNa.clear();
		FecNa.sendKeys(fecna);
		return this;
		
	}
	
	public FormProspect setnMobile(String nmobile){
		nMobile.clear();
		nMobile.sendKeys(nmobile);
		return this;
		
	}
	
	public FormProspect setnMail(String mail) {
		//nMail.click();
		nMail.clear();
		nMail.sendKeys(mail);
		return this;
		
	}
	
	/*
	public FormProspect validProspect() throws InterruptedException {
	//	fecCaducidad.sendKeys(feccaducidad);
		firstName.clear();
		btnContinuarProspect.click();
		System.out.println(validFirstName.getText());
		Assert.assertEquals(validFirstName.getText(), "El nombre ingresado no es válido");
		Thread.sleep(1000);
		return this;
		
	}*/
	
	public FormProspect btnContinaur1() throws InterruptedException {
	//	fecCaducidad.sendKeys(feccaducidad);
	//	firstName.clear();
		btnContinuarProspect.click();
	//	System.out.println(validFirstName.getText());
	//	Assert.assertEquals(validFirstName.getText(), "El nombre ingresado no es válido");
		Thread.sleep(1000);
		return this;
		
	}

	public FormProspect continuarProspect() {
		btnContinuarProspect.click();
		return this;
		
	}
	
	public FormProspect scrollData() throws InterruptedException {
		scrolluseData();
		Thread.sleep(1000);
		checkData.click();
		return this;
		
	}
	
	public FormProspect validBuro() {
		String toastMessageburo = mssgeBuro.getAttribute("name");
		Assert.assertEquals(toastMessageburo, "- No apto por no aprobar la calificación de los ultimos 6 meses en SBS");
		return this;
		
	}
	
	public FormProspect continuarData() {
		btnContinuarData.click();
		return this;
		
	}
	
	public FormProspect continuaValid() throws InterruptedException {
		btnContinuarValid.click();
		return this;
		
	}
		
	public FormCustomer bcontinuarValid() throws InterruptedException {
		Thread.sleep(5000);
		metod();
		return new FormCustomer(driver);
		
	}
	
	

	
	
}
