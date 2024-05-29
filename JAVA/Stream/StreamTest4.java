package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamTest4 {

	public static void main(String[] args) {
	
		
		Stream<Student> studentStream = Stream.of(
				  								  new Student("김의연      ",3,300),
				  								  new Student("신현       ",1,200),
				  								  new Student("찬님       ",2,100),
				  								  new Student("플러쑤      ",2,150),
				  								  new Student("두비둡      ",1,200),
				  								  new Student("메스가키얏호우",2,250),
				  								  new Student("피치의연     ",3,290),
												  new Student("마이너쑤     ",3,180)
				);
//		studentStream.sorted(Comparator.comparing((Student s) -> s.getBan())); // 기준 값이 바뀌는 ...
		studentStream.sorted(Comparator.comparing(Student::getBan))
							.forEach(System.out::println);

	}

}
