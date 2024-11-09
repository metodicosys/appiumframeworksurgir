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
import org.meto.appium.pages.FormSignature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFContract extends TestBase{
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
	public void TestContract() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormContract formContract = new FormContract(driver);
		
		formContract.formaPago();
		formContract.financialEntity();
		formContract.fotoCuenta();
		formContract.accountNumber("1111000000333");
		formContract.cci("11100032233333300445");
		formContract.nextOneContract();
		formContract.linkagePolice();
		formContract.comment("Conforme");
		formContract.saveContract();
		
		FormSignature formSignature = formContract.nextContract();
		

	//	formProposal.saveProposal();

		
	}

	
}
