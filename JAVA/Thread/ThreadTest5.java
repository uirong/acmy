package ThreadProject;

public class ThreadTest5 {

	  public static void main(String[] args) {
	     Runlmpl5_1 r = new Runlmpl5_1();

	     Thread th1 = new Thread(r, "*");
	     Thread th2 = new Thread(r, "**");
	     Thread th3 = new Thread(r, "***");

	     th1.start();
	     th2.start();
	     th3.start();

	     try {
	        Thread.sleep(2000); // main thread 2초동안 일시정지
	        th1.suspend(); // th1번 스레드를 일시정지 2 번 3번만 진행
	        Thread.sleep(2000); // 2초뒤에
	        th2.suspend(); // 2번 스레드 일시정지 3번만 진행
	        Thread.sleep(3000); // 3초 뒤에
	        th1.resume(); // 1번 스레드 재시작 suspend()를 풀어줌
	        Thread.sleep(3000); // 3초 뒤에
	        th1.stop(); // 1번 스레드 중지
	        th2.stop(); // 2번 스레드 중지 (3번 스레드만 진행 )
	        Thread.sleep(2000); // 2 초 뒤에
	        th3.stop(); // 3번 스레드 정지

	      } catch (Exception e) {
	         e.printStackTrace();
	      }

	   }

	}