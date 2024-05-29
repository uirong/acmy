package ThreadProject;

public class ThreadTest1 {

	public static void main(String[] args) {
		
		
		// 특징
		// 1) 순서대로 실행되지 않음
		// 2) 끝나는 순서도 정해져있지 않음
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		Runnable r = new ThreadEx2_1();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
//		부여한 ?쓰레드 이름
		/*
		t1.run();
		t2.run();
		*/
		
		// run을 실행하면 thread-0 ; main...으로 함
		// 하나의 프로그램은 하나의 스텍 안에 메소드가 하나씩 실행됨 메소드 
		// 메소드는 다 반복하면 원래 자리로(스텍) 돌아가 사라지게 된다
		// 쓰레드 형식으로 만들었지만 동작 방식을 run으로 하면 일반적인 클래스 호출로 된다
		// 한번에 한번씩 밖에 안됨
		// start 만들면 하나의 스텍을 또 만그어서 run()을 만든다m
		// main 호출하는 것은 (t1스레의 start();
		// run 메소드를 할당 할 수 있는 start()를 만든다 
		// 메인함수를 실행해서  안의 내용을 다 실행하면 마지막 스레드 블록을 만나면 프로그램이 끝난다
		//처리하는 데이터 양이 많으면 thread-1thread-2 로 순서대로 나오지 않고 -1 -1 -2 -1 -1 -1 -2... 이런식으로 나올 수 있음
		// thread는 동작할 때 순서가 없다
		
		
	}

}
