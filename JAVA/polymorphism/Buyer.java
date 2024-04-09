package polymorphism;

public class Buyer {

	int money=1000;
	int bonusPoint =0;
	
	void buy(Product p) { // 물건을 살때 가격을 봐야한다 == 매개변수를 통해 봐야한다 (tv객체를 본다)
				// Product p를 하면 여기에 뭐가 들어오든 똑같이 계산 할 수 있다.
				// p만 보고는 이게 tv인지 오디오 인지 모른다 ---> instanceof
//		money= money-p.price;	
		
		if(money<p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -=p.price;
		bonusPoint += p.bonusPoint; // 돈을 지불한 만큼 보너스 포인트를 얻는다
		System.out.println(p+" 구매 완료");
						// Override된 p : Override된 클래스 값이 나온다
	}
	
//	void buy(Audio a) {
//		money= money-a.price;
//	}
//	void buy(Computer c) {
//		money= money-c.price;
//	}
	
}
