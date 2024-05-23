package collectionFrame;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		// set 특징
		// set 중복된 값을 허용하지 않는다
		// 해당 데이터 타입의 클래스에는 equals(), hashCode() 두 개의 메소드가 오버라이딩 되어 있어야한다
		// set은 중복된 값을 체크를 하는데 그 타입의 중복체크를 내부적으로 하는것이 있기 때문에 두개의 메소드가 오버라이딩이 되어야만 한다
		
		
		
		
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		
		Set set = new HashSet();
		
		for(int i=0;i<objArr.length;i++) {
			set.add(objArr[i]);
			
		}

		
		System.out.println(set);
		
	}

}
