package team;

import java.util.Scanner;

public class ReservationSystem {
	static Scanner sr=new Scanner(System.in);
	static UserData[] userData=new UserData[10];
	static CarInfor[] carinfo=new CarInfor[3];
	
	
	public static void main(String[] args) {
	
		int menu;
		String answer;
//		int reply;
		while(true) {
			showMenu();
			System.out.print("메뉴 선택> \n");
			menu=sr.nextInt();
			
			if(menu==1) {
				UserInform();
			}else if(menu==2) {
//				CarBook();
			}else if(menu==3) {
//				CarDel();
			}else if(menu==4)  {
//				CarCheck();
			}else if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
	
	static void showMenu() {
		System.out.println("----------------");
		System.out.println("1. 유저 정보 등록");
		System.out.println("2. 차량 정보 등록");
		System.out.println("3. 차량 삭제");
		System.out.println("4. 예약 확인");
		System.out.println("0. 종료");
		System.out.println("-----------------");
	}
	
	
	static void UserInform() {
		System.out.println("예약자 정보입력하기");
		System.out.println("--------------");
		
		System.out.print("예약자 성명 : ");
		String name =sr.next();
		System.out.print("예약자 나이 : ");
		int age=sr.nextInt();
		if(age<19) {
			System.out.println("연령 조건이 맞지 않습니다");
			return;
		}
		System.out.print("예약자 전화번호 : ");
		int num=sr.nextInt();
		
		
		System.out.print("면허종류 1종: 1 / 2종: 2");
		int card=sr.nextInt();
		System.out.println("--------------");
	
	
		for(int i=0;i<10;i++) {
			if(userData[i] ==null) {
				userData[i]=new UserData(name,age,num,card);
				System.out.println("사용자 정보 저장");
				break;
			}
		}
	}
	
	
	
	static void CarBook() {
	  int conChoice;
      String choiceCar;
      String msg = "원하시는 차량 브랜드를 고르세요";
      String msg2 = "";
      CarInfor info = new CarInfor("");
      
      int a = 0;
      
      while (a < 2) {
         System.out.println(msg);
         info.carInfo();
         System.out.print("입력: ");

         conChoice = sr.nextInt();
         if (conChoice == 1) {
            info.carHyunDai();

            System.out.print("원하는 차량 선택 :");
         } else if (conChoice == 2) {
            info.carKia();
            System.out.print("원하는 차량 선택 :");
         }
         choiceCar = sr.next();
         for (int i = 0; i < 10; i++) { 
            if (carinfo[i] == null) {
               carinfo[i] = new CarInfor(choiceCar);
               if ((conChoice == 1)) {
                  msg2 = "선택한 브랜드는 현대,";
               } else if (conChoice == 2) {
                  msg2 = "선택한 차량은 기아,";
               }
               msg2 = msg2 + "선택하신 차량은" + carinfo[i] + "입니다";
               System.out.println(msg2);
               break; // 배열 에서 null 값이 없을때 종료

            }
         }
         a++;

      }
	}
	
	
	
	
	
	
	
	
//	
//	static void CarCheck() {
//		System.out.println("예약 전체 조회");
//		if(userData.length==0) {
//			System.out.println("저장된 차량예약이 없습니다");
//			return;
//		}for(int i=0;i<userData.length;i++) {
//			if(userData[i] !=null) {
//				System.out.println((i+1)+"번 - ");
//				userData[i].UserShow();
//			}
//		}
//	}
	
	
} //!

	
