package function;

public class Function {

	// 메소드 : 메모리 효율성을 위해 한번만 할당
//	리턴타입 메소명([매개변수]) {
//		실행문;
//		[return]
//	}

/*	
	// 리턴타입 : 기본형, 참조형, void == 리턴을 사용하지 않는다
	// 3가지 형태 중 하나만 사용하면 된다.
	
	// 생성하지 않으면 메모리에 생기지 않는다.
	void add() { // 메소드
		System.out.println(2+3);
	}
	
	void add2(int x,int y) { // 2개의 값을 받아서 입력하겠다 라는 뜻
		System.out.println(x + y); // 값을 클래스에서 지정해줘야한다
		// 매개변수는 지역변수
	}
	
	void add3(int x,int y) {
		int sum=x+y; // 값을 넘기긴 했지만 수행한 결과값을 호출한 입장에서는 볼 수 없다 syso로 찍으면 값을 확인이 되지만 아무튼 sum이 얼만지 알 수 없다
		
		// 함수가 한 행위에 대해 결과를 받아서 잘 수행이 되었는지 결과값을 돌려받는 것이 return
		// 빵 심부름 시켰는데 빵 사왔는지 안사왔는지 확인하는것
		
		// 호출도 했지만 return이 있는 경우 호출 값도 받는다(==돌려받는다)
	}
//	int add4(int x,int y) { // * 돌려주는 것의 데이터 타입 적기
//		int sum=x+y;
//		return sum; // 돌려주는 것을 적는다
//	}
/*	
	void add5(int x) {
		// x값이 얼마인지 판단 하기
		if(x>=10) {
			System.out.println("return문에 의한 종료");
			return; // 메소드를 강제종료를 위해 사용이 되지만 조건문에 의해서 이런식으로 사용 가능
		} // 특별한 경우에 실행시킨다
		System.out.println(x);
	}
*/
/*
	// 리턴문을 사용할 때에는 그 조건이 될경우 안될경우도 있기 때문에 두가지 경우를 명시해줘야한다
	int add6(int x, int y) { // 1.만약 맞지 않는경우 add6은 실행문이 사라지기 때문에

//		1)		
//		if(x>y) {
//			return x;
//		}else { // 2.반대 경우의 조건문을 달아줘야한다
//			return y;
//		}
//		2) else구문이 생략이 되더라도 값이 똑같기 때문에 보통은 2처럼 코드를 작성한다.		
		if(x>y) {
			return x;
		}
		return y; 
	}
*/
	
	
	// 매개변수 타입에 따른 분류
	// call by value(기본형): 값의 복사
	// call by reference(참조형(주소값)) : 클래스명, 배열
/*
	void add(int x,int y) {
		System.out.println();
		
		System.out.println(x); // 10
		System.out.println(y); // 20
		
		x=100; y=200;
		
		System.out.println(x+y);
	}
*/	
	// 주소값을 가지는 타입 : 클래스, 배열(자료형)
	
//	void change1(int x) {
//		x=1000;
//	}
//	void change2(Data d) {
//		d.x=1000;
//	}
//	
//	
//	void arrChange(int[] arr) {
//		arr[0]=10;
//	}

	// 메소드의 정의방식 2가지
	// 인스턴스 메소드
	// 클래스 메소드
	
	void instanceMethod() {
		System.out.println("인스턴스 메소드 호출");
		}
	
	static void staticMethod() {
		System.out.println("클래스 메소드 호출");
	}
	
	
	
	
	
	
}
