package Inheritance;

public class PrintTest {

	public static void main(String[] args) {
		
		Print3D p3=new Print3D();
		p3.x=10;
		p3.y=20;
		p3.z=30;
		System.out.println(p3.getLocation());
	}

}
