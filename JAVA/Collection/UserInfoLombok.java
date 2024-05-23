package com_set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfoLombok {
	private String firstName;
	private String secondName;
	@Builder.Default
	private int age = 30;
	
	public String getUserInfo() {
		return String.format("firstName: %s, secondName: %s, age: %d", firstName, secondName, age);
	}
}
