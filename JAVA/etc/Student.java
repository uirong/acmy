package etc;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="name")
// exclude to string에서 빼고 싶은 메소드 빼기


public class Student {
	String name;
	int age;
	int grade;
	int ban;
	int no;
	
	
	
	
//	
//	public Student() {
//		
//	}
	

//	public Student(String name,int age, int grade, int ban, int no) {
//		super();
//		this.name=name;
//		this.age=age;
//		this.grade=grade;
//		this.ban=ban;
//		this.no=no;
//	}
/*
	@Override
	public String toString() {
		return "Student [name]"+name+"[age] "+age+"[grade] "+grade+"[ban ]"+ban;
	}
*/	

}
