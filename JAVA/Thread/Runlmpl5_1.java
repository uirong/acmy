package ThreadProject;

public class Runlmpl5_1 implements Runnable {

	   @Override
	   public void run() {
	      while (true) {
	         System.out.println(Thread.currentThread().getName());

	         try {
	            Thread.sleep(1000);
	         } catch (Exception e) {
	         }
	      }
	   }
	}