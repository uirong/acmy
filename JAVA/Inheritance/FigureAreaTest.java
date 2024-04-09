package Inheritance;

import circle.Circle;

public class FigureAreaTest {

	public static void main(String[] args) {
		
		
		Circle c=new Circle(5); // 같은 패키지가 아니기 때문에 오류가 뜬다
		double circleArea =c.getArea();
		
		System.out.println(circleArea); // 반지름이 5인 원의 넓이는?
	}

}
