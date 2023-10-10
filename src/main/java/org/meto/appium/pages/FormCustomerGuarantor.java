package org.meto.appium.pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.meto.appium.utils.AndroidActionsGuarantor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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
public class FormCustomerGuarantor extends AndroidActionsGuarantor{

	AndroidDriver driver;
	
	public FormCustomerGuarantor(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	//Boton continuar despues de las validaciones de buro, lista negra
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/summary_button_continue")
	// /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button
	//	/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button")
	private WebElement btnContinuarValid;
	
	//MobileElement el1c = (MobileElement) driver.findElementByAccessibilityId("Cliente");
	//@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Cliente\"]")
	//private WebElement customerp;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Perfil de Experian']")
	private WebElement fotoExperian;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del documento (Frente)']")
	private WebElement fotoFrenteDNI;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del documento (Verso)']")
	private WebElement fotoVersoDNI;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del cliente']")
	private WebElement fotoCliente;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement secondSurname;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Grado de instruccion']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Grado de instruccion']")
	private WebElement gradoInstruccionN;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Profesión u ocupación']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Profesión u ocupación']")
	private WebElement profesionyOcuo;
	
	//driver.findElement(By.xpath("//android.widget.RadioButton[@text='Pre-pago']")).click();	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Pre-pago']")
	private WebElement prepago;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Código de área']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Código de área']")
	private WebElement codarea;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Operador telefónico']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Operador telefónico']")
	private WebElement optelefono;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Teléfono fijo']")).sendKeys("762352");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Teléfono fijo']")
	private WebElement telefonofijo;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de comprobante de domicilio']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Tipo de comprobante de domicilio']")
	private WebElement comprobanted;
	
	//foto comprobante de domicilio
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Comprobante domicilio']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Comprobante domicilio']")
	private WebElement fotocompdomicilio;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='¿La casa que habita es?']")).click();	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='¿La casa que habita es?']")
	private WebElement habita;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='N° personas en domicilio']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='N° personas en domicilio']")
	private WebElement numeropersona;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Otro tipo de domicilio']")).sendKeys("Otro tipo");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Otro tipo de domicilio']")
	private WebElement otrotipo;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Departamento']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Departamento']")
	private WebElement departamen;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Provincia']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Provincia']")
	private WebElement provinc;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Distrito']")).click();	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Distrito']")
	private WebElement distrit;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Barrio/Urbanización']")).sendKeys("mibarrio");	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Barrio/Urbanización']")
	private WebElement urbaniza;
	
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de vía']")).click();	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Tipo de vía']")
	private WebElement tipovias;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Nombre de la dirección']")).sendKeys("Mi dirección");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Nombre de la dirección']")
	private WebElement direcc;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='N° exterior de la dirección']")).sendKeys("500");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='N° exterior de la dirección']")
	private WebElement nexterior;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='N° interior de la dirección']")).sendKeys("100");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='N° interior de la dirección']")
	private WebElement interior;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Permanencia en años']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Permanencia en años']")
	private WebElement permanios;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Referencia de ubicación']")).sendKeys("Mi referencia");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Referencia de ubicación']")
	private WebElement referen;

	//driver.findElement(By.xpath("//android.widget.EditText[@text='Número de dependientes']")).sendKeys("1");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de dependientes']")
	private WebElement numdepend;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Constancia de patrimonio']")
	private WebElement fotoPatrimoni;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de referencia']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Tipo de referencia']")
	private WebElement tiporef;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Nombres']")).sendKeys("Nom referencia");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Nombres']")
	private WebElement nameref;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Apellidos']")).sendKeys("Ap referencia");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Apellidos']")
	private WebElement apellref;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Celular']")).sendKeys("911111111");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Celular']")
	private WebElement cellref;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessSave")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement savecustom;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessNext")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextcust;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	/*
	public FormCustomerGuarantor CustomerP() {
		customerp.click();
		return this;

	}*/
			
	public FormCustomerGuarantor fotoExperian() {
		fotoExperian.click();
		fotoExperian.click();
		List<WebElement> lists4 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		TouchAction touch4 = new TouchAction<>(driver);
		touch4.press(PointOption.point(230,170));
		touch4.release();
		touch4.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomerGuarantor fotofrenteDni() {
		fotoFrenteDNI.click();
		fotoFrenteDNI.click();
		List<WebElement> lists5 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		TouchAction touch5 = new TouchAction<>(driver);
		touch5.press(PointOption.point(427,168));
		touch5.release();
		touch5.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomerGuarantor fotoreversoDni() {
		fotoVersoDNI.click();
		fotoVersoDNI.click();
		List<WebElement> lists6 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		TouchAction touch6 = new TouchAction<>(driver);
		touch6.press(PointOption.point(623,170));
		touch6.release();
		touch6.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomerGuarantor fotoCliente() {
		fotoCliente.click();
		fotoCliente.click();
		List<WebElement> lists7 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		TouchAction touch7 = new TouchAction<>(driver);
		touch7.press(PointOption.point(230,170));
		touch7.release();
		touch7.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomerGuarantor swipeScreenOneCustomer() {
		swipeScreen();
		return this;
		
	}
	
	public FormCustomerGuarantor gradoInstruccion() {
		gradoInstruccionN.click();
		gradoInstruction();
		return this;
	
	}
	
	public FormCustomerGuarantor profesionN() {
		profesionyOcuo.click();
		profesion();
		return this;
		
	}
	
	public FormCustomerGuarantor nextone() {
		scrollToPageCustomer1();
		return this;
		
	}
	
	public FormCustomerGuarantor nexttwoCustomer() {
		scrollToPageCustomer2();
		return this;
		
	}
	
	public FormCustomerGuarantor prePago() {
		prepago.click();
		return this;
		
	}
	
	public FormCustomerGuarantor codigoArea() {
		codarea.click();
		codigodearea();
		return this;
		
	}
	
	public FormCustomerGuarantor operadorTelef() {
		optelefono.click();
		operadordeTelef();
		return this;
		
	}
	
	public FormCustomerGuarantor telefonoFijo(String fijo) {
		telefonofijo.sendKeys(fijo);
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
		return this;
		
	}
	
	public FormCustomerGuarantor fotoComprobanteDomicilio() {
		fotocompdomicilio.click();
		fotocompdomicilio.click();
		fotoComprobDomicilio();//touch de foto
		nListo.click();
		return this;
		
	}

	public FormCustomerGuarantor tipodeComprobante() {
		comprobanted.click();
		tipoComprobante();
		return this;
		
	}
	
	public FormCustomerGuarantor casaqueHabita() {
		habita.click();
		casaHabita();
		return this;
		
	}
	
	public FormCustomerGuarantor otrotipoDomicilio(String otrotipod) {
		otrotipo.sendKeys(otrotipod);;
		return this;
		
	}
	
	public FormCustomerGuarantor personaenDomicilio() {
		numeropersona.click();
		numPersonas();
		return this;
		
	}
	
	public FormCustomerGuarantor departamentos() {
		departamen.click();
		departament();
		return this;
		
	}
	
	public FormCustomerGuarantor provincias() {
		provinc.click();
		provincia();
		return this;
		
	}
	
	public FormCustomerGuarantor distritos() {
		distrit.click();
		distrito();
		return this;
		
	}
	
	public FormCustomerGuarantor urbanizacion(String urban) {
		urbaniza.clear();
		urbaniza.sendKeys(urban);
		return this;
		
	}
	public FormCustomerGuarantor tipoVia() {
		tipovias.click();
		tipoviac();
		return this;
		
	}
	
	public FormCustomerGuarantor nomDireccion(String namedireccion) {
		direcc.sendKeys(namedireccion);
		return this;
	}
	
	public FormCustomerGuarantor numExterior(String nexteriorx) {
		nexterior.sendKeys(nexteriorx);
		return this;
	}
	
	public FormCustomerGuarantor numInterior(String ninterior) {
		interior.sendKeys(ninterior);
		return this;
	}
	
	public FormCustomerGuarantor permanenciaAnios() {
		permanios.click();
		permanenciaanios();
		return this;
		
	}
	
	public FormCustomerGuarantor referenciaUbic(String referencia) {
		referen.sendKeys(referencia);
		return this;
		
	}
	
	public FormCustomerGuarantor numeroDependient(String dependencia) {
	//	numdepend.clear();
		numdepend.sendKeys(dependencia);
		return this;
		
	}
	
	public FormCustomerGuarantor fotoHeritage() {
		fotoPatrimoni.click();
		fotoPatrimoni.click();
		fotoConstPatrimonio();
		nListo.click();
		return this;
		
	}
	
	public FormCustomerGuarantor tipoReferencia() {
		tiporef.click();
		tiporeferencia();
		return this;
		
	}
	
	public FormCustomerGuarantor nameReferenc(String nreferenc) {
		nameref.sendKeys(nreferenc);
		return this;
		
	}
	
	public FormCustomerGuarantor lastNameRef(String lastnreferen) {
		apellref.sendKeys(lastnreferen);
		return this;
		
	}

	public FormCustomerGuarantor cellReferenc(String cellderef) {
		cellref.sendKeys(cellderef);
		return this;
		
	}
	
	public FormCustomerGuarantor saveCustomer() {
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
