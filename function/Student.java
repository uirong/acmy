package function;

//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//
//@NoArgsConstructor
//@AllArgsConstructor
public class Student {

	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){ // 기본 생성자
		
	}

	Student(String name, int ban, int no, int kor, int eng, int math){
		 this.name=name;
		 this.ban=ban;
		 this.no=no;
		 this.kor=kor;
		 this.eng=eng;
		 this.math=math;
	}
	
	
//	
//	Student(String name){
//		this.name=name;
//	}
//
//	Student(String name, int ban){
//		this.name=name; this.ban=ban;
//	}
//	
//	Student(String name, int ban, int no){
//		 this.name=name;
//		 this.ban=ban;
//		 this.no=no;
//	}
//	
//	Student(int kor, int eng, int math){
//		this.kor=kor;
//		this.eng=eng;
//		this.math=math;
//	}
//	
//	Student(String name, int ban, int no, int kor, int eng){
//		this("kim",ban,no,kor,eng,100);
//	}
//	
	
	
	
//	System.out.println(getTotal())
	int getTotal(){
		return kor+eng+math;
	}
	float getAverage() {
		 return (int)(getTotal()/3.0f *10 + 0.5f)/10f; // f로 적지 않으면 double이 되어 캐스팅이 안된다
	}
	
	
}
