package org.meto.api.endpoints;

import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;
import org.meto.api.endpoints.Routes;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;


public class EndPointAuth {
	
 public static String sessionAuth;
	 
 
	 public static Response EndPAuthentication() {
		  RestAssured.baseURI = Routes.base_url_cobis;
	      String requestBody = "{\"authentication\": {\"login\": \"asesorqa5\",\"password\": \"Surgir02*\"}}";

		   	Map<String,Object> headerMap = new HashMap<String,Object>();
				headerMap.put("Content-Type", "application/json");
				headerMap.put("x-api-key","swGwRN7X65XLuBqFFsthpwxMjhXjxL9CrUmvtW80");
				headerMap.put("x-end-user-login","asesorqa4");
				headerMap.put("x-request-id","4f9aa743-0cad-46f0-b055-c42e0ab6e216");
				headerMap.put("x-end-user-terminal","186.28.75.10");
				headerMap.put("x-end-user-request-date-time","2021-04-26T23:00:27Z");
				
	      Response res =
	      	given()
	      		.headers(headerMap)
		        .body(requestBody)
	        .when()
	        	.post(Routes.post_url_authentication);
	      
	      Assert.assertEquals(res.getStatusCode(), 201);
	      Assert.assertEquals(res.header("Content-Type"),"application/json");
	      sessionAuth = res.jsonPath().get("session").toString();
	      
	      sessionAuth = res.asString();//tambien ok
	      System.out.println("primer sesionid: "+sessionAuth);//session ok

		  return res;
		  
	    }


}
