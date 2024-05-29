package ThreadProject;

public class Customer implements Runnable {

	
	private Table table; // 테이블 기능을 사용하기 위해 변수로 테이블 타입의 멤버변수 선언
	private String food; // 사람이 먹기로 한 음식의 종류
	
	public Customer(Table table, String food) { // table food 초기화
		this.table = table;
		this.food = food; // 고객이 먹을 수 있는 음식
	}

	@Override
	public void run() { // 음식을 반복적으로 먹게 만들어놓기
		while(true) {
			// 음식을 0.001초마다 만들고 있지만 먹는 속도는 그것보다 느리게 설정
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
			}
			
			String name = Thread.currentThread().getName(); // 햄버거/도넛을 먹고있는 고객이 작동하는건지... 어떤 쓰레드가 동작하고 있는건지
			
			table.remove(food); // 테이블에 있는 음식을 지운다
			System.out.println(name + " 먹었다 " + food);
			 
			
			/*
			if(eatFood() ) { // 음식을 잘 먹었는지 안먹었는지 체크 잘 먹었으면 true을 반환
				System.out.println();
				System.out.println(name + "먹었다 " + food);
			}else { // 못먹었다고 표시
				System.out.println();
				System.out.println(name + "못먹었다 " + food);
			}*/
		}
	}
	/*
	boolean eatFood() {
		return table.remove(this.food); // 고객이 먹을 수 있는 음식
	}
	*/
}
