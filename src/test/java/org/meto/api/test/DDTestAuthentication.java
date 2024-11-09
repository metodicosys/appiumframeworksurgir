package org.meto.api.test;

import org.meto.api.endpoints.EndPointCatalogs_ecivil;
import org.meto.api.endpoints.EndPointRol;
import org.meto.api.endpoints.EndPointRuleTasa;
import org.testng.annotations.Test;


public class DDTestAuthentication {
	
	public String sessiond;
//	public String authorizationx;

	
	@Test(priority=1)
	public void testPostRoleD()
	{
		//OK AUTHENTICATION
		
		EndPointRol nrole = new EndPointRol();
		System.out.println("Rol en DD :"+ nrole.EndPRol().asString());
		
		
	}
	
	@Test(priority=2)
	public void testGetRuleTasa()
	{	
		EndPointRuleTasa nruletas = new EndPointRuleTasa();

	}
	
	@Test(priority=3)
	public void testGetCatalogsEcivil()
	{	
		
		EndPointCatalogs_ecivil nruletas = new EndPointCatalogs_ecivil();

	}

}
