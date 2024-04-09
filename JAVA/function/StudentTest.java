package function;

//import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		Student s=new Student(); // 기본생성자 생성자를 통한 어쩌고가 안됨
		s.name="kim"; // 초기화하기
//		System.out.println(s.name);
//		System.out.println(s.kor);
//		System.out.println(s.eng);
//		System.out.println(s.math);
		
		Student s2=new Student("hong",5,6,87,31,75);
		int total=s2.getTotal();
		float avg=s2.getAverage();
		
		System.out.printf("총점: %d \n평균: %.2f", total,avg);
		// %. 뒤의 숫자는 소수점 몇번째 자리까지인지 표시하는것. 올림 이런게 아니라 그냥 버리는거 
	}

}
