package Inheritance;

public class Print3D extends Print { // 3D프린터는 x y z까지 나온다
	int z;
	
	// 메소드 오버라이딩
	// 부모의 메소드랑 똑같은 메소드를 다시 만든다 (선언부)
	// 매개변수까지 완전 똑같아야하는데 오버라이딩은 구현부는 재정의 해야한다
	// 그래서 구현부는 재정의 한다
	
	// this는 (자식)나. super. 은 부모 것을 사용할 수 있다
	String getLocation() {
//		return null;
		
//		return "x: "+x+", y: "+y+",z: "+z;
		return super.getLocation() + ",z : "+z;
	}
}
