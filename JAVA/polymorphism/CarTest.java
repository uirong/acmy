package polymorphism;

public class CarTest {

	public static void main(String[] args) {
		
		Car car=new Car();
		FireEngine fe=new FireEngine();
		FireEngine fe2=null; // 변수니까 초기화
		
		fe.water();
		car=fe; // Up casting. car(큰타입)와 fire(작은타입)가 상속 관계이기 때문에 가능한 코드
		// 앞에서 받는 타입... Car타입에서 받기 때문에 Car에만 있는 것만 가능. upcasting..
		// 객체의 형변환은 사용할 수 있는 멤버의 개수가 바뀐다
		// 기본형의 캐스팅은 사용할 수 있는 값의 개수가 바뀐다
		// 자식 타입이 부모타입으로 캐스팅이되면 자식들의 타입은 사용 할 수 없다
//		car.water(); // water을 받고 싶으면 fire로 타입 정의를 해줘야한다 

	}

}
