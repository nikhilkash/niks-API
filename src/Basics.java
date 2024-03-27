import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import file.payload;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		given().log().all()
		.queryParam("key", "qaclick123")
		.header("Content-Type","application/json")
		.body(payload.ADDPlace())
		.when()
		.post("/maps/api/place/add/json")
		.then().log().all()
		.assertThat().statusCode(200);
	}

}
