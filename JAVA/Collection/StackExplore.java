package collectionFrame;

import java.util.Stack;

public class StackExplore {
	
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		goURL("1. 네이트");
		goURL("2. 카카오");
		goURL("3. 네이버");
		goURL("4. 구글");
		
		printStatus();
		goBack();
		System.out.println("이전 가기를 클릭");
		printStatus(); // 이전가기를 클릭한 다음에는 goback을 누른거랑 같다
		

		goBack();
		System.out.println("이전 가기를 클릭");
		printStatus();
		//결과값의 뒤쪽에 있는 값[@,@, >>@<< ]이 상단에 있는 데이터
		
		System.out.println();
		goForward();
		System.out.println("다음 가기를 클릭");
		printStatus();
		
		// ---------새로운 사이트로 가기--------------
		
		goURL("www.daum.net");
		System.out.println("새로운 사이트로 이동");
		printStatus(); // forward는 삭제가 되고, backStack은 남아있다. 즉 현재 페이지는 다음이 켜져있는 상태
		

	}
	
	public static void goURL(String url) { // 주소창 입력하는 메소드. 주소를 매개변수로 받는다
		back.push(url);
		if(!forward.empty()) { // forward스텍이 비어있지 않다면~ == 데이터가 들어있다면
			forward.clear(); // 다 지워주세요  remove() : 특정 데이터만 지움 clear() : 모든 데이터를 지움
		}
	}
	

	public static void printStatus() {
		System.out.println("back : "+back);
		System.out.println("forward : " + forward);
		System.out.println("현재 실행중인 사이트 : "+ back.peek() +"이다"); // peek은 단순히 상단에 있는 데이터를 읽어오는 역할
	
	}

	
	public static void goBack() { // backStack에 있는 forward로 옮긴다 (이전)
		
		if(!back.empty()) { // back의 데이터가 비어있지 않다면~~
			forward.push(back.pop()); // back 상단에 있는 데이터를 forward에 넣는다  pop : back에서 긁어온 데이터를 끄집어낸다
		}
	}
	
	
	public static void goForward() {
		if(!forward.empty()) { // 데이터가 비어있지 않다면
			back.push(forward.pop()); // forward에 있는 상의 데이터를 back의 상단의 데이터로 옮겨버린다
			
		}
	}
	
}
