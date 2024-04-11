package interfaces;

public class Medic extends GroundUnit implements Medicalable{

	Medic() {
		super(80);
		hitPoint=MAX_HP;
	}
	
	void repair(Medicalable m) {
		Unit u=(Unit) m;
		
		while(u.hitPoint != u.MAX_HP) {
			u.hitPoint++;
		}
		System.out.println(u.toString()+" 의 수리 완료");
	}
	

}
