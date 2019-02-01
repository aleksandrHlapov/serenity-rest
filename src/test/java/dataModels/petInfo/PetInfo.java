package dataModels.petInfo;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PetInfo {
	@SerializedName("id")
	private Integer petId_;

	@SerializedName("category")
	private PetInfoCategory petCategory_;

	@SerializedName("name")
	private String petName_;

	@SerializedName("photoUrls")
	private List<String> petPhotoUrls_;

	@SerializedName("tags")
	private List<PetInfoTag> petInfoTags_;

	@SerializedName("status")
	private PetStatus petStatus_;

	public PetInfo withId(int petId) {
		petId_ = petId;
		return this;
	}

	public PetInfo withPetCategory(PetInfoCategory petCategory) {
		petCategory_ = petCategory;
		return this;
	}

	public PetInfo withPetName(String petName) {
		petName_ = petName;
		return this;
	}

	public PetInfo withPetPhotoUrls(List<String> petPhotoUrls) {
		petPhotoUrls_ = petPhotoUrls;
		return this;
	}

	public PetInfo withPetInfoTags(List<PetInfoTag> petInfoTags) {
		petInfoTags_ = petInfoTags;
		return this;
	}

	public PetInfo withPetStatus(PetStatus petStatus) {
		petStatus_ = petStatus;
		return this;
	}

	@Override
	public String toString() {
		return "PetInfo{" +
				"petId_=" + petId_ +
				", petCategory_=" + petCategory_ +
				", petName_='" + petName_ + '\'' +
				", petPhotoUrls_=" + petPhotoUrls_ +
				", petInfoTags_=" + petInfoTags_ +
				", petStatus_='" + petStatus_ + '\'' +
				'}';
	}
}
