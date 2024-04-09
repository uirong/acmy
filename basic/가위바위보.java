package basic;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		// 가위1 바위2 보3
				int me;
				int com;

				while(true) {

					System.out.print("가위바위보 입력(가위:1 바위:2 보:3)> ");
					me=in.nextInt();
					com=(int)(Math.random()*3)+1;
					
				/*
					m=-2,1
					c= 1,2
					
					me com r
					1 - 1  0
					1 - 2  -1  C
					1 - 3  -2  M
					
					2 - 1  1   M
					2 - 2  0
					2 - 3  -1  C 
					
					3 - 1  2   C
					3 - 2  1   M
					3 - 3  0
					
				*/
//					int result= me-com;
//					if(result ==-2 || result==1) {
//						System.out.println("이기다");
//						break;
//					}else if(result ==-1 || result ==2) {
//						System.out.println("지다");
//					}else {
//						System.out.println("비기다");
//					}
					
					
					int result=me-com;
					
					if(me<=3 && me>=1) {

						System.out.println("컴퓨터 : "+com);
						switch(me) {
						case 1:
							if(com==2) {
								System.out.println("패배");
							}else if(com==3){
								System.out.println("승리");
								break;
							}else {
								System.out.println("비기다");
							}
							break;
						case 2:
							if(com==3) {
								System.out.println("패배");
							}else if(com==1) {
								System.out.println("승리");
								break;
							}else {
								System.out.println("비기다");
							}
							break;
						case 3:
							if(com==1) {
								System.out.println("패배");
							}else if(com==2){
								System.out.println("승리");
								break;
							}else {
								System.out.println("비기다");
							}
							break;
						}
					}else {
						System.out.println("잘못된 숫자");
					}
						
//						if(result==-2||result==1) {
//							break;
//						}
				}
	}

}
