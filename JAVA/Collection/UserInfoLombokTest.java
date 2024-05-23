package com_set;

public class UserInfoLombokTest {

	public static void main(String[] args) {
		UserInfoLombok userInfoLombok = UserInfoLombok.builder().firstName("Lombok 적용")
													  			.secondName("객체생성")
													  			.build();
		System.out.println(userInfoLombok.getUserInfo());

	}

}
