package Class;

public class TvTest1 {

	public static void main(String[] args) {

		Tv t = new Tv(); // 객체생성(메모리 로딩) : 할당
		// t : new Tv()의 6개의 주소값을 가지게 된다

		t.color = "red"; // 클래스에 정의된 변수의 초기화라고 함
		t.power = true;
		t.channel = 10;

		System.out.println(t.channel);

		t.channelUp(); // 메소드의 호출

		System.out.println(t.channel);
		System.out.println();

		/////////////////////////////////
		
		Tv t2 = new Tv(); // 새롭게 똑같은 구조로 똑같이 메모리를 할당하겠다는 뜻. 원래 있던건 보존된다
		t2.color = "blue";
		System.out.println(t2.color);
		System.out.println(t.color);

		// t와 t2는 데이터를 직접 가지고 있는게 아니라 주소값을 가지고 있는 것이다
		System.out.println();
		System.out.println(t.color);
		System.out.println(t2.color);
		System.out.println();
		
		t2 = t;
		
		t2.color = "black"; // 같은 곳을 바라본다 하나의 메모리를 두개의 변수가 같이 가지고 있음
		System.out.println(t); // 주소값을 확인하는 코드
		System.out.println(t2); // 주소값을 확인하는 코드
		System.out.println(t.color);
		System.out.println(t2.color);

	}
}
