package circle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Circle {
	
	// 패키지가 다른 곳에서 가져다 써야할 때에는 public 을 변수 앞에 붙여서 문을 열어놔야한다
	
	public int radius; // 반지름
	public final double PI=3.14; // 파이값은 바뀌면 안된다. 상수값을 사용해야하고 대문자로만 이루어진 거는 상수값이라고 약속함
	
	public Circle(int radius){
		this.radius=radius;	
	}
	// 원의 넓이를 구해서 외부로 반환하는 메소드
	public double getArea() {
		return radius*radius*PI;
	} // 원의넓이를 구하는 코드
	
	
	
/*	
	// protected private 설명
	
//	private int radius;   private라서 '같은 클래스 내'에서만 사용가능
//  Getter Setter를 통해 메소드를 공유할 수 있게 해야한다
	

	protected int radius; // 같은 패키지에서만 사용가능
	protected final double PI=3.14; // 상속인 경우에는 protected에서는 예외적으로 사용 가능하다
	// 만약 여기에서 protected를 지우면 패키지가 달라지고 상속이 되었다하더라도 다른 곳에서 사용 불가
//	private final double PI=3.14;  
	
//	
	public Circle(int radius){ // public이 아니라면 외부에서 사용할 수 없다
		this.radius=radius;	
	}
	
//	private Circle(int radus) { 생성해야 객체를 가져올 수 있기 때문에 생성자에서 호출도 안되고 생성도 못한다 
//		this.radius=radius;
//	}
	public double getArea() {
		return radius*radius*PI;
	}
	
*/ 	
}
