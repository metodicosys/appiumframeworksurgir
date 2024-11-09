package org.meto.appium.tests;

import org.testng.annotations.Test;
import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFCustomer extends TestBase {
	FormPage formPage;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formPage = new FormPage(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		
	}
	

	@Test
	public void Customer() throws InterruptedException{
		FormCustomer formCustomer = new FormCustomer(driver);
		formCustomer.CustomerP();
		formCustomer.fotoExperian();
	//	formCustomer.validPhotoExperian(); // valida foto experian
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		formCustomer.bajar();
		//formCustomer.swipeScreenOneCustomer();
	//	formCustomer.swipeScreenOneCustomer();
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.ecivilselect("CASADO");//SELECCIONANDO ESTADO CIVIL CASADO
		formCustomer.bajar2();
		formCustomer.iletrado(false);
		formCustomer.estadoCivil("CASADO");
		//formCustomer.saveCustomer();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.bajarcontacto();
		formCustomer.prePago();
		//	formCustomer.telefonoFijo("3827271");
		formCustomer.operadorTelef();
		//formCustomer.saveCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.bajarcomprobante();
	//	formCustomer.scrollToPageCustmDom();//Bajar hasta contacto

	}
	
	@Test
	public void Domicilio() throws InterruptedException{
		FormCustomer formCustomerd = new FormCustomer(driver);
		formCustomerd.tipodeComprobante();
		formCustomerd.fotoComprobanteDomicilio();

		formCustomerd.swipeScreenOneCustomer();
	//	formCustomerd.saveCustomer(); // nuevo
		formCustomerd.departamentos();
		formCustomerd.provincias();
		formCustomerd.urbanizacion("Test de urbanizacion");
		formCustomerd.distritos();
		formCustomerd.saveCustomer();
		formCustomerd.nomDireccion("mi direccionx");
		formCustomerd.tipoVia();
		formCustomerd.numExterior("432");
		formCustomerd.numInterior("6");
		formCustomerd.saveCustomer();
		formCustomerd.swipeScreenOneCustomer();
		//formCustomerd.nextfivCustomer();
		formCustomerd.permanenciaAnios();
		formCustomerd.referenciaUbic("mi referencia ubic");
		formCustomerd.personaenDomicilio();
		formCustomerd.swipeScreenOneCustomer();
		
	}

	@Test
	public void InfComplementaria() throws InterruptedException{
		FormCustomer formCustomeri = new FormCustomer(driver);
		formCustomeri.casaqueHabita();
		formCustomeri.otrotipoDomicilio("choza");
		//formCustomer.fotoHeritage(); /// nuevo
	//	formCustomer.numeroDependient("1");
		formCustomeri.swipeScreenOneCustomer();
		formCustomeri.tipoReferencia();
		formCustomeri.swipeScreenOneCustomer();
		formCustomeri.nameReferenc("Test");
	//	formCustomeri.swipeScreenOneCustomer();
		formCustomeri.lastNameRef("Test");
		formCustomeri.cellReferenc("964636765");
		formCustomeri.saveCustomer();
	//	formCustomer.nextCustomer();
		FormBusiness formBusiness = formCustomeri.nextCustomer();
		
	}
	
}
