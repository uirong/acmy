package ThreadProject;

import java.util.ArrayList;

public class Table {
	
	String[] dishNames = {"도넛","파스타","버거"}; // 음식 준비
	
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();// 음식을 담아낼 접시 준비 == 변수를 저장하는 곳


	// add를 통해 음식을 만들어낸다 . add는 요리사가 하는 일
	
	// ! notify()는 synchronized(동기화)가 되어있는 블록에서만 사용이 가능하다
	
	public synchronized void add(String dish) { // 음식을 담아낼 기능
		  // 동기화 처리를 해서 여러 처리를 막을 수 있다.. 해당 메소드를 동기화 처리
		
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " 기다려줘요 "); // 음식을 6개 만들고 나면 좀 기다려
		
			try {
				wait(); // COOK 쓰레드를 기다리게 한다. 일시정지
				Thread.sleep(500); // 0.5
			} catch (InterruptedException e) {
			}
		}
		// 자기가먹을 음식이 없을땐 기다리고 먹고있다가 와중에도 나 음식 먹고있으니 빨리 더 내놓으라고 하는 코드
		dishes.add(dish);
		notify(); // 기다리고 있는 주문을 깨운다
		System.out.println("음식이 "+ dishes.toString());
		// 요리사 입장에서는 waiting이 되어지고 그러다가 고객 쓰레드가 있을 때 다시 전환하는 코드
		
		
		
		/*
		if(dishes.size() >= MAX_FOOD) {
			return;
		}
		dishes.add(dish);
		System.out.println("음식 : " + dishes.toString()); // 어떤 음식을 만들었고, 누가 먹을 수 있는지 확인
		*/
	}
	
	
	
	// remove를 통해 음식을 먹는다. remove는 소비자 입장
	public boolean remove(String dishName) { // 데이터를 삭제한다 > 음식을 먹는 기능
		String name = Thread.currentThread().getName();
		
		// remove가 돌아가는 때 동안 다른 메소드가 건드리지 못하게 만듬
		synchronized(this) { // 객체 자체를 동기화 처리	
			
			while(dishes.size() == 0) { // 음식을 내놓는 속도보다 먹는 속도가 빠르기 때문에 arraylist가 0이 된다
//				String name = Thread.currentThread().getName();// 고객이 기다려야한다
				
				System.out.println(name + "이 기다리고 있다");
				try {
					wait(); // wait zone으로 옮긴다
					// wait가 걸리면 일시정지 상태도 있지만 고객상태의 Rock이 풀린다 
					
					Thread.sleep(500); // 0.5초를 기다린다
					// 5개를 만들만큼의 시간을 기다리게 한다
				} catch (InterruptedException e) {
				}
			}
			
			
			for(int i=0; i<dishes.size();i++){//고객이 먹은 음식만 없애기
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i); // equals가 된 i번째 데이터를 삭제한다
					notify(); // 잠자고 있는 cook을 깨움 ... cookThread가 wait되어 있으면 음식 만들어 오라고 하는 것
					
//					return true;
				}
			}
			try {
				System.out.println(name + " 이 기다려요");
				wait(); // 먹을 음식이 없는 손님Thread를 기다리게 한다
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		return false; // 해당 고객이 먹어야할 음식이 없다... false가 되면 notified
	}
	public int dishNum() {
	      return dishNames.length; // 배열의 크기
	   }
}
