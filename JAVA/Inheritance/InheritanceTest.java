package Inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.age=10; // 상속을 받았다는 뜻
		System.out.println(c.age); // 10 30
		
		c.add(10, 20); // 연산 가능

	}

}
