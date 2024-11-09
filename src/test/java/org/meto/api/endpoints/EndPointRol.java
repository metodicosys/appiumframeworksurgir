package org.meto.api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.meto.api.endpoints.Routes;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class EndPointRol extends EndPointAuth{
	public static String sessionrol;
	public static String authorizationx;
	
	@Test
	public static Response EndPRol() throws JSONException {
		
		//RestAssured.baseURI = Routes.base_url_cobis;
		RestAssured.baseURI = Routes.post_url_authentication;
		
    	JSONObject jsonn = new JSONObject(EndPointAuth.EndPAuthentication().asString());   	 
    	sessionrol = jsonn.getString("session");

	    System.out.println("Session en rol: "+ sessionrol);	 
		
	      Map<String,Object> headerMap = new HashMap<>();
	      headerMap.put("Content-Type", "application/json");
		  headerMap.put("x-api-key","swGwRN7X65XLuBqFFsthpwxMjhXjxL9CrUmvtW80");
		  headerMap.put("x-end-user-login","asesorqa5");
		  headerMap.put("x-request-id","4f9aa743-0cad-46f0-b055-c42e0ab6e216");
		  headerMap.put("x-end-user-terminal","186.28.75.10");
		  headerMap.put("x-end-user-request-date-time","2021-04-26T23:00:27Z");
	    
		  Map<String, Object> map = new HashMap<>();
		  JSONObject requestrol = new JSONObject(map);
		
		  requestrol.put("session","\""+sessionrol+"\"");
		  requestrol.put("authentication.login", "asesorqa4");
		  requestrol.put("subsidiary.code", 1);
		  requestrol.put("branch.code", 102);
		  requestrol.put("role.code", 10);
	//	  System.out.println("request rol: "+ requestrol);
		  
		  
	      String requestBody = "{   \r\n"
	      		+ "   \"session\": \""+sessionrol+"\",\r\n"
	      		+ "    \"authentication\": {\r\n"
	      		+ "        \"login\": \"asesorqa4\"\r\n"
	      		+ "    },\r\n"
	      		+ "    \"subsidiary\": {\r\n"
	      		+ "        \"code\": 1\r\n"
	      		+ "    },\r\n"
	      		+ "    \"branch\": {\r\n"
	      		+ "        \"code\": 102\r\n"
	      		+ "    },\r\n"
	      		+ "    \"role\": {\r\n"
	      		+ "        \"code\": 10\r\n"
	      		+ "    }\r\n"
	      		+ "}";

	      Response autorizat =
	      	given()
	      		.headers(headerMap)
		        .body(requestBody)
	        .when()
	        	.post(Routes.post_url_role);
	      
	      authorizationx = autorizat.jsonPath().get("authenticationResult.authorization");
	            
	      Assert.assertEquals(autorizat.getStatusCode(), 201);
	      Assert.assertEquals(autorizat.header("Content-Type"),"application/json");
	    //  sessionAuth = role.jsonPath().get("authenticationResult.authorization").toString();
	    //  sessionAuth = res.asString();//tambien ok
	   //   System.out.println("Autorhization : "+authorizationx);//session ok
		  
			//return sessionAuth;
	       return autorizat;
	    }
	

}
