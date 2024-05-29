package ThreadProject;

public class ThreadEx4_1 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
		System.out.println("<<th1 종료>>");
	}
	
	
}
