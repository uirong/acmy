package basic;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		
		int sum=30; int avg=50;
		System.out.println("총합은"+sum+"\n값은"+avg);
		
		
		Scanner sr = new Scanner(System.in);
		System.out.print("3자리수 입력?>> ");
		int num=sr.nextInt();
		
		System.out.println(num/100*100);

		
		
		int[] ar= {1,2,3,4,5};
		int[] ar1=new int[5];
		
//		for(int i=0;i<arr.length;i++){
		for(int i=0;i<3;i++){ // arr1의 3번
//				arr2[i+2]=arr1[i];
				ar1[i+2]=ar[i+2];
		}System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ar1));
		
		
		Scanner in=new Scanner(System.in);
		System.out.print("정수를 입력한다");
		int a=in.nextInt();
		in.nextLine();
		System.out.print("연산자를 입력한다");
		String s1=in.nextLine();
		System.out.print("정수를 입력한다");
		int c=in.nextInt();
		
		switch(s1) {
		case "+":
			int mul=a+c;
			System.out.println(mul);
			break;
		case "-":
			int min=a-c;
			System.out.println(min);
			break;
		case "*","x":
			int mut=a*c;
			System.out.println(mut);
			break;
		case "/":
			int div=a/c;
			System.out.println(div);
			break;
		default:
			System.out.println("잘못된어쩌구");
		}
		
		

	}

}
