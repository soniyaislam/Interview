package testCases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class putUser {
	
	
	@Test
	public void putUser() {
		given().
			get("https://petstore.swagger.io/v2/pet/1").
		then().
			statusCode(200);
		
	}

	@Test
	public void upDateUser() {
		JSONObject req = new JSONObject();
		  req.put(  "id", 0);
		    req.put("category -id", 2);
		       req.put ("name", "string");
		        req.put("name", "cat");
		        req.put( "photoUrls","string");
		        req.put( "tags -id", 2 )   ;		        
		        req.put ("name", "string");	
		        req.put ("status", "available");	
		 
		    
		
	}
	
	
	
	
}
