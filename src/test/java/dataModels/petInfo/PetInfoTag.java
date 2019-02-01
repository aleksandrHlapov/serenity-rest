package dataModels.petInfo;

import com.google.gson.annotations.SerializedName;

public class PetInfoTag {
	@SerializedName("id")
	private int id_;

	@SerializedName("name")
	private String name_;

	public PetInfoTag withId(int id) {
		id_ = id;
		return this;
	}

	public PetInfoTag withName(String name) {
		name_ = name;
		return this;
	}

	@Override
	public String toString() {
		return "PetInfoTag{" +
				"id=" + id_ +
				", name='" + name_ + '\'' +
				'}';
	}
}
