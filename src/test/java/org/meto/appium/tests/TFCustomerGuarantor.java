package org.meto.appium.tests;

import org.testng.annotations.Test;
import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormCustomerGuarantor;
import org.meto.appium.pages.FormGuarantor;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.meto.appium.pages.FormSignature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFCustomerGuarantor extends TestBase {

	FormPage formPage;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	FormSignature formSignature;
	FormGuarantor formGuarantor;
	FormCustomerGuarantor formCustomerGuarantor;
	
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formPage = new FormPage(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		formContract = new FormContract(driver);
		formSignature = new FormSignature(driver);
		formGuarantor = new FormGuarantor (driver);
		formCustomerGuarantor = new FormCustomerGuarantor(driver);
		
	}
	

	@Test
	public void FillCustomerGuarantor() throws InterruptedException{
	//	formCustomer = formProspect.bcontinuarValid();
		FormCustomerGuarantor formCustomerGuarantor = new FormCustomerGuarantor(driver);
		//formCustomerGuarantor.CustomerP();
		formCustomerGuarantor.fotoExperian();
		formCustomerGuarantor.fotofrenteDni();
		formCustomerGuarantor.fotoreversoDni();
		formCustomerGuarantor.fotoCliente();
		//	formCustomer.nextone(); avance con scroll
		formCustomerGuarantor.swipeScreenOneCustomer();
		formCustomerGuarantor.gradoInstruccion();
		formCustomerGuarantor.profesionN();
		formCustomerGuarantor.swipeScreenOneCustomer();
		formCustomerGuarantor.swipeScreenOneCustomer();
		formCustomerGuarantor.prePago();
		formCustomerGuarantor.swipeScreenOneCustomer();
		formCustomerGuarantor.codigoArea();
		//	formCustomer.telefonoFijo("3827271");
		formCustomerGuarantor.operadorTelef();
		formCustomerGuarantor.swipeScreenOneCustomer();
	//	formCustomer.nexttwoCustomer();
		formCustomerGuarantor.tipodeComprobante();
		formCustomerGuarantor.fotoComprobanteDomicilio();
		formCustomerGuarantor.casaqueHabita();
		formCustomerGuarantor.otrotipoDomicilio("choza");
		formCustomerGuarantor.personaenDomicilio();
		formCustomerGuarantor.swipeScreenOneCustomer();
		formCustomerGuarantor.departamentos();
		formCustomerGuarantor.provincias();
		formCustomerGuarantor.distritos();
		formCustomerGuarantor.urbanizacion("mi urbanizacion test");
		formCustomerGuarantor.tipoVia();
		formCustomerGuarantor.nomDireccion("mi direccionx");
		formCustomerGuarantor.swipeScreenOneCustomer();
		formCustomerGuarantor.numExterior("432");
		formCustomerGuarantor.numInterior("6");
		formCustomerGuarantor.permanenciaAnios();
		formCustomerGuarantor.referenciaUbic("mi referencia ubic");
		formCustomerGuarantor.swipeScreenOneCustomer();
		formCustomerGuarantor.fotoHeritage(); /// nuevo
	//	formCustomer.numeroDependient("1");
		formCustomerGuarantor.swipeScreenOneCustomer();
		formCustomerGuarantor.tipoReferencia();
		formCustomerGuarantor.nameReferenc("Test");
		formCustomerGuarantor.swipeScreenOneCustomer();
		formCustomerGuarantor.lastNameRef("Test");
		formCustomerGuarantor.cellReferenc("964636765");
		formCustomerGuarantor.saveCustomer();
	//	formCustomer.nextCustomer();
	//	FormBusiness formBusiness = formCustomer.nextCustomer();
		
	}

	
	
}
