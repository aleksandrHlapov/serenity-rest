package tasks;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class Fetch {
	static {
		RestAssured.baseURI = "http://petstore.swagger.io/v2/";
	}

	@Step
	public Response petInfoById(Integer petNumber) {
		return SerenityRest.when().get("pet/" + petNumber.toString());
	}
}
