package Generic;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		// 타입 제안 ... 맨 뒤에 <> 해도 되고 <String> 해도 됨
		
		list.add("1");
//		list.add(new Integer(1)); //어떤 타입이 오든 상관 없었는데 타입 제한이 생겨서 타입이 불일치하다(String외에는 받아들이지X)
		list.add("2");
		list.add("2");
		
		for(int i=0; i<list.size();i++) {
//			String s = (String) list.get(i); // get 사용시 반환 타입이 object였는데 제네릭 타입을 string으로 정의했기 때문에 반환 타입이 string 으로 바뀐다 == 캐스팅 할 필요가 없음
			String s = list.get(i);
			System.out.println(s);
			
		}
		for (String s : list) {
			System.out.println(s);
		}

	}

}
