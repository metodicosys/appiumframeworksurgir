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

public class TFGuarantor extends TestBase{
	
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
		formContract = new FormContract (driver);
		formSignature = new FormSignature (driver);
		formGuarantor = new FormGuarantor (driver);
		formCustomerGuarantor = new FormCustomerGuarantor(driver);
		
	}
	
	
	@Test
	public void FillGuarantor() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormGuarantor formGuarantor = new FormGuarantor(driver);
		formGuarantor.typeGuarantee();
		formGuarantor.nextAddGuarantee();
		
		formGuarantor.setNumDoc("06795747");  //48208831 C  74883197 D
		formGuarantor.Verificando();
		formGuarantor.setFecCaducidad("01/01/2030");
		formGuarantor.setFirstName("TestFirstGarant");
		formGuarantor.setSecondName("TestSecondName");
		formGuarantor.setSurName("Testlastnam");
		formGuarantor.avance();
		formGuarantor.setSecondSureName("OtherLastName");
		formGuarantor.setFecNa("01/03/1995");
		formGuarantor.avance();
		formGuarantor.setnMobile("990492738");
		formGuarantor.setnMail("m.oropezag@hotmail.com");
		formGuarantor.continuarProspect();
		formGuarantor.scrollData();
		formGuarantor.continuarData();
		FormCustomerGuarantor formCustomerGuarantor = formGuarantor.bcontinuarValid();
		

	}
	
	
}
