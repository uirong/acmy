package collectionFrame;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		/*
		list.get(0);
		for(Object obj : list) {
			String s = (String)list.get(0);
		}
		*/
		
		// Iterator한 방식으로 컬렉션의 값 읽어오기
		Iterator it = list.iterator();
		while(it.hasNext()) { // hasNext() : 현재 리스트에 데이터 첫번째 위치부터 기작해서 마지막 데이터가 있는 위치까지 이동하면서 값의 유무를 체크
			// 데이터가 있으면 true 없으면(null) false를 해서 읽어올 데이터가 있는지 계속 체크하는 것. 
			String s = (String)it.next(); // 리스트에서 값을 읽어 온다.
		System.out.println(s); // 1 2 3 4 5 데이터 값을 하나하나 가져옴	
		}
		it.remove(); // next()에서 나온 값을 list에서 삭제한다
		System.out.println("remove 테스트");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); 
			// 이 인덱스의 위치에 있는 객체를 리턴
			//만약 리스트 크기보다 큰 인덱스를 인자로 전달하면 범위를 넘어섰다는 의미인
			//IndexOutOfBoundsException예외를 발생
		}
		

	}

}
