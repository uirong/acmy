package basic;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		
		
		// 산술연산자
		// +,-,*,/(몫),%(나머지)
		
		int x=5;
		int y=2;
		System.out.println(x+y);
		System.out.println(x*y);
		System.out.println("몫 : " + x/y);
		System.out.println("나머지 : " + x%y);
		
		
		// 증감연산자
		int a=10;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		++a;
		System.out.println(a);
		--a;
		System.out.println(a);
		
		int x1=10;
		int result;
//		result = ++x1+10;
		result = x1+++10;
		System.out.println(x1);
		System.out.println(result);
		
		
		// 비교연산자
		int q=10;
		int w=20;
		System.out.println(q==w);
		System.out.println(q!=w);
		
		
		// 논리연산자
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		System.out.println(!true == false); // true
		System.out.println(!false == true); // true
		
		int e=10;
		int r=20;
		System.out.println((e==10)&&(r==20)); // true && true-> true;
		System.out.println((e==10)&&(r!=20)); // true && false-> false;
		System.out.println(e==10 || r==20); // true
		System.out.println(e!=10 || r==20); // true
		
		
		
		System.out.println(!true);
		System.out.println(!(e!=10 || r!=20)); // 값을 묶어버리면 전체 결과를 부정하게 된다
		
		int in=5;
		System.out.println(in>=1 && in<=10);

		System.out.println(in<1 || in>10);
		
		
		// 조건 연산자
		int age=30;
		String st= age >=20? "성인" : "미성년자";
		System.out.println(st);
		
		
		// 복합대입 연산자
		int p=10;
		int o=5;
		o += p; // o= o+p
		p+=10; // p= p+10;
		System.out.println(p);  // 20
		System.out.println(o); // 15
		
		
		
/*		바구니 하나에 사과를 10개 담을 수 있고 사과는 123개가 있다. 그러나 사과의 개수는 변경 될 수 있다
		바구니의 개수는 몇개가 필요할까? */
		
		int apple=123;
		int mac=10;
		
		int result3= apple/mac;
		
		if(apple/mac !=0) {
			result3++;
		}
		result3= (apple/mac !=0) ? (apple/mac+1) : (apple/mac);
		
		result3= apple/mac +(apple%mac>0?1:0);
		
		
		System.out.println("총 필요한 바구니 수는 "+ result3);
		
 
/*		456-> 400 124-> 100 */
		
		Scanner in1 =new Scanner(System.in);
		System.out.print("3의자리 숫자입력> ");
		int num=in1.nextInt();
		System.out.println(num/100*100);
		
		
		// 단항연산자 : ++, --
		// 이항연산자 : +,*
		// 삼항연산자 : 조건식?true값:false값
		
		
		
		
		

		
	}

}
