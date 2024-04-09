package Class;

public class CardTest {

	public static void main(String[] args) {
		
		System.out.println(Card.cv); // 메모리에 할당
		// 변수를 메모리에 할당된다
		// (소속 클래스명.클래스 변수)
		
//		Card c= new Card();
//		System.out.println(c.iv);
//		System.out.println(c.cv);
		
		// 한번만 메모리가 지정되고 타입이 동일한 변수가 할당된다
		// iv(인스턴스) 객체가 생길때마다 매번 할당한다
		// cv는 한번만

		
		Card c1=new Card();
		Card c2=new Card();
		
		
		c1.kind = "Hart";
		c1.numb =10;
		
		c2.kind= "spade";
		c2.numb =3;
		System.out.println(c1.kind+c1.numb);
		System.out.println(Card.width);
		System.out.println(Card.height); // 생성을 안한 형태에서도 사용 가능
		System.out.println();
		System.out.println(c2.kind+c2.numb);
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		
		
/*
		c1.iv=10;
		c2.iv=20;
		
		c1.cv=30;
		System.out.println(c1.cv); // 30
		System.out.println(c2.cv); // 30 ---> cv는 공유가 된다
		c2.cv=100;
		
		System.out.println(c1.cv);
		System.out.println(c2.cv);
*/
		
		
		
		
	}

}
