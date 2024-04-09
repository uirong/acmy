package function;

public class Function2 {
	
	// 멤버변수와 메소드 간의 관계
	// 메소드를 사용할때의 호출 관계
	int iv;
	static int cv;
	
	
	// instance가 클래스를 사용하는건 문제가 안된다
	void instanceMethod1() {
		iv=10;
		cv=20;
	}
	void instanceMethod2() {
		instanceMethod1();
		staticMedthod1(); // instanceMethod1보다 먼저 생성되었기 때문에 가능하다
	}
	
	// static ..할당되어있는 메모리이고 iv는 객체를 생성한 시점부터 메모리 할당이 된다  static한 변수는 static한 변수만 사용 할 수 있다
	static void staticMedthod1() {
//		iv=30; (오류)
		cv=40;
	}
	static void staticMedthod2() {
//		instanceMethod1(); 생성 후에 할당을 하기 때문에 오류 발생
		staticMedthod1();
	}
	
	// 참조관계의 메모리 할당 관계 :  static은 static끼리 instance는 instance끼리

}
