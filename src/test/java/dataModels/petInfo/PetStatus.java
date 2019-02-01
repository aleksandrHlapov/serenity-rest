package dataModels.petInfo;

import com.google.gson.annotations.SerializedName;

public enum PetStatus {
	@SerializedName("available")
	AVAILABLE,
	UNKNOWN
}
