
  package org.meto.appium.tests;
  
  import org.testng.annotations.Test;

import junit.framework.Assert;

import java.lang.reflect.Method;
  
  import org.meto.appium.base.TestBase; import
  org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormContract;
import
  org.meto.appium.pages.FormCustomer; import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect; import
  org.meto.appium.pages.FormRse; import org.testng.annotations.BeforeMethod;
  import org.testng.annotations.Test;
  
  public class TFRse extends TestBase { 
	  
	  FormPage formPage; 
	  FormProspect formProspect; 
	  FormCustomer formCustomer; 
	  FormBusiness formBusiness; 
	  FormRse formRse;
	  FormProposal formProposal;
	  FormContract formContract;
  
  @BeforeMethod public void beforeMethod(Method method) {
  
  formPage = new FormPage(driver); 
  formProspect = new FormProspect(driver);
  formCustomer = new FormCustomer(driver); 
  formBusiness = new FormBusiness(driver); 
  formRse = new FormRse(driver);
  formProposal = new FormProposal(driver);
  formContract = new FormContract (driver);
  
  }
  
  @Test public void Rse() throws InterruptedException{ 
	  FormRse formRse = new FormRse(driver);
	  
	  formRse.autoComplit(); 
	  formRse.giro("VE");
	  formRse.swipeScreenOneRse();
	  formRse.activeC1("10");
	  formRse.activeC2("15"); 
	  formRse.activeC3("20"); 
	  formRse.activeC4("25");
	  formRse.activeC5("30"); 
	  formRse.activeC6("35"); 
	  formRse.activeC7("40");
	  formRse.swipeScreenOneRse();
	  formRse.activeC8("45");
	  formRse.activeC9("50");
	  formRse.activeC10("55");
	  formRse.activeC11("60");
	  formRse.activeC12("65");
	  formRse.swipeScreenOneRse();
//	  formRse.saveBusiness();
	  formRse.pasivoC1("21");
	  formRse.pasivoC2("22");
	  formRse.pasivoC3("23");
	  formRse.pasivoC4("24");
	  formRse.pasivoLargoPlazo("1");
	  formRse.swipeScreenOneRse();
	  formRse.addProduct();
	  formRse.valorMateria("100");
	  formRse.valorObra("100");
	  formRse.precioVenta("6000");
	  formRse.product("AVENA");
	  formRse.unidMeasure();
	  formRse.btnproduct();
	  formRse.swipeScreenOneRse();
	//  formRse.swipeScreenTwoRse();
	//  formRse.saveBusiness();
	  formRse.swipeScreenOneRse();
	  formRse.btnExpenses();
	  formRse.destinydebt();
	  formRse.entityBank("Santander");
	  formRse.totalAmount("2000");
	  formRse.balanceCap("500");
	  formRse.quotaValue("250");
	  formRse.feeamount("8");
	  formRse.payment("6");
	//  formRse.btnproduct();
	  formRse.saveExpense();
	  formRse.swipeScreenOneRse();
	  formRse.saveBusiness();
	//  formRse.nextheigh(); // avanza despues de registro de gasto
	//  formRse.swipeScreenOneRse();
	  formRse.expensePersonal("10");
	  formRse.rent("10");
	  formRse.transport("10");
	  formRse.maintenance("10");
	  formRse.otherServices("10");
	  formRse.swipeScreenOneRse();
//	  formRse.swipeScreenOneRse();
	  formRse.feeding("15");
	  formRse.salud("15");
	  formRse.alquiler("15");
	  formRse.servicioPublico("15");
	  formRse.swipeScreenOneRse();
	  formRse.educacion("15");
	  formRse.transportes("15");
	  formRse.entretenimiento("20");
	  formRse.swipeScreenOneRse();
	  formRse.btnotroingreso();
	  formRse.otroIngreso("300");
	  formRse.fotoConstIngreso();
	  formRse.origenOtroIngreso();
	  formRse.saveBusiness();
	  formRse.btnNextRse();
	  
		//  double primersum  = formRse.getProductsSum();
		//  double displaysum  = formRse.getTotalAmount();
		//  Assert.assertEquals(displaysum, displaysum);
	  
	  
  }
  
  
  
  }
 