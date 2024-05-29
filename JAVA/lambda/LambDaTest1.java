package lambDaStream;

public class LambDaTest1 {

	public static void main(String[] args) {
		
			// 람다식 (Lamda Expression)
			// 메소드 하나의 식으로 표현한 것
			// 이름 없는 메소드
			// 람다는 하나의 객체
			
			
			/*
			int max(int x, int y) {
				return x > y ? x : y
			}
			
			(int x, int y) -> { return x> y ? x : y};
			
			(int x, int y) -> x > y ? x : y
					
			(x, y) -> x > y ? x: y
					
			(x) -> x * x
			
			x -> x * x // 매개 변수가하나인 경우 () 생략 가능
			 */
			
			
			// 함수형 인터페이스
			// 오버 라이딩이 목적이 아님
			// 람다식에 이름을 부여하는 역할
		
			// 메소드가 어떤변수의 값으로 들어가고, 그 변수의 타입이 my Function이라는 interface의 값으로 들어가는 객체
			// 클래스나 인터페이스 타입으로 선언된 변수에 어떤값을 집어넣는다 == 객체 (참조형)
			
			 @FunctionalInterface   //함수형 인터페이스를 만들때 2개 이상의 추상 메소드가 만들어지지 않도록 강제로 막아주는 역할
			   interface MyFunction {
			      // 추상 메소드 -> 람다식의 형식에 맞게 구성한다

			      // 선언부
			      public abstract int max(int x, int y); // 정의
			   }

			   MyFunction f = (x, y) -> x > y ? x : y;

			   f.max(10,20); // 람다식의 메소드 호출 방식

		}

	}
