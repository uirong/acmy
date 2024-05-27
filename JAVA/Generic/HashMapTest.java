package Generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String,String> cities = new HashMap<>(); // key 하고 value가 String으로 받는다
		cities.put("Tokyo", "Japen");
		cities.put("Incheon", "Korea");
		cities.put("Beijing", "China");
		cities.put("Paris", "France");
		cities.put("WashingtonDC", "USA");
		cities.put("Brazilia", "Brazil");
		
		Iterator<Map.Entry<String,String>> it = cities.entrySet().iterator(); // iterator형식으로 변환
//		Map.Entry = > getKey,getValue.     interface Entry<K,V>;
		
		
		
		/*
		while(it.hasNext()) { // 요소가 있는지 판별
			Map.Entry<String,String> entry = it.next(); // 요소를가져온다 반환타입이 Map.Entry 
			System.out.println("key : " + entry.getKey() + ", Value : "+ entry.getValue());
			System.out.println();
		 	*/
			for(Map.Entry<String, String> entry: cities.entrySet()) {
				System.out.println("key : " + entry.getKey() + ", Value : "+ entry.getValue());
				System.out.println();
			}
			
		

	}

}
