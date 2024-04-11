package interfaces;

public class UnitTest {

	public static void main(String[] args) {
		
		
		// 생성
		Marine mr=new Marine();
		Tank tk=new Tank();
		SCV scv=new SCV();
		Medic md=new Medic();
		
		scv.repair(tk);
//		scv.repair(mr);
		md.repair(mr);
//		md.repair(tk);
	}

}
