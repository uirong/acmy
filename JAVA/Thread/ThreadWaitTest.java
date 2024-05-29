package ThreadProject;

public class ThreadWaitTest {

	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();
		
		new Thread(new Cook(table),"손님1").start(); // 0.001s
		new Thread(new Customer(table,"도넛"),"손님1").start(); // 0.01s
		new Thread(new Customer(table,"파스타"),"손님2").start(); // 0.01s
		// run()메소드를 while문으로 무한루프로 반복이 끝나지 않는다
		Thread.sleep(2000); // 2
		System.exit(0);

	}

}
