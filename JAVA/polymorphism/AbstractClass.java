package polymorphism;

public abstract class AbstractClass {
	
	// 추상클래스의 특징
	// 멤버변수, 메소드, 생성자
	// 추상 메소드(선언부만 있고 구현부는 없다)
	// 객체 생성이 불가
	// 상속만 가능하다
	// 자식클래스 반드시 추상메소드를 오버라이딩 해야한다

	
	int x;
	int y;
	
	AbstractClass(){
		
	}
	void add() {
		System.out.println(2+3);
	}
	abstract void play(int pos); 
	
}
