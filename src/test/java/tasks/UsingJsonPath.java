package tasks;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.equalTo;

public class UsingJsonPath {
	@Step("Assert that value in {1} is equal to {2}")
	public void assertResponseSingleFieldValueIsEqualTo(Response response, String jsonPath, String expectedResult) {
		response.then().assertThat().body(jsonPath, equalTo(expectedResult));
	}
}
