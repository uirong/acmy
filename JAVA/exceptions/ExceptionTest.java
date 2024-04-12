package execptions;

public class ExceptionTest {
	public static void main(String[] args) {
		// 예외처리
		// 작성된 코드가 실행될 때 생기는 문제
		// 원하는 형태로 처리하는 방법
		
/*		
		try{
			//문제를 발생 시킬 수 있는 실행문(예외타입1)
			//문제를 발생 시킬 수 있는 실행문(예외타입2)
			//문제를 발생 시킬 수 있는 실행문(예외타입3)
		}catch(예외타입1){
			//문제를 해결하기 위한 실행문
		}catch(예외타입2){
			//문제를 해결하기 위한 실행문
		}catch(예외타입3){
			//문제를 해결하기 위한 실행문
		}finally{
			//예외 발생 유무와 상관 없이 무조건 실행하는 문장
		}
*/
		
		
		// 어떤 정수를 0으로 나눌 수 없다 (예외)
		int number = 100;
		int result = 0;
		
		int[] arr= {1,2,3,4,5};

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(arr[i]); // 5가 나오는 순간 오류가 뜬다
						// 배열을 사용할때 가장 많이 볼 수 있는 에러 ArrayIndexOutOfBoundsException
				
				result = number / (int) (Math.random() * 10); // 자바에서 10으로 나누고 예외로 샥 처리하는것
				  				// 코드에서 발생할 수 있는 예외를 자바가 정리해놨음 = ArithmeticException
				System.out.println(result);
				
			} catch (ArithmeticException e) { // 매개변수로 예외처리 해주기
				System.out.println("0으로 정수를 나누기 연산 불가");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 범위를 초과 했습니당");
			}

		}
	}

}
