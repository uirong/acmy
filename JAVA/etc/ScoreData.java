package etc;

public class ScoreData {
	public static int length;
	String name;
	int java;
	int kor;
	int math;
	int eng;
	
	public ScoreData(String name, int java, int kor, int math,int eng) {
		super();
		this.name = name;
		this.java = java;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	void show() {
		System.out.println("이름: "+name);
		System.out.println("자바: +"+java+", "+ "국어: "+kor+", 영어: "+eng+", 수학"+math+", ");
	}
	
	
	
}
