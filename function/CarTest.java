package function;

public class CarTest {

	public static void main(String[] args) {
		
		Car c=new Car(); // new Car() 부분이 객체를 생성하는 곳
	/*	
		c.color="white";
		c.gearType="auto";
		c.door=3;
		// 값을 주고난 이후에 값을 변경해야할 때 사용
	*/
		
		// 대부분 생성자를 이용한 생성자 방법을 사용한다
		System.out.println(c.color);
		System.out.println(c.gearType);
		System.out.println(c.door); // red \n Auto \n 4
		
		System.out.println();
		
		Car c2=new Car(); // new Car() 부분이 객체를 생성하는 곳
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);

		System.out.println();
		
		Car c3=new Car("blue","auto");
		System.out.println(c3.color);
		System.out.println(c3.gearType);
		System.out.println(c3.door);

		System.out.println();
		
		Car c4=new Car("black","auto",4);
		System.out.println(c4.color);
		System.out.println(c4.gearType);
		System.out.println(c4.door);
	}

}
