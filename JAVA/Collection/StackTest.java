package collectionFrame;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		// LIFO(후입선출) 
		// 모든 컬렉션은 읽고 쓰고가 가능하다
		
		Stack st = new Stack();
		
		st.push("0"); // object 0
		st.push("1");
		st.push("2");
		
		while(!st.empty()) { // 데이터가 비어있지 않다면
			System.out.println(st.pop()); // 2 /1 /0 
		}
		System.out.println("===");
		
		
		// FIFO (선입선출) 
		Queue q = new LinkedList(); // Queue 는 인터페이스 LinkedList는 Queue를 상속받는 대표적인 클래스 . LinkedList는 Queue를 상속받고 있다
		q.offer("0"); // offer : 데이터를 삽입할 때 사용. linkedList에 오버라이딩 되어있어서 그냥 가져다 쓰면 됨
		q.offer("1");
		q.offer("2");
		
		while(!q.isEmpty()) { // 비어있지 않은 상태라면 ~~~ .  list 안에 있는 isEmpty() 라는메소드. q의 데이터가 비어있는지 확인
			System.out.println(q.poll()); //  q의 데이터 읽어오는 메소드 poll
		}
		
	}

}
