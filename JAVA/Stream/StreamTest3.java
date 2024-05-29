package stream;

import java.util.stream.IntStream;

public class StreamTest3 {

	public static void main(String[] args) {
		
	      IntStream s = IntStream.of(1, 2, 3, 4, 5);

	      s.forEach(System.out::println);
	      System.out.println("--------------------------");
	      IntStream.range(1, 5).forEach(System.out::println); // 마지막은 포함 안함
	      IntStream.rangeClosed(1, 5).forEach(System.out::print); // 마지막도 포함

	      IntStream.rangeClosed(1, 5).map(n -> n * n)
	      							 .filter(n -> n % 2 == 0) // filtering을 할것이다 짝수인 녀석들만
	      							 .forEach(System.out::println); // 최종연산
	      System.out.println();

	      // sum(), aberage(), max(), min()

	      int sum = IntStream.rangeClosed(1, 2).sum();
	      System.out.println("합계 : " + sum);
	      double avg = IntStream.rangeClosed(1, 5).average().getAsDouble(); // 옵셔널 타입으로 리턴 되어서 average는 원하는 타입으로 바꿔줘야 함. 치수로 가져오고 싶을 때 getAsDouble() 메소드를 추가해야한다 string average가 내놓은 값을 실수로 반환해
	      System.out.println("평균 값 : " + avg);
	      int max1 = IntStream.rangeClosed(1, 5).max().getAsInt(); // 옵셔널 타입으로 리턴 되어서 기본형으로 바꿔줘야한다 .optional 타입으로 반환되어서 getAsInt() 해줘야 int형으로 전환되어진다
	      System.out.println("최대값 : " + max1);
			
			// 람다식에 메소드 참조 방식 0개개변수 생략, 참조변수를 ::로 사용한다)
			// 람다식이 하나의 메소드만 호출하는 경우에 생략가능	
	      
	      
	      
	      // anyMatch()
	      // 스트림의 요소 중 어느 하나라도 주어진 술어를 만족하면 'true' 를 반환
	      boolean anyMath = IntStream.rangeClosed(1, 5).anyMatch(n -> n == 3);
	      System.out.println(anyMath);
	      
	      
//	      스트림에서 어떻게 데이터를 정렬하는지 ... 스트림을 사용하면 정렬하는게 더 편하다
	
		
	}
}
