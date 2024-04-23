package team;

import java.util.Scanner;


public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);
	private static Object ano;
    
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");
            
            int selectNo = scanner.nextInt();
         
            
            if(selectNo == 1) {
            	createAccount();
            } else if(selectNo == 2) {
            	accountList();
            } else if(selectNo == 3) {
            	deposit();
            } else if(selectNo == 4) {
            	withdraw();
            } else if(selectNo == 5) {
            	System.out.println("프로그램 종료");
                break;
            }
        }
    }
    
    //계좌생성하기
    private static void createAccount() {

        System.out.println("------------------------------------------");
        System.out.println("                  계좌생성                  ");
        System.out.println("------------------------------------------");
        System.out.println("계좌번호를 입력하세요> ");
        String ano=scanner.next();
        System.out.println("계좌주를 입력하세요> ");
        String owner=scanner.next();
        System.out.println("초기입금 금액을 입력하세요> ");
        int balance=scanner.nextInt();
        
        for(int i=0;i<100;i++) {
        	if(accountArray[i]==null) {
        		accountArray[i] =new Account(ano,owner,balance);
        		System.out.println("결과 : 계좌가 생성되었습니다");
        		break;
        	}
        }
    }
    
    //계좌목록보기
    private static void accountList() {
        if(accountArray.length==0) {
        	System.out.println("조회되는 계좌가 없어요");
        	return;
        }
        for(int i=0;i<=accountArray.length;i++) {
        	if(accountArray[i]!=null) {
                System.out.println("------------------------------------------");
                System.out.println("                  계좌목록                  ");
                System.out.println("------------------------------------------");

                System.out.println(accountArray[i].ano+"\t"+accountArray[i].owner+"\t"+accountArray[i].balance+"\n");
                break;
        	}
        }
        
    }
    // end
    
    //예금하기
    private static void deposit() {
         System.out.print("예금할 계좌 번호를 누르세요");
         String plus=scanner.next(); // 계좌번호
         System.out.print("예금액을 치세요");
         int coin=scanner.nextInt(); // +돈
         
         boolean found=false;
         for(int i=0;i<100;i++) {
        	 if((accountArray[i].ano).equals(plus)&&accountArray[i]!=null) {
//        		 int sum=coin+accountArray[i].balance;
	        	 System.out.println("------------------------------------------");
	             System.out.println("                   예 금                   ");
	             System.out.println("------------------------------------------");
	             System.out.println("계좌번호 : "+plus);
	             System.out.println("예금액 : "+coin);
	             System.out.println("결과 : 입금이 성공되었습니다");
	             found=true;
	             break;
        	 }else {
        		 System.out.println("계좌가 없습니다");
        		 return;
        	 }
         }
         
    }
    
    //출금하기
    private static void withdraw() {
    	System.out.print("예금할 계좌 번호를 누르세요");
        String minus=scanner.next(); // 계좌번호
        System.out.print("출금액을 치세요");
        int coin2=scanner.nextInt(); // +돈
        
        for(int i=0;i<100;i++) {
        	if((accountArray[i].ano.equals(minus))) {

//       		 int subtract = (coin2-accountArray[i].balance);
        		System.out.println("------------------------------------------");
                System.out.println("                   출 금                   ");
                System.out.println("------------------------------------------");
                System.out.println("계좌번호 : "+minus);
                System.out.println("출금액 : "+coin2);
                System.out.println("결과 : 출금이 성공되었습니다");
                return;
        	}
        }
        
        
        int money=scanner.nextInt();
        for(int i=0;i<accountArray.length;i++) {
//        	balance[i]-money;
        	break;
        }
    }
    
    
    //Account 배열에서 ano와 동일한 Account 객체 찾기
    static Account findAccount(String ano) {
//    	this.accountArray.equals(ano);
		return accountArray[i].getAno().equals(ano);
    	
    }
}
