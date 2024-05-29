package ThreadProject;

public class TreadTest6Account {

	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	// Tread동기화는 메소드에 적용한다
	
	// 동기화 처리가 안되어 있으면 나의 코드 작성과 의지와 상관없이 코드 중간에 꼬인다 
//	resume(); suspend(); : 동기화 x
	
	
	public /*synchronized*/ void withdraw(int money) {
		//synchronized 특정 메소드에게만  동기화 처리
		
		synchronized(this){
			
		if(balance >= money) {
			try {
				Thread.sleep(1000); // 나중에 account 쓰레드를 사용하는 클래스를 멈추겠다
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			 
			balance -= money;
			}
		
		}	
	}
}
