package org.meto.appium.tests;

import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProspect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

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
		
	}
	
	@Test(dataProvider="getData")
	public void Login(HashMap<String,String> input) throws InterruptedException{	
		formPage.setNameUser(input.get("usuario"));
		formPage.setNamePass(input.get("password"));
		formPage.setSubmitLogin();

	}
	
	@Test
	public void Rol() throws InterruptedException{
		formPage.setAgencySelection();
		formPage.setRolSelection("ASESOR INDIVIDUAL");
		formPage.setSubmitRol();
		formPage.setClaveLocal1("Prueba1234");
		formPage.setClaveConfLocal("Prueba1234");
		FormProspect formProspect = formPage.localButtom();

	}
	
	
	/*
	  	public void Login() throws InterruptedException{
		formPage.setNameUser("asesorqa");
		formPage.setNamePass("Surgir.2026");
		formPage.setSubmitLogin();
		formPage.setAgencySelection("Agencia");
		formPage.setRolSelection("Rol");
		formPage.setSubmitRol();
		formPage.setClaveLocal1("Prueba1234");
		formPage.setClaveConfLocal("Prueba1234");
		FormProspect formProspect = formPage.localButtom();

		
	}*/
	 
	
	/*
	@Test
	public void FillRse(){
		FormRse formRse = new FormRse(driver);
		formRse.photoSelfie();
	
	} */
	
	
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
	//	return new Object [][] {{"asesorqa","Surgir.2026"}};
		
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"//src//test//java//org//meto//appium//testdata//dlogin.json");
		return new Object [][] {{data.get(0)}};
		
	}
	
}
