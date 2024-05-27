package Generic;

public class boxTest {

	public static void main(String[] args) {
		
		Box<String> box = new Box<String>(); // 생성되는 변수타입 앞 뒤에 생성되는 애한테 <>.  이렇게 타입을 지정해서 객체를 생성하는 클래스를 제네릭이라고 함
		// 뒤 부분의 제네릭 타입은 생략 가능
		// T라고 적는 모든 애들은 String 타입이라고 인식
		/*
		box.setItem("ui");
		System.out.println(box.getItem());
		*/

	}

}
