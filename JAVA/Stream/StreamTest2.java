package stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		
		File[] fileArr = {
				new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
		};
		
		// 확장자만 추출하고싶을때 파일 명을 대문자로 바꾸고 싶을 때 중복을 제거하고 싶을 때 조건에 맞춘거를 화면에다가 출력하고 싶을 때
		
		
		// 파일 가져오기
		File f1 = fileArr[0]; // 안에 들어가 있는게 file 타입
//		f1.getName();
//		System.out.println(f1.getName());
		
		Stream<File> fileStream = Stream.of(fileArr); // 이렇게하면 배열이 stream화 된다. stram사용 가능
		Stream<String> filenameStream = fileStream.map(File :: getName); // 메소드 참조 방식으로 fileStram에 있는 new File("") ""안에 있는 것들을 stream 할 수 있다
												// file 클래스 객체의 문자로 되어있는 file명들을 stream화 해준다고 생각
		filenameStream.forEach(System.out::println); // forEach도 lambda식... 메소드 참조 방식
		
		
		fileStream = Stream.of(fileArr); // 스트림을 다시 생
		
		// map(), filter(), distinct(), forEach(); 
		// 함수형 인터페이스 람다식 알기
		fileStream.map(File::getName) // Stream<File> -> Stream<String>
					.filter(s -> s.indexOf('.') != -1) // . 확장자가 없는 것은 제외 -1이 아니일 경우에만 필터링 하기.  true일 때만 (조건에 맞는) 값을 내놓게 하기
					.map( s-> s.substring(s.indexOf('.')+1)) // 확장자가 없는 것은 제외
					.map(String::toUpperCase)
					.distinct()  // 중복제어
					.forEach(System.out::println);  // 어느 타입의 스트링을 하는지 
		

	}

}
