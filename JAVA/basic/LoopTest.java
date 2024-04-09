package basic;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		
		
		// 반복문
		// for, while, do-while

//		int i; // 변수 선언을 밖에다 해도 된다.
		for(int i=0;i<=10;i++) {
			System.out.println(i+"."+"Hello World!");
		}
		
		
		// 증
		for(int i=10;i>=1;i--) {
			System.out.println(i+". Hello World!"); // 1.hello world!~10.hello world! , i는 0이 나온다 . 총 11번 돌아감
		}
		
		
		// 스텝
		for(int i=1;i<=10;i+=2) { // 2씩 증가
			System.out.println(i+".Hello Wolrd!"); 
		}
		
	
		// 2개
		for(int i=1,j=10;i<=10;i++,j--) {
			System.out.println("i: "+i+", j: "+j); // i: 1 ~ i: 10,j: 10 ~ j: 1
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println("Hello Wolrd!"); // 15개의 결과가 나온다 5*3.
				
			}
		}
		
		// 반복사용한 연산
		// 1~10 까지 정수를 모두 더하세요
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.print("sum변화모습: "+sum);
			System.out.println(" i변화모습: "+i);
			sum+=i; // "sum"은 0이고 'i'는 1.  "0"+'1'=1 "1"+'2'=3 "3"+'3'=6 "6"+'4'=10..."45"+'10'=55
		}
		System.out.println(sum); // 55
		
		
//		5!= 5x4x3x2x1
		
		int fac=1;
		for(int i=1;i<=5;i++) {
			System.out.println("mul변화모습: "+fac);
			System.out.println("i변화모습: "+i);
			fac *=i;	
		}
		

		// 무한 반복 --> while문으로 사용
//		for(;true;) {
//			System.out.println();
//		}

		
		// while
//		int i=1;
//		while(i<=10) {
//			System.out.println(i+". Hello");
//			i++;
//		}
		
		int fa=1;
		int y=1;
		while(y<=5) {
			fa*=y;
			y++;
		}
		System.out.println(fa);
		
		int q=1;
		while(q<=5) { //5번반복
			int w=1;
			while(w<=3) { //3번반복 ...이 while자체가 실행문이 되는것
				System.out.println("Hello");
				w++;
			} q++;
		}
		
		
		
		// do while
		// 일단 먼저 실행후 뒤에서 조건문을 실행, 그래서 조건이 안맞아도 '한번'은 실행됨
		int e=10;
		do {
			System.out.println("Hello");
			e++;
		}while(e<=10);

		
		
		
		
		// *****
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=4;j++) { // 한 개씩 별을 찍는다. 한 행이 완성됨
//				System.out.print("*");
//			}System.out.println();
//		}
//		
//		System.out.println();
		
//		
//		int l=1;
//		while(l<=3) {
//			int w=1;
//			while(w<=4) {
//				System.out.print("*");
//				w++;
//			}System.out.println(); l++;
//		}

		
		// 반쪽트리 만들기
		
//		for(int i=1;i<=5;i++) { // 몇번 반복할지 정하는 i=1,2,3,4,5
//			for(int j=1;j<=i;j++) { // 각행의 반복횟수가 똑같지 않고 각각 다르다
//				System.out.print("*");
//			}System.out.println();
//		}
//		
		System.out.println();
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i+j <6) { // 6미만
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}System.out.println();
//		}
		
		System.out.println();
		
		// 리버스 트리
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i>j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}System.out.println();
//		}
		
		
		System.out.println();
		
		// 이중 트리
		
		
		for(int i8=1;i8<=5;i8++) {
			for(int j=1;j<=5+i8-1;j++) {
				if(i8+j<6) { // i j 값을 더한 값이 6미만일 때 공백 찍
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		
//		
////		int n=5;
////		for(int i=1;i<=5;i++) {
////			for(int j=1;j>n-1;j++) {
////				System.out.print(" ");
////			}
////			for(int k=1;k<*2-1;)
////			System.out.println("*");	
////		}
//		int n=5;
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(" ");
//			}
//			for(int k=0;k<i*2-1;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			n--; // 4 3 ..하나씩 줄어야한다
//		}
		
		
		System.out.println();
		
		
		
		// 반복문에 제어
		
		for(int i=0;i<=10;i++) {
			if(i>=6) {
				break;
			}
			System.out.println(i+"hello W!");
		}
		
		
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
	
		
		Scanner in=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.짜장면 2.김치찌개 3.돈까스맛있겠다 4.종료");
			System.out.print("번호선택>> ");
			int sel =in.nextInt();
			
			if(sel==1) {
				System.out.println("오늘 메뉴는 짜장면");
			}else if(sel==2){
				System.out.println("오늘 메뉴는 김치찌개");
			}else if(sel==3){
				System.out.println("오늘 메뉴는 돈까스");
			}else if(sel==4){
				System.out.println("종료");
				break;
			}else {
				System.out.println("잘못된 어쩌구");
			}
		}
		
	
		for(int i=1;i<=15;i++) {
			if(i==3) {
				break;
			}
			System.out.println("out for ing");
			
			for(int j=1;j<=5;j++) {
				if(j==2) {
					break; // 자신을 제어하고 있는 for문 만을 제어한다
				}
			}
			System.out.println("Hello World!");
		}
		
		
		// 난
		System.out.println(Math.random()*10); //0.xx ~ 9.xx
		System.out.println((int)Math.random()*10); // 0 ~ 9, 실수>정수로 캐스팅을 했기 때문에 실수로 안나옴
		System.out.println((int)(Math.random()*10)+1); // 1 ~10( )로 우선순위를 만들어주고 +1
		System.out.println(Math.random());
		
		// 공식
//		(int)(Math.random()* 난수의 갯수)+난수의 최소값(정수일경우) // 난수 개수를 구하는 법 : 난수의 최대값 - 난수의 최소값 +1
		// System.out.println((int)(Math.random()*45-1+1)+1); //1 ~ 45
		
		
		int lotto;
		for(int i=1;i<=20;i++) {
			lotto= (int)(Math.random()*45-1+1)+1;
			System.out.println(lotto);
		}
		
		
		
		// 가위1 바위2 보3
		int me;
		int com;
		while(true) {
			System.out.print("가위바위보 입력(가위:1 바위:2 보:3)> ");
			me=in.nextInt();
			com=(int)(Math.random()*3-1+1)+1;
			
			int result= me-com;
			if(result == -2 || result==1) {
				System.out.println("이기다");
				break;
			}else if(result == -1 || result ==2) {
				System.out.println("지다");
			}else {
				System.out.println("비기다");
			}
		}
		
		
		boolean flag=true;
		while(flag) { // true false를 가려내기 위해 씀
			System.out.print("입력>>");
			int sel=in.nextInt();
			if(sel==1) {
				System.out.println("1번");
			}else if(sel==2) {
				System.out.println("2번");
			}else if(sel==3) {
				System.out.println("3번 프로그램 종료");
				flag=false;
			}
		}
		
		
		
		
		
		
	}

}
