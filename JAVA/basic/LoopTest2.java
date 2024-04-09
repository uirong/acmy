package basic;

import java.util.Scanner;

public class LoopTest2 {

	public static void main(String[] args) {

		// *****
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println();

		// while
		int l=1;
		while(l<=5) {
			int w=1;
			while(w<=5) {
				System.out.print("*");
				w++;
			}System.out.println(); l++;
		}
		
		// 오른쪽의 반쪽트리
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		// 왼쪽의 반쪽트리
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j<6) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		System.out.println();
		
		// 리버스 트리
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		
		// 피라미드
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5+i-1;j++) {
				if(i+j<6) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		System.out.println();
		
		//???
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j>=n+i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<i*2-1;k++);
				System.out.print("*");
			} System.out.println();
		// 오른쪽트리
		for(int i=0;i<=5;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<i*2-1;k++) {
				System.out.print("*");
			} System.out.println();
		}
		
		// lotto
		
		int lotto;
		for(int i=1;i<20;i++) {
			lotto=(int)(Math.random()*45)+1;
			System.out.println(lotto);
		}
		
		// boolean
		boolean flag=true;
		while(flag) { // true false 가려내기
			Scanner in = new Scanner(System.in);
			System.out.print("입력>>");
			int answer=in.nextInt();
			if(answer==1) {
				System.out.println("1번");
			}else if(answer==2) {
				System.out.println("2번");
			}else if(answer==3) {
				System.out.println("3번 종료");
				flag=false;
				
			}else {
				System.out.println("잘못된번호입니다");
			}
		}
		
		
	}

}
