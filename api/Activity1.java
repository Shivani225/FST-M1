package activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Activity1 {
	
		
		final String root_URI = "https://petstore.swagger.io/v2/pet";
	
	@Test (priority = 1)
    public void AddNewPet() {
    	
        String reqBody = "{"
        		+ "\"id\": 77230,"
        		+ "\"name\": \"Meera\","
        		+ "\"status\": \"alive\"}";
        Response response = given().contentType(ContentType.JSON).
        		body(reqBody).when().post(root_URI); // Send POST request
        
        response.then().body("id", equalTo(77230));
        response.then().body("name", equalTo("Meera"));
        response.then().body("status", equalTo("alive"));
 
	}


    @Test (priority = 2)
    public void GetPetDetails() {
        
        
        Response response = 
            given().contentType(ContentType.JSON) 
            .when().pathParam("petId", "77230").get(root_URI + "/{petId}");
        
        response.then().body("id", equalTo(77230));
        response.then().body("name", equalTo("Meera"));
        response.then().body("status", equalTo("alive"));

        
        
       System.out.println(response);
    }
    
    @Test (priority = 3)
    public void DeletePetDetails() {
        
        
        Response response = 
            given().contentType(ContentType.JSON) 
            .when().pathParam("petId", "77230").delete(root_URI + "/{petId}"); 
        
      response.then().body("code", equalTo(200));
      response.then().body("message", equalTo("77230"));
    }

}
