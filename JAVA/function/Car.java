package function;

public class Car {

	// 속성
	
	// 생성자 : <핵심역할> 멤버변수의 초기화(대상 : 인스턴스 변수) . 멤버변수는 자동 초기화이다
		//    클래스명과 대소문자 동일하게 작성된다
		//    메소드처럼 생겼지만 리턴타입이 없다
		//	  직접 호출해서 사용할 수 없다
		//	  객체를 생성할 때 1번만 호출 가능
		//	  생성자 오버로딩(메소드랑 같게 보면된다)
		//	  생성자 간 상호 호출
		// 	  초기화 순선
		//	  자동초기화 - 명시적 초기화 - 초기화 블럭 - 생성자 - 생성 초기화
						// 명시적 초기화는 static 초기화 가능...
						// 대부분 생성자 초기화를 한다
	
		// 	  상수는 생성자에서 한 번 초기화 할 수 있다
	
	
	
	// 기능
//	String color = "red"; // 명시적 초기화
	String color;
	String gearType;
	int door;	
	final int MAX=100; // 상수는 final로 하기
	// null / null / 0
	// 인스턴스 변수를 생성자를 통해 생성할 수 잇다
	
	
	// 참조형의 기본 값은 null
	
	Car(){ // 생성자 :  대문자에 이름을 선언 했는데 매개변수도 없고 앞에 데이터 타입도 없음 이름만 있다
		 // 생성자 오버로딩 시 생략은 판단해야한다
		// (역할이 없는) 기본생성자 생략가능
		// 생성자 간 호출 : this() : 생성자의 모양이 된다
		// this() : 생성자의 가장 위쪽에 작성해야한다
		
		
	//	MAX=100; ㅡfinal int MAX;ㅡ로 초기화 하면 이 코드를 넣어준다 
		// 정해놓고 써야하는것(3.14파이 마냥 변하지 않는값, 중력의 값)
		// 이 값은 MAX를 임의로 바꾸거나 값을 변경할 수 없다
		
		
		// this.color = "pink";
		
//		this("pink","Auto",2);
		// this사용을 하면 31이 79를 호출하게 된다 --> 생성자를 호출한다
		
/*		this.color = color;  <<<<<이것들 안쓰고 this하나면 깔끔하게 처리 할 수 있다
		this.gearType=gearType;
		this.door = door; */
		
		
		
		
		// 멤버변수
//		color = "red";
//		gearType = "Auto";
//		door = 4;
		
	} // 생성자 안을 비워놓고 해도 오류 x
	// 기본생성자는 역할이 없기 때문에 굳이 안적어도 된다, 역할이 있을 경우에는 초기화를 시켜야한다
	
	// 기본생성자의 역할과 기본 특성
	
	
	Car(String color){ // 변수를 초기화 한다. x로 넘어가는 값은 21번으로(멤버변수로) 넘어간다
				// 생성자가 한 두개가 아니기 때문에 이름을 같게 해주는게 편하다
		// this : 나 자신 내 클래스(Car) .. static이 아니기 때문에 Car.color라고는 못씀
		// 이름이 다르면 같은 데이터를 사용해서 다른 값을 가져올 수 있어서 가독성이 안좋다

//		this(color,"auto",5); // color는 red .. 나머지는 초기화
		this.color = color; // 이름이 같으면 구분하기가 어렵다
		this.gearType=gearType;
		this.door = door;
	}
	
	// 위에 멤버변수 갯수에 따라 생성자의 오버로딩 개수가 달라진다
	/*
	Car(String,String gearType){
		
	}
	Car(String color, StringType,int door){
		
	}
	멤버변수에서 필요한 만큼 초기화해서 이렇게 오버로딩을 할 수 있다
	*/
	

	Car(String color, String gearType){ 
		this.color = color; // 이름이 같으면 구분하기가 어렵다
		this.gearType=gearType;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType=gearType;
		this.door=door;
			
	}
	
	
}
