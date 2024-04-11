package interfaces;

public class SCV extends GroundUnit implements Repairable {

	SCV() {
		super(60);
		hitPoint=MAX_HP; // max_hp는 새로 생길 수는 있지만 체력이 60인건 고정이어야한다
	}
//	매개변수 타입(받아와야하는 정보)가 다르기 때문에 오버로딩이다
	// 타입을 묶어주는 용도로 하나의 인터페이스로 만든다 -> 3개(scv,tank,dropship)를 상속구조로 만들어준다
	// 인터페이스의 매개변수에 대한 활용
	void repair(Repairable r) { // 수리를 한다
		// repairable을 상속한 애들만 해당되는 코드
//		if(r instanceof Tank) { // r이 받을 수 있는건 tank svc drop이니까 r 너 tank 맞니 하고 체크하는것
//			// r을 tank로 다운캐스팅 한것
//			Tank t = (Tank)r;
//			t.hitPoint++;
		Unit u=(Unit)r; // u는 tank일 수도 있고 svc가 될 수도 잇고..
		
		while(u.hitPoint != u.MAX_HP) {
			u.hitPoint++; // MAX_HP까지 치료가 된다
		}
		System.out.println(u.toString()+" 의 수리가 완료");
		}
	}
