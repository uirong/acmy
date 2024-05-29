package ThreadProject;

public class ThreadEx2_1 implements Runnable {

	   // run()메소드를 오버라이딩 해야 한다.
	   
	      @Override
	      public void run() {
	         for(int i = 0; i<5; i++) {
	            System.out.println(Thread.currentThread().getName());
	         }
	      }
	}