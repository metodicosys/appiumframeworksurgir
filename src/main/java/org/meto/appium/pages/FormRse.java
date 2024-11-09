package org.meto.appium.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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

public class FormRse<MobileElement> extends AndroidActions{
	AndroidDriver driver;
	
	public FormRse(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/autoCompleteTextView")
	private WebElement autoc;
	
	//Contingencia
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"App Surgir en contingencia\"]")
	private WebElement enconting;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/autoCompleteTextView")
	private WebElement autoctext;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activeone;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activebco;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")                   
	private WebElement activetree;
		
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activefour;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activefive;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activesix;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activeseven;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activeeight;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activenine;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activethen;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activeeleven;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activetwelv;
	
	//pasivo corriente
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Deudas con proveedores']")
	private WebElement pasivocone;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Deudas entidades financieras']")
	private WebElement pasivoctwo;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Deuda con Surgir']")
	private WebElement pasivoctree;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Otras cuentas por pagar']")
	private WebElement pasivocfour;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Pasivo largo plazo']")
	private WebElement pasivolargoplazo;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/rse_add_product")
	private WebElement addprod;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement valormat;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement valorobra;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement precioventa;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement produc;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Unidad de medida']")
	private WebElement unidadm;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_submit_prospect")
	private WebElement btnprod;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/rse_add_expenses")
	private WebElement btndeuda;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Destino de la deuda']")
	private WebElement destdeuda;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/autoCompleteTextView")
	private WebElement entidab;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement montot;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement saldoc;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement valorc;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement cuota;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement cpagada;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_submit_prospect")
	private WebElement btngastos;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Gasto de personal']")
	private WebElement gastop;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Alquiler']")
	private WebElement alquila;

	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Transporte']")
	private WebElement transp;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Mantenimiento (Agua/luz/gas)']")
	private WebElement mant;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Otros servicios (Internet/teléfono/celular)']")
	private WebElement otross;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Alimentación']")
	private WebElement alimenta;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Salud']")
	private WebElement salud;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Alquiler vivienda']")
	private WebElement alquilav;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Servicios públicos vivienda']")
	private WebElement publicov;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Educación']")
	private WebElement educa;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Transporte']")
	private WebElement transpor;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Entretenimiento']")
	private WebElement entret;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Sí']")
	private WebElement btnotring;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/etInputGeneral")
	private WebElement otring;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Constancia de otros ingresos']")
	private WebElement fotoconsing;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Origen de otros ingresos']")
	private WebElement origingreso;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Button[2]")
	private WebElement btnextrse;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessSave")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement btnbusness;
	
	//scroll
	@AndroidFindBy(uiAutomator  = "UiScrollable(\"className(\"android.widget.ScrollView\")\").scrollIntoView(resourceId(\"pe.com.surgir.surgirapp:id/rse_subtitle_fixed_asset\"))")
	private MobileElement buttonOfTheScreen;  //uiAutomator
	
	public FormRse autoComplit() {
		autoc.click();
		return this;
		
	}
	
	public FormRse giro(String girotext) {
		autoctext.sendKeys(girotext);
		autocompGiro();
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
		return this;
		
	}
	
	public FormRse activeC1(String active1) {
		activeone.sendKeys(active1);
		return this;
		
	}
	
	public FormRse activeC2(String active2) {
		activebco.sendKeys(active2);
		return this;
		
	}
	
	public FormRse activeC3(String active3) {
		activetree.sendKeys(active3);
		return this;
		
	}
	
	public FormRse activeC4(String active4) {
		activefour.sendKeys(active4);
		return this;
		
	}
	
	public FormRse activeC5(String active5) {
		activefive.sendKeys(active5);
		return this;
		
	}
	
	public FormRse activeC6(String active6) {
		activesix.sendKeys(active6);
		return this;
		
	}
	
	public FormRse activeC7(String active7) {
		activeseven.sendKeys(active7);
		return this;
		
	}
	
	public FormRse activeC8(String active8) {
		activeeight.sendKeys(active8);
		return this;
		
	}
	
	public FormRse activeC9(String active9) {
		activenine.sendKeys(active9);
		return this;
		
	}
	
	public FormRse activeC10(String active10) {
		activethen.sendKeys(active10);
		return this;
	}
	
	public FormRse activeC11(String active11) {
		activeeleven.sendKeys(active11);
		return this;
		
	}
	
	public FormRse activeC12(String active12) {
		activetwelv.sendKeys(active12);
		return this;
		
	}

	public FormRse pasivoC1(String pasivoc1) {
		pasivocone.sendKeys(pasivoc1);
	//	pasivocone.sendKeys(pasivoc1);
		return this;
		
	}
	
	public FormRse pasivoC2(String pasivoc2) {
		pasivoctwo.sendKeys(pasivoc2);
		return this;
		
	}
	
	public FormRse pasivoC3(String pasivoc3) {
		pasivoctree.sendKeys(pasivoc3);
		return this;
		
	}
	
	public FormRse pasivoC4(String pasivoc4) {
		pasivocfour.sendKeys(pasivoc4);
		return this;
		
	}
	
	public FormRse pasivoLargoPlazo(String pasivol1) {
		pasivolargoplazo.sendKeys(pasivol1);
		return this;
		
	}
	
	public FormRse addProduct() {
		addprod.click();
		return this;
		
	}
	
