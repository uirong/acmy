package collectionFrame;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		
		// 문자열 대소비교 (사전의 알파벳 순서)
		String[] strArr = { "cat", "puppy", "lion", "tiger" };
		System.out.println(Arrays.toString(strArr)); // arrays toString 하면 손쉽게 데이터를 추출 할 수 있다
		
//		Arrays 클래스
//		sort() : 오름차순
		Arrays.sort(strArr); // String -> 기본정렬 방식이 정의가 되어있다 string 클래스에 이 방식을 사용하여 정렬 하라고 해서 알파벳 순으로 정렬(대문자가 먼저정렬)
		System.out.println(Arrays.toString(strArr));
		
		// sort(값, Comparator 타입의 객체) : 오름차순 할 때에는 데이터만 가져오면 된다  comparator를 오버라이딩 한 객체
		// 내림차순
		Arrays.sort(strArr, new Descending2()); // (@,>>@<<) Comparator한 애가 뒤로 오면 정해져있는 배열기준에 따라서 배열 한다
		// sort안에서 호출하지 않고 compare한 것을 호출해서 사용하도록 되어있다 strArr의 배열을 끄내온다
		System.out.println(Arrays.toString(strArr));
		
		
		
		
		
		
		// 오름차순, 내림차순
		// String 타입에서도 오버라이딩을 한다
		// Comparable : 기본 정렬을 구현할 때 사용하는 인터페이스
		// 사용하는 추상 메서드 -> int compareTo(Object o) 클래스가 직접 관여 상속 받아서 오버라이딩 함
		// 					 오버라이딩 시 양수 or 0 or 음수를 리턴하도록 구현한다 (두 수 값의 차를 구한다)
		
		// Comparator : 정렬의 기준과 방식을 변경하고 싶을 때 사용하는 인터페이스
		// 				-> int compare(Object o1,Object o2) --? 오버라이딩 하면 됨 필요할 때 꺼내서 사용
		// 				  오버라이딩 시 양수 or 0 or 음수를 리턴하도록 구현한다. (양수가 리턴되면 앞의 값이 큰것 0이면 값이 같음 음수가 리턴되면 뒤의 값이 큰 것) (두 수 값의 차를 구한다)
		
		
		
		Integer[] intg = {new Integer(1),5 , 2, 4, 3}; // autoBoxing 가능
		System.out.println(Arrays.toString(intg)); // 1, 5, 2, 4, 3
		Arrays.sort(intg);
		System.out.println(Arrays.toString(intg)); // 1, 2, 3, 4, 5
		
		
		Arrays.sort(intg,new Descending2());
		System.out.println(Arrays.toString(intg)); // 5, 4, 3, 2, 1
		
	
		
	}

}

	// Descending : 내림차순
class Descending2 implements Comparator {
	@Override
	public int compare(Object o1,Object o2) { // o1 o2를 object니까 string으로 타입변환 해줘야 한다
		// o1을 앞으로 o2가 뒤로 : 오름차순 / o2를 앞으로 o1을 뒤로 : 내림차순
		
		if(o1 instanceof Integer && o2 instanceof Integer) {
			Integer i1 = (Integer)o1;
			Integer i2 = (Integer)o2;
			
			return i1.compareTo(i2) * -1;
		}
		
		
		// 전형적인 오름차순을 하기위한 방법
		
//		if(o1 instanceof String && o2 instanceof String) {
//
//			String s1 = (String)o1;
//			String s2 = (String)o2;


			/*
			return o1 - o2 오름차순
			return o2 - o1 내림차순
			*/
			
			// return s2.compareTo(s1); // 오름차순	 궁극적으로 int형을 반환하게 된다... 계속 비교하여 양수, 0, 음수(내림차순) 반환하여 정렬을 한다
			// return s1.compareTo(s2); // 내림차순
			
			// 앞의 값을 뒤로 보내고 뒤의 값을 앞으로 보내는 : 내림차순
			
//			return s1.compareTo(s2)* -1; // 오름차순 방식.   * -1 (내림차순) 양수를 음수로 음수를 양수로 바꾸기 위해 -1을 곱한다
//		}
		return -1; // 내림차순에서 -1을 하여라
		
		
		
	}
}
