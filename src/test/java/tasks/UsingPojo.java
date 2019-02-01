package tasks;

import dataModels.petInfo.PetInfo;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UsingPojo {
	/**
	 * "Cheat" assertion. Very easy to implement and do the trick but doesn't point out field with error. Just telling
	 * that actual string is different from expected
	 * @param actualPetInfo   actual result
	 * @param expectedPetInfo expected result
	 */
	@Step("Assert that response as string\n{0}\nis equal to\n{1}")
	public void assertThatResponseAsStringIsEqualTo(PetInfo actualPetInfo, PetInfo expectedPetInfo) {
		assertThat(actualPetInfo.toString(), equalTo(expectedPetInfo.toString()));
	}

	public void assertThatResponseIsEqualToObjectFieldByField(PetInfo actualPetInfo, PetInfo expectedPetInfo) {

	}
}
