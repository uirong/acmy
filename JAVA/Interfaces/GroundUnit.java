package interfaces;

public class GroundUnit extends Unit {
	
	GroundUnit(int hp){ // 부모가 생성자를 만들었으니 자식도 만들어야한다
		super(hp);
		hitPoint=MAX_HP;
	}
}
