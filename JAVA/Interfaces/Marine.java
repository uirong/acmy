package interfaces;

public class Marine extends GroundUnit implements Medicalable{

	Marine() {
		super(40); // 매개변수를 빼고 값을 직접 넣는다
		hitPoint=MAX_HP; // 가장 하단에 있는 자식 클래스에게 변수 초기화를 시킨다
						// 부모클래스에서만 모든 변수를 초기화 하는게 아니라 자식클래스에서도 가능
	}
	@Override
	public String toString() {
		return "Marine";
	}
	
}
