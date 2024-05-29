package ThreadProject;

public class ThreadTest6 {

	public static void main(String[] args) {
		
		Runnable r = new RunnableEx6_1();
		new Thread(r).start(); // 하나의 쓰레드 안에서 두개를 만듬
		new Thread(r).start(); // 두개의 쓰레드는 account 의 withdraw라는메소드를 운영한다

	}

}
