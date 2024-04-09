package Class;

public class Card {

		// 멤버 변수
		// 인스턴스 변수 : 반드시 생성 후 사용
		// 클래스 변수 : 1) 생성 없이 사용가능 2) 변수가 공유된다
		// 자동 초기화 : 값을 주지 않더라도 기본값이 있다
	
	int iv; // 인스턴스변수
	static int cv; // 클래스 변수 : 메모리를 적게 사용하기 위해 사용
	
	
	String kind; // 무늬 (다이아,스페이드,하트 ... 문자열)
	int numb;    // 숫자
	static int width=100;   // 폭
	static int height=200;  // 높이 --> Card클래스 안에 들어가는 4가지 속성
	// -> 변수에서 1) 2)중에 하나라도 해당되면 판단하에 static 변수를 붙여 처리 할 수 있다
	
	// 공통 데이터를 사용해야하기 때문에 초기화를 시켜야한다
	// 저 위드 하이를 어디서 지정하거나 값을 받아오는거면 0으로 초기화
	// 클래스라고 하더라도 값은 바꿀수 있음
	
	
	
	
}
