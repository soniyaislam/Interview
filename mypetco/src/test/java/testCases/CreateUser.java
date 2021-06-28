package testCases;



import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class CreateUser {

	//create user API
	//*ReQuest component
	/*Method
	 * *Endpoint or URI
	 * *Request header
	 * *Request path parameter
	 * *Request Query parameter'*Request body
	 */

	
	@Test
    public void getUserCode()  {
		given().
			get("https://petstore.swagger.io/v2/pet/1").
		then().
			statusCode(200);
		
		
	}

	@Test
	public void creatUsser( )   {
		
		JSONObject req = new JSONObject();
		
		  req.put(  "id", 0);
		    req.put("category -id", 1);
		    req.put("id","1001");
		    req.put("username","soniya");
		    req.put("firstName","soniya");
		    req.put("lastName","islam");
		    req .put("email","soniyaislam2010@gmail.com");
		    req .put("password","852741");
		    req .put("phone","6823332348");
		    req .put("userStatus","1");
			
		   //req.prettyPrint();
		   req.assertEquals(req.statusCode(), 200);
		   }
		
		
	}
	
	
	
	
	
	
	
	


