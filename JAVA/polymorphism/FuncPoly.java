package polymorphism;

public class FuncPoly {

	void doWork(Car c) { // 사용할 수 있는 객체개수 3개
		// instanceof
		
		// fe가 Car로 캐스팅이되고 c를 instanceof로 물어보는것
		
		if(c instanceof FireEngine) { // c에게 FireEngine인지 물어보는 코드
			
			// water를 사용할 수 없기 때문에 FireEngine 타입으로 바꾸어줘야한다
			FireEngine fe= (FireEngine)c;
			fe.water();
		}else if(c instanceof Ambulance) { // 자식의 개수만큼 instanceof를 사용
			Ambulance ab= (Ambulance)c;
			ab.siren();
		}
	}

}
