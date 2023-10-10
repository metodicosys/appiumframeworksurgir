package org.meto.appium.pages;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

//import org.asynchttpclient.util.Assertions;
import org.meto.appium.base.TestBase;
import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.offset.PointOption;

//public class FormCustomer extends AndroidActions{
public class FormCustomer extends AndroidActions{

	AndroidDriver driver;
	
	public FormCustomer(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button")
	private WebElement btnContinuarValid;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Cliente\"]")
	private WebElement customerp;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Perfil de Experian']")
	private WebElement fotoExperian;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del documento (Frente)']")
	private WebElement fotoFrenteDNI;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del documento (Verso)']")
	private WebElement fotoVersoDNI;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del cliente']")
	private WebElement fotoCliente;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/form_first_name")
	private WebElement firstName;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement secondName;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/form_father_lastname")
	private WebElement surName;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/form_mother_lastname")
	private WebElement lastName;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Grado de instruccion']")
	private WebElement gradoInstruccionN;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Profesión u ocupación']")
	private WebElement profesionyOcuo;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Pre-pago']")
	private WebElement prepago;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Código de área']")
	private WebElement codarea;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Operador telefónico']")
	private WebElement optelefono;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Teléfono fijo']")
	private WebElement telefonofijo;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de comprobante de domicilio']")
	private WebElement comprobanted;
	
