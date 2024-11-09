
package org.meto.api.endpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.meto.appium.utils.AndroidActions;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.appium.java_client.android.AndroidDriver;
import io.restassured.response.Response;

public class EndPointThirdPartyQualificationPST_S6 extends EndPointRol{
	
	public static String accestk;
	public static String xyz;
	AndroidDriver driver;
	
	@Test
	public void Experian() {
	//	RestAssured.baseURI = Routes.base_url_cobis;
		
		//traer data
		/*
		AndroidActions androidAction = new AndroidActions(driver);
		String dnix = androidAction.numdocdni();
		System.out.println("Dni obtenido :" + dnix);*/
		
    	Response abc = EndPointRol.EndPRol();
    	xyz = abc.jsonPath().get("authenticationResult.authorization");
    	String Authorizationx = "Bearer " + xyz;

    	//System.out.println("xxxization en tasa :"+xyz);
	    
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
			headerMap.put("host", "stg.api.businessprocess.saf-pe.cobiscloud.com");
			headerMap.put("x-end-user-terminal", "192.168.1.1");
			headerMap.put("Authorization",Authorizationx);
			
	      String requestBody = "{\r\n"
	      		+ "  \"thirdPartyQualifications\": [\r\n"
	      		+ "    {\r\n"
	      		+ "      \"customer\": {\r\n"
	      		+ "        \"code\": 16599,\r\n"
	      		+ "        \"identification\": {\r\n"
	      		+ "          \"number\": \"71627071\",\r\n"
	      		+ "          \"type\": {\r\n"
	      		+ "            \"identificationTypeCode\": \"DNI\"\r\n"
	      		+ "          }\r\n"
	      		+ "        },\r\n"
	      		+ "        \"names\": \"FILLA FOLLE TELLE TILLE\",\r\n"
	      		+ "        \"subtype\": \"P\"\r\n"
	      		+ "      },\r\n"
	      		+ "      \"detail\": \"DETA_09\",\r\n"
	      		+ "      \"product\": \"CRE\",\r\n"
	      		+ "      \"reference\": \"REF_09\",\r\n"
	      		+ "      \"thirdPartyQualifier\": {\r\n"
	      		+ "        \"code\": \"ExperianConsultar\"\r\n"
	      		+ "      }\r\n"
	      		+ "    }\r\n"
	      		+ "  ]\r\n"
	      		+ "}";

	      	given()
	      		.headers(headerMap)
	      		.body(requestBody)
	        .when()
	   //     + "   \"session\": \""+sessionrol+"\",\r\n"
	        	.post("https://stg.api.customers.saf-pe.cobiscloud.com/generic/v1/third-party-qualifications").
	        then()
	        	.log().all()
	      		
	        	.statusCode(200);
	        //	.body("variables[0].variableValue", equalTo("INDNEGOCIO"))
	      //  	.body("variables.variableName",hasItems("PRDCCA","MNTCCA"));
	      	//	.body("naturalPerson.status.code",hasItems("P"));

	}

}
