
package collectionFrame;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 배열
		
		// 데이터를 받아들이는... 다 값으로 받을 수 있는 것 : object
		// 읽고 쓰고 수정하고 삭제
		
	// add : 데이터 저장

		/*
		list.add(new String("5"));
		list.add("1");
		list.add("4");
		list.add("2");
		list.add("3");
		list.add("3");
		
		String s1 = (String)list.get(0); // get 메소드의 반환 타입은 object이다
		String s2 = (String)list.get(4);
		String s3 = (String)list.get(5);
		
		System.out.println(s1); //5 	toString()이 오버라이딩
		System.out.println(s2); //3		인덱스 4번째 값
		
		list.set(3,"AAA"); // 3번째 위치에 숫자2가 들어있지만 이 를 AAA로 바꾼다
		String s4 = (String) list.get(3); // index 3번째에 있는 값을 받아온다
		System.out.println(s4); // set이라는 걸로 수정이 가능하다
		
		
		System.out.println(list.size()); // 6   데이터가 담겨있는 크기 만큼만 알려준다
		
		list.remove(5);
		System.out.println(list.size()); // 5
		
		list.remove(2);
		
		System.out.println(list.get(2)); // index3번 자리에 AAA
		System.out.println(list.get(3)); // 3
//		System.out.println(list.get(4)); 같이 들어있는 index자리만 사용 할 수 있다
		System.out.println();
		
	
		
		
		
		for(int i=0;i<list.size();i++) {
			String s = (String)list.get(i);
			System.out.println(s);
		}
		System.out.println();
		
		*/
		// 기본형을 참조형으로 바꾸는것 casting ... 기본형을 감싸는것-boxing 감싼걸 푸는것-unboxing  : auto boxing
//		 Integer(1)
		// Integer i = 3; --> 자동으로 casting 해준다
		// Object obj = 3; == Object obj = new Integer(3)
		
		list.add(new Integer(1)); // 기본형을 참조형 처럼 사용 할 수 있다
		list.add(2); // 굳이 안써줘도 된다 숫자만 써줘도 됨 ... auto boxing이 되기때문이다
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		int sum = 0;
		/*
		for(int i=0;i<list.size();i++) {
			int num = (Integer)list.get(i); // Integer를 언박싱 한다 ( 풀어버림 )
			sum += num;
		}
		System.out.println(sum); //55
		*/
		
		for(Object obj : list){
			int i1 = (Integer)obj;
			sum += i1;
		}
		System.out.println(sum); //55
		
		
	}

}