package etc;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1=new Person(1111111,"홍길동");
		Person p2=new Person(1111111,"홍길동");
		// p1 p2는 주소값이 다르다
		// p1가 생성될때 p1의 생성값(주소값)을 할당한다
		// p2가 생성될때 p2의 생성값(주소값)을 할당한다 >> 둘의 생성값이 같을 경우가 없다
//		if(p1==p2) { 이렇게 비교하면 주소값을 비교한다
		if(p1.equals(p2)) { // equals도 여전히 주소값을 비교한다. 그래서 equals를 override해야한다
			System.out.println("같은값이다");
		}else {
			System.out.println("다른값이다");
		}
		
		
		// equals override했으면 hashcode도 똑같이 override 만들어줘야한다
		System.out.println(p1.hashCode());		
		System.out.println(p2.hashCode()); // 똑같은 hash코드는 없다
		
		
	}

}
