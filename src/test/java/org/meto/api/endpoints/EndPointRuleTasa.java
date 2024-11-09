package org.meto.api.endpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.appium.java_client.android.AndroidDriver;
import io.restassured.response.Response;

public class EndPointRuleTasa extends EndPointRol{
	
	public static String accestk;
	public static String xyz;
	AndroidDriver driver;
	
	@Test
	public void RuleTasa() {
	//	RestAssured.baseURI = Routes.base_url_cobis;
		
    	Response abc = EndPointRol.EndPRol();
    	xyz = abc.jsonPath().get("authenticationResult.authorization");
    	String Authorizationx = "Bearer " + xyz;

    	System.out.println("xxxization en tasa :"+xyz);
	    
	   	Map<String,Object> headerMap = new HashMap<String,Object>();
			headerMap.put("Content-Type", "application/json");
			headerMap.put("x-api-key","swGwRN7X65XLuBqFFsthpwxMjhXjxL9CrUmvtW80");
			headerMap.put("x-end-user-login","asesorqa4");
			headerMap.put("x-request-id","4f9aa743-0cad-46f0-b055-c42e0ab6e216");
			headerMap.put("x-end-user-terminal","192.168.1.1");
			headerMap.put("x-end-user-request-date-time","2021-04-26T23:00:27Z");
			headerMap.put("x-end-user-last-logged-date-time","2021-04-26T23:00:27Z");
			headerMap.put("Accept-Language","ES-EC");
			headerMap.put("x-channel", "100");
			headerMap.put("Authorization",Authorizationx);
			
		//	System.out.println("Request uno: "+headerMap.toString());// OK
			 
	      String requestBody = "{\r\n"
	      		+ "  \"rule\": {\r\n"
	      		+ "    \"acronym\": \"RTAS\"\r\n"
	      		+ "  },\r\n"
	      		+ "  \"variables\": [\r\n"
	      		+ "    {\r\n"
	      		+ "      \"dataType\": \"CHR\",\r\n"
	      		+ "      \"variableName\": \"PRDCCA\",\r\n"
	      		+ "      \"variableValue\": \"INDNEGOCIO\"\r\n"
	      		+ "    },\r\n"
	      		+ "    {\r\n"
	      		+ "      \"dataType\": \"FLT\",\r\n"
	      		+ "      \"variableName\": \"MNTCCA\",\r\n"
	      		+ "      \"variableValue\": \"1500.00\"\r\n"
	      		+ "    },\r\n"
	      		+ "    {\r\n"
	      		+ "      \"dataType\": \"CHR\",\r\n"
	      		+ "      \"variableName\": \"RIES\",\r\n"
	      		+ "      \"variableValue\": \"0\"\r\n"
	      		+ "    },\r\n"
	      		+ "    {\r\n"
	      		+ "      \"dataType\": \"FLT\",\r\n"
	      		+ "      \"variableName\": \"PLAZ\",\r\n"
	      		+ "      \"variableValue\": \"18\"\r\n"
	      		+ "    },\r\n"
	      		+ "    {\r\n"
	      		+ "      \"dataType\": \"CHR\",\r\n"
	      		+ "      \"variableName\": \"AGEN\",\r\n"
	      		+ "      \"variableValue\": \"1\"\r\n"
	      		+ "    }\r\n"
	      		+ "  ]\r\n"
	      		+ "}";

	      
	      	given()
	      	/*
	        .header("Content-Type", "application/json")
	        .header("x-api-key","swGwRN7X65XLuBqFFsthpwxMjhXjxL9CrUmvtW80")
	        .header("x-end-user-login","asesorqa4")
	        .header("x-request-id","4f9aa743-0cad-46f0-b055-c42e0ab6e216")
	        .header("x-end-user-terminal","192.168.1.1")
	        .header("x-end-user-request-date-time","2021-04-26T23:00:27Z")
	        .header("x-end-user-last-logged-date-time","2021-04-26T23:00:27Z")
	        .header("Accept-Language","ES-EC")
	        .header("x-channel", "100")
	        .header("Authorization",Authorizationx)*/
	      		.headers(headerMap)
	      		.body(requestBody)
	        .when()
	        	.post("https://stg.api.workflow.saf-pe.cobiscloud.com/generic/v1/process-rules/rule-condition-values").
	        then()
	        	.log().all()
	      		
	        	.statusCode(201)
	        	.body("variables[0].variableValue", equalTo("INDNEGOCIO"))
	        	.body("variables.variableName",hasItems("PRDCCA","MNTCCA"));
	      //	System.out.println("Response body: "+responserule.getBody().asString());
	 	      
	    
	      
	   //   return responserule;

	}

}
