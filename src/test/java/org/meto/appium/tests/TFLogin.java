package org.meto.appium.tests;

import org.testng.annotations.Test;
import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class TFLogin extends TestBase {
	FormPage formPage;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	//FormRse formRse;

	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formPage = new FormPage(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		//formRse = new FormRse(driver);
		
	}
	
	@Test
	public void FillForm() throws InterruptedException{
		
		//FormPage formPage = new FormPage(driver);
	//	ExtentTest test = extent.createTest("Initial Test");
		//formPage.setMessageinit();
	//	formPage.setMessageinittwo();
		formPage.setNameUser("asesorqa");
		formPage.setNamePass("Surgir.2026");
		formPage.setSubmitLogin();
		formPage.setAgencySelection("Agencia");
		formPage.setRolSelection("Rol");
		formPage.setSubmitRol();
		formPage.setClaveLocal1("Prueba1234");
		formPage.setClaveConfLocal("Prueba1234");
		FormProspect formProspect = formPage.localButtom();

		
	}
	
	
	/*
	@Test
	public void FillProspect() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormProspect formProspect = new FormProspect(driver);
		formProspect.PropuestaButton();
		formProspect.ReturnButton();
		formProspect.PropuestaHome();
		formProspect.setNumDoc("09921741");
		formProspect.Verificando();
		formProspect.setFecCaducidad("01/01/2030");
		formProspect.setFirstName("TestFisrtname");
		formProspect.setSecondName("TestSecondName");
		formProspect.setSurName("Testlastname");
		formProspect.avance();
		formProspect.setSecondSureName("OtherLastName");
		formProspect.setFecNa("01/03/1991");
		formProspect.avance();
		formProspect.setnMobile("990493838");
		formProspect.setnMail("metodicosys@gmail.com");
		formProspect.continuarProspect();
		formProspect.scrollData();
		formProspect.continuarData();
		FormCustomer formCustomer = formProspect.bcontinuarValid();
		
		
		formCustomer.CustomerP();
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		//	formCustomer.nextone(); avance con scroll
		formCustomer.swipeScreenOneCustomer();
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.prePago();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.codigoArea();
		//	formCustomer.telefonoFijo("3827271");
		formCustomer.operadorTelef();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.nexttwoCustomer();
		formCustomer.tipodeComprobante();
		formCustomer.fotoComprobanteDomicilio();
		formCustomer.casaqueHabita();
		formCustomer.otrotipoDomicilio("choza");
		formCustomer.personaenDomicilio();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.departamentos();
		formCustomer.provincias();
		formCustomer.distritos();
		formCustomer.urbanizacion("mi urbanizacion test");
		formCustomer.tipoVia();
		formCustomer.nomDireccion("mi direccionx");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.numExterior("432");
		formCustomer.numInterior("6");
		formCustomer.permanenciaAnios();
		formCustomer.referenciaUbic("mi referencia ubic");
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.numeroDependient("1");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.tipoReferencia();
		formCustomer.nameReferenc("Test");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.lastNameRef("Test");
		formCustomer.cellReferenc("964636765");
		formCustomer.saveCustomer();
	//	formCustomer.nextCustomer();
		FormBusiness formBusiness = formCustomer.nextCustomer();
		
		formBusiness.photoSelfie();
		formBusiness.swipeScreenOneBusiness();
		formBusiness.timeAnios();
		formBusiness.experienciaAnios();
		formBusiness.inicioActividad("01/04/2020");
		formBusiness.tipoEstabelcimiento();
		formBusiness.numEmpleados("1");
		formBusiness.saveBusiness();
		//formBusiness.nextBusiness();
		FormRse formRse = formBusiness.nextBusiness();
		
		formRse.autoComplit();
		formRse.giro("VE");
		formRse.activeC1("10");
		formRse.activeC2("15");
		formRse.activeC3("20");
		formRse.activeC4("25");
		formRse.activeC5("30");
		formRse.activeC6("35");
		formRse.activeC7("40");
		formRse.swipeScreenOneRse();
		formRse.activeC8("45");
		
		
	}*/
	
	

	/*
	@Test
	public void FillCustomer(){
		FormCustomer formCustomer = new FormCustomer(driver);
		formCustomer.CustomerP();
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		//	formCustomer.nextone(); avance con scroll
		formCustomer.swipeScreenOneCustomer();
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.prePago();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.codigoArea();
		//	formCustomer.telefonoFijo("3827271");
		formCustomer.operadorTelef();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.nexttwoCustomer();
		formCustomer.tipodeComprobante();
		formCustomer.fotoComprobanteDomicilio();
		formCustomer.casaqueHabita();
		formCustomer.otrotipoDomicilio("choza");
		formCustomer.personaenDomicilio();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.departamentos();
		formCustomer.provincias();
		formCustomer.distritos();
		formCustomer.urbanizacion("2");
		
	}*/
	
	/*
	@Test
	public void FillBusiness(){
		FormBusiness formBusiness = new FormBusiness(driver);
		formBusiness.photoSelfie();
	
	} */
	
	/*
	@Test
	public void FillRse(){
		FormRse formRse = new FormRse(driver);
		formRse.photoSelfie();
	
	} */
	
}
