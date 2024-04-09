package ex01_Inheritance;

public class Parent {
	int x;
	int y;
	
	Parent(){ // 실제로는 기본 생성자는 생략 할 수 있기 때문에 굳이 안적지만 내부에는 있다
		// 부모 클래스를 호출 할 수 있다
		super(); // 모든 클래스는 Object클래스를 상속 받는다... 하지만 역할이 없기 때문에 생략가능
	} // 생략가능
	
	Parent(int x,int y){
		this.x=x;
		this.y=y;
	}
}
