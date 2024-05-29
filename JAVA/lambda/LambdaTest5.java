package lambDaStream;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaTest5 {

	public static void main(String[] args) {

		// 람다식에 메소드 참조 방식 ( 매개변수 생략, : :)
		// 람다식이 하나의 메소드만 호출하는 경우에는 메소드 참조라는 방식으로 호출할 수 있다
		
//		Function<String,Integer> f = s -> Integer.parseInt(s);// s로 받고 받은 문자열을 숫자로 변경한다
		Function<String, Integer> f = Integer::parseInt;
			
		int i = f.apply("100");
		System.out.println(i+100);
		
//		BiFunction<String,String,Boolean> f2 = (s1,s2) -> s1.equals(s2); // s1에서 s2를 가져온다
		BiFunction<String,String,Boolean> f2 = String :: equals;  // 메소드 참조방식은 매개변수를 사용 할 수 없다 .  equals
 		boolean b = f2.apply("hello", "hello"); // 레퍼 클래스
		System.out.println(b);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
//		list.forEach(i -> System.out.println(i));
		list.forEach(System.out::println);

	}

}
