package lambDaStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LambdaTest3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
		// Iterator 방식
		Iterator <Integer> inter = list.iterator();
		while (inter.hasNext()) {
			Integer /*int*/ iter = inter.next();
			System.out.println(iter);
		}
		

		System.out.println();
		
		
		// 향상된 for
		for(int num : list) {
			System.out.println(num);
		}
		
		System.out.println();
				
		// 함수형 인터페이스
		// 함수형 인터페이스가 람다식을 받는다
		// myFuntion에 run()으로 정의 했기 때문에 run()사용
		
		list.forEach(i -> System.out.println(i)); // 매개 변수가 있으면 (i) 안해도 됨
		
		
		// 2의 배수 또는 3의 배수를 삭제
		list.removeIf(x -> x % 2 ==0 || x % 3 == 0); // removeIf에 조건에 맞는 데이터 삭제가 있다
		System.out.println();
		System.out.println(list);
		 
		
		
		list.replaceAll(i -> i *10);
		System.out.println(list);
		
		
		Map<String,String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		
	// Iterator방식
		Iterator<Map.Entry<String,String>> it2 = map.entrySet().iterator();
		
		while(it2.hasNext()) {
			Map.Entry<String,String> entry = it2.next();
			System.out.println("key : " + entry.getKey() +  ", value : " + entry.getValue());
		}
		System.out.println();
        
	// 향상된 for 
	   for(Map.Entry<String, String> entry : map.entrySet()) {
		   System.out.println("key : "+ entry.getKey() + " , value" + entry.getValue());
	   }
	   System.out.println();

	// 함수형 인터페이스
	   map.forEach((k,v) -> System.out.println("{" + k + ", " + v + "},"));
	   
	}
}
