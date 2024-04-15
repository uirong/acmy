

// 기본형 <-> 기본형 (o) 참조형 <-> 참조형 (상속의 경우 o) 기본형 <-> 참조형 (x) :: 예외 wrapper 가능
package etc;

public class WrapperTest {

	public static void main(String[] args) {
		
		// Wrapper클래스
		// 기본형과 참조형간 형변환을 위한 클래스
		// 오토박싱( 박싱, 언박싱)
		
		// wrapper class는 8개가 있다 Boolean, Byte, Short, Character, Integer, Long, Float, Double
		// 기본형을 참조형으로 형변환 한다 . 참조형으로 한다는 것은 주소값을 변환한다는 것
		int i=10; // 10의 위치를 주소값으로 받는다
		Integer it =new Integer(20); // 20을 메모리에 할당 20이라는 데이터를 사용할때는 20이 가지고있는 주소값을 사용한다
		int i2=it; // int i2=it.intValue(); 오토 박싱이기 때문에 intValue를 안해도 된다 // wrapper 클래스에 있던 값만 끄집어 나오는 것
		// 기본형과 참조형간의 주소값 받아오기의 변화
		System.out.println(i2); // 20
		
		Integer it2=i; // Integer it2=(Integer)i; // 주소를 넣어야하는 곳에 숫자를 넣음. i가 있는 주소값을 가질 수 있다.   이것을 박싱이라고 부른다
		
		int x=100;
		Integer it3=200;
		System.out.println(x+it3); // 300.   wrapping 되어있던 it3의 200을 가져온다.   언박싱이 발생하다
		// 이 두 작업은 컬렉션 할 때 사용한다
		
		int y=new Integer(30); // 생성된 주소값을 받아야하는데 ... 캐스팅도 해줘야하는데 오토박싱이 있기 때문에 안해도된다
		System.out.println(y); // 30.   주소값을 가지고 있는 애를 기본 데이터로 만든다
		
		String s="1000"; // 숫자 타입이 아닌 경우에는 오류가 난다.  ex. 19au8 <이것처럼... 오류날 경우에는 try catch를 사용한다
		int z=Integer.parseInt(s); // 문자열 -> 숫자열인 int로 변경
		System.out.println(z); // 1000
		
		
		
		int in=10;
		Object obj=10;
		obj=in; // new Integer(i);
		int result=(Integer)obj;; // 오토박싱 적용이 안된다.   Object은 캐스팅 없이 언박싱 불가
		System.out.println(result); // 10
		
		
	}

}
