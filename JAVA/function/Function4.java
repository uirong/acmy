package function;

public class Function4 {

	// ... : 가변 함수를 받는다
	void varArgs(int... args) { // int ...args : 배열형식
		
		for(int num : args) {
			System.out.println(num);
		}
		
	}
}
