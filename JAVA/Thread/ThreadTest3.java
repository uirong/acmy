package ThreadProject;

public class ThreadTest3 {

	public static void main(String[] args) {

		ThreadEx4_1 th1 = new ThreadEx4_1();
		ThreadEx4_2 th2 = new ThreadEx4_2();
		
		th1.start();
		th2.start();
		
//		System.out.println("<<main 종료>>");
		
		try {
			Thread.sleep(2000); //ms 기준
			// 현재 sleep()메소드를 호출한 Thread를 일시정지 시킨다
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}// 프로그램 돌아가기 전까지 알아서 돌아간다
		System.out.println("<<main 종료>>");
	}

}
