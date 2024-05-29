package ThreadProject;

import team.Account;

public class RunnableEx6_1 implements Runnable {

	TreadTest6Account acc = new TreadTest6Account(); // 멤버변수는 공유 되어진다

	   @Override
	   public void run() {
	      while(acc.getBalance() > 0) {  // 100, 200, 300
	         
	         int money = (int)(Math.random()*3+1)*100;
	         acc.withdraw(money);
	         System.out.println("balance : " + acc.getBalance()); // 출금 이후의 balance 잔고 확인
	      }
	   }

	}