	//foto comprobante de domicilio
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Comprobante domicilio']")
	private WebElement fotocompdomicilio;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='¿La casa que habita es?']")
	private WebElement habita;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='N° personas en domicilio']")
	private WebElement numeropersona;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Otro tipo de domicilio']")
	private WebElement otrotipo;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Departamento']")
	private WebElement departamen;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Provincia']")
	private WebElement provinc;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Distrito']")
	private WebElement distrits;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Barrio/Urbanización']")
	private WebElement urbaniza;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de vía']")
	private WebElement tipovias;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Nombre de la dirección']")
	private WebElement direcc;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='N° exterior de la dirección']")
	private WebElement nexterior;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='N° interior de la dirección']")
	private WebElement interior;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Permanencia en años']")
	private WebElement permanios;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Referencia de ubicación']")
	private WebElement referen;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de dependientes']")
	private WebElement numdepend;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Constancia de patrimonio']")
	private WebElement fotoPatrimoni;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de referencia']")
	private WebElement tiporef;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Nombres']")
	private WebElement nameref;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Apellidos']")
	private WebElement apellref;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Celular']")
	private WebElement cellref;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement savecustom;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextcust;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	
	public FormCustomer CustomerP() {
		customerp.click();
		return this;

	}
			
	public FormCustomer fotoExperian() {
		fotoExperian.click();
		fotoExperian.click();
		List<WebElement> lists4 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		TouchAction touch4 = new TouchAction<>(driver);
		touch4.press(PointOption.point(341,255));
		touch4.release();
		touch4.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer fotofrenteDni() {
		fotoFrenteDNI.click();
		fotoFrenteDNI.click();
		List<WebElement> lists5 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		TouchAction touch5 = new TouchAction<>(driver);
		touch5.press(PointOption.point(341,548));
		touch5.release();
		touch5.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer fotoreversoDni() {
		fotoVersoDNI.click();
		fotoVersoDNI.click();
		List<WebElement> lists6 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		TouchAction touch6 = new TouchAction<>(driver);
		touch6.press(PointOption.point(638,252));
		touch6.release();
		touch6.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer fotoCliente() {
		fotoCliente.click();
		fotoCliente.click();
		List<WebElement> lists7 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		TouchAction touch7 = new TouchAction<>(driver);
		touch7.press(PointOption.point(341,255));
		touch7.release();
		touch7.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer swipeScreenOneCustomer() {
		swipeScreen();
		return this;
		
	}
	
	@Test
	public FormCustomer segundoNombre() {
		secondName.clear();
		String names = secondName.getText();
		
		
		AssertJUnit.assertEquals(1,2,1);
	//	AssertJUnit.assertNotEmpty("name", names);
		AssertJUnit.assertNotNull(null, names);
		AssertJUnit.assertEquals("metp", names, "correcto");
		AssertJUnit.assertEquals("AA", null, "otro");
			
	//	System.err.println(names=="Segundo nombre" || names.isEmpty() || names.length()==0);
	/*	if(names=="Segundo nombre" || names.isEmpty() || names.length()==0) {
			System.out.println("Segundonombre-vacio");
		}*/
		return this;
	
	}
	
	public FormCustomer gradoInstruccion() {
		gradoInstruccionN.click();
		gradoInstruction();
		return this;
	
	}
	
	public FormCustomer profesionN() {
		profesionyOcuo.click();
		profesion();
		return this;
		
	}
	
	public FormCustomer nextone() {
		scrollToPageCustomer1();
		return this;
		
	}
	
	public FormCustomer nexttwoCustomer() {
		scrollToPageCustomer2();
		return this;
		
	}
	
	public FormCustomer prePago() {
		prepago.click();
		return this;
		
	}
	
	public FormCustomer codigoArea() {
		codarea.click();
		codigodearea();
		return this;
		
	}
	
	public FormCustomer operadorTelef() {
		optelefono.click();
		operadordeTelef();
		return this;
		
	}
	
	public FormCustomer telefonoFijo(String fijo) {
		telefonofijo.sendKeys(fijo);
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
		return this;
		
	}
	
	public FormCustomer fotoComprobanteDomicilio() {
		fotocompdomicilio.click();
		fotocompdomicilio.click();
		List<WebElement> lists7x = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		TouchAction touch7x = new TouchAction<>(driver);
		touch7x.press(PointOption.point(341,255));
		touch7x.release();
		touch7x.perform();
		nListo.click();
		return this;
		
	}

	public FormCustomer tipodeComprobante() {
		comprobanted.click();
		tipoComprobante();
		return this;
		
	}
	
	public FormCustomer casaqueHabita() {
		habita.click();
		casaHabita();
		return this;
		
	}
	
	public FormCustomer otrotipoDomicilio(String otrotipod) {
		otrotipo.sendKeys(otrotipod);;
		return this;
		
	}
	
	public FormCustomer personaenDomicilio() {
		numeropersona.click();
		numPersonas();
		return this;
		
	}
	
	public FormCustomer departamentos() {
		departamen.click();
		departament2();
	//	departament();
		return this;
		
	}
	
	public FormCustomer provincias() {
		provinc.click();
		provincia();
		return this;
		
	}
	
	public FormCustomer distritos() throws InterruptedException {
	//	Thread.sleep(2000);
		distrits.click();
		distrito();
		return this;
		
	}
	
	public FormCustomer urbanizacion(String urban) throws InterruptedException {
		Thread.sleep(3000);
		urbaniza.clear();
		urbaniza.sendKeys(urban);
		return this;
		
	}
	public FormCustomer tipoVia() {
		tipovias.click();
		tipoviac();
		return this;
		
	}
	
	public FormCustomer nomDireccion(String namedireccion) {
		direcc.sendKeys(namedireccion);
		return this;
	}
	
	public FormCustomer numExterior(String nexteriorx) {
		nexterior.sendKeys(nexteriorx);
		return this;
	}
	
	public FormCustomer numInterior(String ninterior) {
		interior.sendKeys(ninterior);
		return this;
	}
	
	public FormCustomer permanenciaAnios() {
		permanios.click();
		permanenciaanios();
		return this;
		
	}
	
	public FormCustomer referenciaUbic(String referencia) {
		referen.sendKeys(referencia);
		return this;
		
	}
	
	public FormCustomer numeroDependient(String dependencia) {
	//	numdepend.clear();
		numdepend.sendKeys(dependencia);
		return this;
		
	}
	
	public FormCustomer fotoHeritage() {
		fotoPatrimoni.click();
		fotoPatrimoni.click();
		fotoConstPatrimonio();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer tipoReferencia() {
		tiporef.click();
		tiporeferencia();
		return this;
		
	}
	
	public FormCustomer nameReferenc(String nreferenc) {
		nameref.sendKeys(nreferenc);
		return this;
		
	}
	
	public FormCustomer lastNameRef(String lastnreferen) {
		apellref.sendKeys(lastnreferen);
		return this;
		
	}

	public FormCustomer cellReferenc(String cellderef) {
		cellref.sendKeys(cellderef);
		return this;
		
	}
	
	public FormCustomer saveCustomer() {
		savecustom.click();
		return this;
		
	}
	
	/*
	public FormCustomer nextCustomer() {
		nextcust.click();
		return this;
		
	}*/
	
	public FormBusiness nextCustomer() throws InterruptedException  {
		nextcust.click();
		return new FormBusiness(driver);
		
	}
	
	/*
	public FormCustomer bcontinuarValid() throws InterruptedException {
		Thread.sleep(5000);
		btnContinuarValid.isEnabled();
		btnContinuarValid.click();
		return new FormCustomer(driver);
		
	}*/
	
}
