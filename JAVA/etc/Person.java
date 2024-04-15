package etc;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


//1) lombok을 사용하여 하는법
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
// 오버라이딩 하는 이유는 생성시 생성자와 같은 객체와 두개가 있다고 하기 위해 EqualsOverride
// 오버라이딩이 되면 같이 돼서 동일한 hashcode를 특정 목적에 맞게 사용하기 위해 equals와 같은 해시코드가 만들어지도
	
public class Person {
	long id;
	String name;
	
	
// 2) 직접 사용하여 하는법
	
/*	
	public Person(long id,String name) {
		this.id=id;
		this.name=name;
	}
	//equals 해서 값을 두번 비교하는거
	@Override
	public boolean equals(Object obj) { // p1 p2를 받았고 오버라이딩된 메소드를 받았다
		// 두 111111의 id값을 비교해서 같으면 같은거임
		
		Person other=null; // 지역변수라 초기화를 해주고 선언
		// p2를 가져와서 other로 변경
		// boolean으로 했으니 true false
		
		if(obj instanceof Person) { // Person이 맞다면~~
			other = (Person)obj; // obj를 Person타입으로 바꾸기
		}
		return this.id == other.id && (this.name).equals(other.name);
	}

	@Override
	public int hashCode() {
		// 객체가 가진 고유의 값 . 고유한 값을 가진다
		// p1을 부르면 이 코드로 구성된 애구나 이 객체를 실행시켜줘야겠다~라는 느낌 이 객체의 key값이다
		return Objects.hash(id,name); // hashcode를 같게 만들어준다
		// hash코드가 같으면 이 객체를 똑같은 객체로 판단.. 할 수 있게 한다
	}
*/	
//	타입이 같은 생성시 사용하는 매개변수의 값이 같으면 
	
	
}
