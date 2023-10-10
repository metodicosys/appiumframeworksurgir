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

public class TFProspect extends TestBase {
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
		formContract = new FormContract (driver);
		
	}
	
	@Test
	public static void FillProspect() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormProspect formProspect = new FormProspect(driver);
		formProspect.PropuestaButton();
		formProspect.ReturnButton();
		formProspect.PropuestaHome();
		formProspect.setNumDoc("46424404");  //48208831 C  74883197 D    08163942
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
		//formProspect.politics();
		//formProspect.segmentos();

		FormCustomer formCustomer = formProspect.bcontinuarValid();
		
	}


	
}
