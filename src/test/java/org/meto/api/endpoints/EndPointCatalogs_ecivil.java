package org.meto.api.endpoints;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class EndPointCatalogs_ecivil {
	
	public static String accestk;
	public static String xyz;
	
	@Test
	public void CatalogEcivil() {
		//RestAssured.baseURI = "https://stg.api.admin.saf-pe.cobiscloud.com";
		
    	Response abc = EndPointRol.EndPRol();
    	xyz = abc.jsonPath().get("authenticationResult.authorization");
    	String Authorizationx = "Bearer " + xyz;

    	System.out.println("xxxization en tasa :"+Authorizationx);
	    		  
    //	Response resp1 = 
	      	given()
		        .header("Content-Type", "application/json")
		        .header("x-api-key","swGwRN7X65XLuBqFFsthpwxMjhXjxL9CrUmvtW80")
		        .header("x-end-user-login","asesorqa4")
		        .header("x-request-id","4f9aa743-0cad-46f0-b055-c42e0ab6e216")
		        .header("x-end-user-terminal","terminaldemo")
		        .header("x-end-user-request-date-time","2021-04-26T23:00:27Z")
		        .header("Accept-Language","ES-EC")
		        .header("Authorization",Authorizationx)
	        .when()
	        	.get("https://stg.api.admin.saf-pe.cobiscloud.com/generic/v1/admin/catalogs?name=cl_ecivil").
	        
	        then()
	        	.statusCode(200)
	        	.log().all();
	        
	      
	      //Assert.assertEquals(Response, 200);
	     //	System.out.println("Response body: "+responseecivil.getBody().asString());	      
	    //  Assert.assertEquals(status, true); 
	   //   return responseecivil;

	}

}
