package stream;

public class Student implements Comparable<Student>{
	
	@Override
	public int compareTo(Student s) {
	    return s.totalScore - this.totalScore; // 총점으로 내림차순
	 }

	@Override
	public String toString() {
		return "Student [name = " + name + ", ban= " + ban + ", totalScore= " + totalScore + " ]";
	}
	

	String name;
	int ban, totalScore;
	
	String getName() {
		return name;
	}
	
	int getBan() {
		return ban;
	}
	
	int getTotalScore() {
		return totalScore;
	}
	
	public Student (String name, int ban, int totalScore) {
		this.name =  name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	

	

}