	public FormRse valorMateria(String vmateria) {
		valormat.sendKeys(vmateria);
		return this;
		
	}
	
	public FormRse valorObra(String vobra) {
		valorobra.sendKeys(vobra);
		return this;
		
	}
	
	public FormRse precioVenta(String pventa) {
		precioventa.sendKeys(pventa);
		return this;
		
	}
	
	public FormRse product(String elprod) {
		produc.sendKeys(elprod);
		return this;
		
	}
	
	public FormRse unidMeasure() {
		unidadm.click();
		unidaddemedida();
		return this;
		
	}
	
	public FormRse btnproduct() {
		btnprod.click();
		return this;
		
	}
	
	public FormRse btnExpenses() {
		btndeuda.click();
		return this;
		
	}
	
	public FormRse destinydebt() {
		destdeuda.click();
		destinoDeuda();
		return this;
		
	}
	
	public FormRse entityBank(String entidadbanca) {
		entidab.sendKeys(entidadbanca);
		return this;
		
	}
	
	public FormRse totalAmount(String montotot) {
		montot.sendKeys(montotot);
		return this;
		
	}
	
	public FormRse balanceCap(String saldocap) {
		saldoc.sendKeys(saldocap);
		return this;
		
	}
	
	public FormRse quotaValue(String valorcuot) {
		valorc.sendKeys(valorcuot);
		return this;
		
	}
	
	public FormRse feeamount(String cuotas) {
		cuota.sendKeys(cuotas);
		return this;
		
	}
	
	public FormRse payment(String pago) {
		cpagada.sendKeys(pago);
		return this;
		
	}
	
	public FormRse saveExpense() {
		btngastos.click();
		return this;
		
	}
	
	public FormRse expensePersonal(String gpersonal) {
		gastop.sendKeys(gpersonal);
		return this;
		
	}
	
	public FormRse rent(String alquiler) {
		alquila.sendKeys(alquiler);
		return this;
		
	}
	
	public FormRse transport(String transpor) {
		transp.sendKeys(transpor);
		return this;
		
	}
	
	public FormRse maintenance(String mantenim) {
		mant.sendKeys(mantenim);
		return this;
		
	}
	
	public FormRse otherServices(String oserv) {
		otross.sendKeys(oserv);
		return this;
		
	}
	
	public FormRse feeding(String alimentacion) {
		alimenta.sendKeys(alimentacion);
		return this;
		
	}
	
	public FormRse salud(String susalud) {
		salud.sendKeys(susalud);
		return this;
		
	}
	
	public FormRse alquiler(String alquiland) {
		alquilav.sendKeys(alquiland);
		return this;
		
	}
	
	public FormRse servicioPublico(String spublico) {
		publicov.sendKeys(spublico);
		return this;
		
	}
	
	public FormRse educacion(String educando) {
		educa.sendKeys(educando);
		return this;
		
	}
	
	public FormRse transportes(String transporta) {
		transpor.sendKeys(transporta);
		return this;
		
	}
	
	public FormRse entretenimiento(String entretener) {
		entret.sendKeys(entretener);
		return this;
		
	}
		
	public FormRse btnotroingreso() {
		btnotring.click();
		return this;
		
	}
	
	public FormRse otroIngreso(String otroi) {
		otring.sendKeys(otroi);
		return this;
		
	}
	
	public FormRse fotoConstIngreso() {
		fotoconsing.click();
		fotoconsing.click();
		fotoConsOtroIng();
		nListo.click();
		return this;
		
	}
	
/*
	public FormCustomer swipeScreenMarried() {
		avance5casado();
		return this;
		
	}*/
	
	public FormRse nextfive() {
		findScrollablerse1();
		return this;
		
	}
	
	public FormRse nextsix() {
		findScrollablerse2();
		return this;
		
	}
	
	public FormRse nextseven() {
		findScrollablerse3();
		return this;
		
	}
	
	//Probando scroll despues de deuda en rse
	public FormRse nextheigh() {
		//findScrollablerse4();
		scrollToPagerse1();
		return this;
		
	}
	
	public FormRse nextpageheigh() {
		scrollToPagerse1();
		return this;
		
	}
	
	
	
	public FormRse origenOtroIngreso() {
		origingreso.click();
		origendeOtroIng();
		return this;
		
	}
	
	public FormRse saveBusiness() {
		btnbusness.click();
		return this;
		
	}
	
	/*
	public FormRse btnNextRse() {
		btnextrse.click();
		return this;
		
	}*/
	
	public FormProposal btnNextRse() throws InterruptedException  {
		btnextrse.click();
		return new FormProposal(driver);
		
	}
	
	
	public FormRse swipeScreenOneRse() {
		//swipeScreen();
			String toastMessage = enconting.getAttribute("name");
			System.out.println("Continggencia: "+ toastMessage);
			if (toastMessage.contains("contingencia")) {
				swipeScreen2(); //concontingencia
			}else {
				swipeScreen();
			}
			
			return this;
			
		}

	
	public FormRse swipeScreenTwoRse() {
	//	swipeScreenTwoRsen();
		swipeScreen();
	//	avancersegasto();
		return this;
		
	}
	
	public FormRse swipeScreenTreeRse() {
		swipeScreenTreeRsen();
		return this;
		
	}
	
	
}
