package testCases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetUsder {

	
	@Test
	public void getUser() {
		
		given().
			get("https://petstore.swagger.io/v2/pet/1").
		then().
			statusCode(200);
		
		
		
		
	}
}
