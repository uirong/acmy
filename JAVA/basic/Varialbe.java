package basic;

public class Varialbe {

	public static void main(String[] args) {
//		int x;
//		x=10;
//		System.out.println(x);
//		x=20;
//		System.out.println(x);
//		int y=30;
//		System.out.println(y);
		
		boolean bn= false;
		byte b=10;
		short s=20;
		int i=30;
		long l=40l;
		
		float f=3.14f;
		double d=3.14d; // 생략가능, 대소문자 상관X
		
		char c='A';
		System.out.println((int)c);
		String str="A";
		System.out.println(str);
		
//		지역변수 : 반드시 초기화 해야한다
//		지역변수가 X :  자동 초기화가 된다
		
		System.out.println("hello \n wolrd!");
		String st="\"hello world\"";
		System.out.println(st);
		System.out.println("c:\\adv\\123\\1.jpg");
		
		byte bt=10;
		int it;
		it=bt; // byte-> int(자동형변환)
		
		int i2=300;
		byte b2=(byte)i2; // (강제형변환) , 값의 손실 발생
		System.out.println(i2); //300
		System.out.println(b2); //44
		
		float f2=3.14f;
		double d2;
		d2=f2;
		System.out.println(d2);
		
		// 연산에서의 형변환
		byte b0=10;
		byte b1=20;
		byte result=(byte)(b0+b1); // byte +byte -> int + int =int
		System.out.println(result);
		
		
		// 문자열 + anytype (연결연산자)
		String str1="java";
		int ver=11;
		System.out.println(str1+ver); // "java" + "10" => "java10"
		
	

		
		
	}

}
