package dataModels.petInfo;

import com.google.gson.annotations.SerializedName;

public class PetInfoCategory {
	@SerializedName("id")
	private int id_;

	@SerializedName("name")
	private String name_;

	public PetInfoCategory withId(int id) {
		id_ = id;
		return this;
	}

	public PetInfoCategory withName(String name) {
		name_ = name;
		return this;
	}

	@Override
	public String toString() {
		return "PetInfoCategory{" +
				"id=" + id_ +
				", name='" + name_ + '\'' +
				'}';
	}
}
