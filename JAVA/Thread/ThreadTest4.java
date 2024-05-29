package ThreadProject;

import javax.swing.JOptionPane;

public class ThreadTest4 {

	public static void main(String[] args) {
		
		// 1. interrupt()
			// interrupted 속성(boolean타입) : interrupt()호출되어지면 값이 변경된다.
			// false -> true
		// isInerrupted()
			// interrupted 속성값을 반환한다
		
		// 2. interrupt()
			// InterruptedException 타입의 예와ㅣ를 발생 시킨다
			// sleep(), wait(), join() 일시정지된쓰레드를 실행 대기 상태로 만든다
		
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		
		String start = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은" + start + "입니다");
		
		th1.interrupt(); // interrupt 속성값을 true로 변경해준다
		System.out.println("isInterrupted() : "+ th1.isInterrupted()); // 얘가 어떤 값을반환하는지 보는것 true/false
	}

}
