package org.meto.appium.tests;

import org.testng.annotations.Test;
import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFBusiness extends TestBase {
	FormPage formPage;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formPage = new FormPage(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		
	}
	
	
	@Test
	public void Business() throws InterruptedException{
		FormBusiness formBusiness = new FormBusiness(driver);
		formBusiness.photoSelfie();
		formBusiness.saveBusiness();
		formBusiness.swipeScreenOneBusiness();
		
		formBusiness.timeAnios();
		formBusiness.experienciaAnios();
		formBusiness.inicioActividad("01/04/2020");
		formBusiness.tipoEstabelcimiento();
		formBusiness.numEmpleados("1");
		formBusiness.saveBusiness();
		//formBusiness.nextBusiness();
		FormRse formRse = formBusiness.nextBusiness();

	}


	
}
