package ThreadProject;

public class ThreadEx5_1 extends Thread{

	@Override
	public void run() {
		
		int i = 10; // 10 9 8 7 6 해야하니까
/*
	      while (i != 0 && !isInterrupted()) { // 초기값이 false
	         System.out.println(i--);
//	         for (long x = 0; x < 250000000000000000l; x++) {
//	         }
	         try {
	        	 Thread.sleep(1000);
	         }catch(InterruptedException e){ // InterruptedException에 대한 오류를 잡음
	        	 
	         }
	      }
*/	      
	      while (i != 0 && !isInterrupted()) { // 초기값이 false
		         System.out.println(i--);
		         try {
		        	 Thread.sleep(1000); // 1초 지연
		         }catch(InterruptedException e){ 
		        	 // interrupt();// false로 자동 초기화 .Interrupted 속성 값을 false로 자동초기화
		        	 System.out.println("InterruptedException 발생됨");
		         }
		      }

	      System.out.println("카운트종료");
	   }

	}