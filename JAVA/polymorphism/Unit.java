package polymorphism;

public abstract class Unit {

	int x;
	int y;
	
	// 캐릭터가 움직임을 구현 x y값으로 지상과 지하를 움직인다
	abstract void move(int x,int y);
	// 일반클래스로 하지 않고 추상클래스로 만든다(효율을위해)
						// abstract : 강제성을 주는느낌 자식이 오버라이딩 굳이 안해도 ㄱㅊ
	// 메소드에만 abstract 하면 안되고 클래스애도 abstract 해야한다
	void stop() {
		
	}
	
}
	