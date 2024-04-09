package basic;

import java.util.Scanner;

public class ConditionLoop {

	public static void main(String[] args) {
		
		// 조건문
		
		int age=20;
		if(age>=20) {
			System.out.println("성인 인증");
		}else {
			System.out.println("미성년자 입니다");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("번호입력>");
//		int select=in.nextInt();
		
		String str=in.nextLine();
		int select =Integer.parseInt(str); // 문자열 -> 정수로 변경
//		int select =3;
		if(select ==1) {
			System.out.println("1번 선택");
		}else if(select ==2) {
			System.out.println("2번 선택");
		}else if(select ==3) {
			System.out.println("3번 선택");
		}else if(select==4) {
			System.out.println("4번 선택");
		}else {
			System.out.println("번호를 잘못선택 했습니다");
		}
		
		
		
		int x=8;
		if(x%2==0) {
			if(x%3==0) {
				System.out.println("2와 3의 공배수 입니다");
			}else {
				System.out.println("2와 3의 공배수가 아닙니다");
			}
		}else {
			System.out.println("2와 3의 공배수가 아닙니다");
		}
		
		if(x%2 ==0 && x%3==0) {
			System.out.println("2와 3의 공배수입니다");
		}else {
			System.out.println("2와 3의 공배수가 아닙니다");
		}
		
		
		
		// Scanner
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하세요(1~10까지) : ");
		int num= sc.nextInt();
		
		if(num<=10 && num>=1) {
			System.out.println("1~10 까지의 수 입니다");
		}else {
			System.out.println("!!!!");
		}
		
		
		// switch
		
		int select2 =4;
		switch(select2) {
		case 1: System.out.println("1번 선택");
		break;
		case 2: System.out.println("2번 선택");
		break;
		case 3: System.out.println("3번 선택");
		break;
		default:System.out.println("틀린 선택");
		}
		
		
/* 계산기 프로그램 */
		System.out.print("정수를 입력하기");
		int numb=sc.nextInt();
		sc.nextLine();
		System.out.print("연산자(+,-,/,*)를 입력하기");
		String op=sc.nextLine();
		System.out.print("정수를 입력하기");
		int numb2=sc.nextInt();
		
		switch(op) {
		case "+":
			System.out.println(numb+numb2);
			break;
		case "-":
			System.out.println(numb-numb2);
			break;
		case "*":
			System.out.println(numb*numb2);
			break;
		case "/":
			System.out.println(numb/numb2);
			break;
		default:
			System.out.println("잘못되었습니다");
		}
		
		
		
		
		
	}

}
