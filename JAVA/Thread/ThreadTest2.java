package ThreadProject;

import javax.swing.JOptionPane;

public class ThreadTest2 {

	public static void main(String[] args) {
		
		/*
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력 값은" + input + "입니다");
		
		for(int i=0;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
*/
		
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력 값은" + input + "입니다");
	}

}
// 먼저 스타트 했다고 먼저 시작하지 않음
