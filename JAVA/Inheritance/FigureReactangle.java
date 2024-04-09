package Inheritance;

import circle.Ractangle;

public class FigureReactangle {

	public static void main(String[] args) {
		
		Ractangle r=new Ractangle(4,5);

		System.out.println(r.getArea());
		int square =r.getArea();
		System.out.println(square);


//------------ circleChild 클래스에서 원주율 구하는 것 상속해서 원주율 구하기 ------------
		
		CircleChild cc=new CircleChild(5,30); // 반지름 : 5, 각도 : 30도
		// 패키지가 다르니 import
		System.out.println(cc.getArea2());
		

	}

}
