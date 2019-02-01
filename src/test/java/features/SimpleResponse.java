package features;

import dataModels.petInfo.PetInfo;
import dataModels.petInfo.PetInfoCategory;
import dataModels.petInfo.PetInfoTag;
import dataModels.petInfo.PetStatus;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import tasks.Fetch;
import tasks.UsingJsonPath;
import tasks.UsingPojo;

import java.util.Arrays;
import java.util.Collections;

/**
 * Simple test to check singe response field. In this test i assume that service return single object, set of unique
 * fields.
 * <p>
 *     In this test i want to
 *     <ol>
 *         <li>json response will be treated as a string, idea is to check response using only json path</li>
 *         <li>json response will be mapped to a java class but ths pojo will be treated as a string</li>
 *         <li>json response will be mapped to a java class and comparison will be done field by field</li>
 *     </ol>
 * </p>
 */
@RunWith(SerenityRunner.class)
public class SimpleResponse {
	private int petNumber = 57;

	@SuppressWarnings("WeakerAccess")
	@Steps
	Fetch fetch;

	@SuppressWarnings("WeakerAccess")
	@Steps
	UsingJsonPath usingJsonPath;

	@SuppressWarnings("WeakerAccess")
	@Steps
	UsingPojo usingPojo;

	@Test
	@Ignore
	public void isPossibleToUseJsonPathToCheckResponse() {
		Response petInfo = fetch.petInfoById(petNumber);
		usingJsonPath.assertResponseSingleFieldValueIsEqualTo(petInfo, "category.name", "A5GPUEJH3I");
	}

	@Test
	public void isPossibleToCheckResponseAsObjectToString() {
		Response petInfo = fetch.petInfoById(petNumber);
		usingPojo.assertThatResponseAsStringIsEqualTo(
				petInfo.then().extract().as(PetInfo.class),
				new PetInfo()
						.withId(petNumber)
						.withPetCategory(new PetInfoCategory().withId(388).withName("A5GPUEJH3I"))
						.withPetName("YP4PX6X5GL@yahoo.ie")
						.withPetPhotoUrls(Arrays.asList("FVZVLUSE6T@kumarweb.com", "RU0XS3ZZ0D@mail2christian.com", "TRF4N97SEB@mail2boston.com"))
						.withPetInfoTags(Collections.singletonList(new PetInfoTag().withId(131).withName("6IM6MSBKH7")))
						.withPetStatus(PetStatus.AVAILABLE)
		);
	}

	@Test
	public void isPossibleToCheckResponseAsObjectFieldByField() {
		Response petInfo = fetch.petInfoById(petNumber);
		usingPojo.assertThatResponseIsEqualToObjectFieldByField(
				petInfo.then().extract().as(PetInfo.class),
				new PetInfo()
						.withId(petNumber)
						.withPetCategory(new PetInfoCategory().withId(388).withName("A5GPUEJH3I"))
						.withPetName("YP4PX6X5GL@yahoo.ie")
						.withPetPhotoUrls(Arrays.asList("FVZVLUSE6T@kumarweb.com", "RU0XS3ZZ0D@mail2christian.com", "TRF4N97SEB@mail2boston.com"))
						.withPetInfoTags(Collections.singletonList(new PetInfoTag().withId(131).withName("6IM6MSBKH7")))
						.withPetStatus(PetStatus.AVAILABLE)
		);
	}
}
