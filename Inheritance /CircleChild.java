package Inheritance;

import circle.Circle;

public class CircleChild extends Circle { // 원의 둘레가 원주율

	int angle; // 각도
	
	CircleChild(int radius, int angle){ // radius는 부모가 생성되어있으니 부모에게 맡긴다
		super(radius);
		this.angle=angle;	
	}
	public double getArea() { // 오버라이딩
		return 2* radius*radius*PI*(angle/360); // 원주율 구하는 방법
	}
}
