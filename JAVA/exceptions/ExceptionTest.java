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
				System.out.println(arr[i]); // 5이상의 인덱스 번호가 나오는 순간 오류가 뜬다
						// 배열을 사용할때 가장 많이 볼 수 있는 에러 ArrayIndexOutOfBoundsException
				
				result = number / (int) (Math.random() * 10); // 자바에서 10으로 나누고 예외로 샥 처리하는것
				  				// 코드에서 발생할 수 있는 예외를 자바가 정리해놨음 = ArithmeticException
				System.out.println(result);
				
			} catch (ArithmeticException e) { // 매개변수로 예외처리 해주기
				System.out.println("0으로 정수를 나누기 연산 불가");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 범위를 초과 했습니당");
			} catch(Exception e) {
				System.out.println("예외타입 처리 완료");
			} finally {
				System.out.println("예외처리 유무와 상관 없이 무조건 실행");
			}
			// 발생한 타입에 따라 처리하는 방식이 다르다
		}		
*/		
		
		
/*		
		
		try {
			mathod1();
			throw new Exception("강제로 발생 시키기 예외"); // 강제로 예외를 만들어주어야한다
		}catch(Exception e){ // 예외가 발생하면 이 예외를 Exception e에게 보내줌
			System.out.println(e.getMessage());
								// getMessage를 사용하면 예외를 전달 받을 수 있다
			e.printStackTrace();
		}
		
*/
		
//		mathod1(); // mathod1 호출
		
	} // main main함수가 mathod1이라고하면서 생긴 문제라서 메
	

//	static void method1() {
		
	static void method1() throws Exception{	
		
		method2();
/*
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // 1) 호출하는 쪽 메소드에다가 고칠 수 있게 떠넘겨버린다.
*/
		
		
	// 메소드에서 예외처리를 해줘야 한다
	
//	static void method2() {
//		try {
//			throw new Exception(); // 컴파일러가 시작부터 인식을 해서 바로 예외처리하는 가장 강력한 예
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
	static void method2() throws Exception{
		throw new Exception("Exception 예외");
	}
 
} // class
