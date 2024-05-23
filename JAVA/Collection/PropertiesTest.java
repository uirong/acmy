package com_set;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		// k, v : 타입은 String만 사용가능
		
		Properties prop = new Properties();
		// 파일과 연경해서 쓰는 Properties

		prop.setProperty("timeOut", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		
		System.out.println(prop.get("timeOut")); // 30
		
		
		// Enumeration
		Enumeration e = prop.propertyNames(); 				// key 값을 반환한다
		while(e.hasMoreElements()) { 						// ==hasNext()같은. .  값이 있는지 없는지
//			e.nextElement(); 								// 값을 읽는다
			String element = (String)e.nextElement();		// 오브젝트로 반환하기 때문에 키 값 받고, 캐스팅을 해줘야한다
			System.out.println(element + " : " + prop.getProperty(element));
		}
	}

}
