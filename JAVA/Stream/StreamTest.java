package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	
	// Stream
	// 배열, 컬렉션
	// 데이터를 추상화(표준화)하여 값을 처리하고 연산하는 것으로 통일한다

	// 배열에서나 컬렉션에서나 데이터를 읽어오는게 다르다
	// 읽어오는걸 stream으로 바꿔준다
	// 중간연산, 최종연산
	
	// 배멸
	Stream<String> stream1 = Stream.of("a","b","c"); // 가변인자 . 낱개로 있는 stream 타입을 바꿔줌
	Stream<String> stream2 = Stream.of(new String[] {"a","b","c"}); 
	Stream<String> stream3 = Arrays.stream(new String[] {"a","b","c"});
	
	/*
	IntStream IntStream.of(int...value);
	IntStream IntStream.of(int[]);
	IntStream Array.stram(int[]); 
	*/
	
	
}
