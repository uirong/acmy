package circle;

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
	
}
