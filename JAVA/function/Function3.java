package function;

public class Function3 {
	
	// 메소드 오버로딩
	// 메소드를 정의할 때 나타난다
	
	// 1. 메소드의 이름이 동일하다
	// 2. 매개변수의 갯수가 다르거나 또는 타입이 다르거나
/*
	void add() {};
	void add(int x) {}; // 개수가 다르면 타입이 달라야한다
	void add(long l) {};
	void add(int x, int y) {};
	void add(int x, long l) {};
	void add(long l, int x) {}; // 앞에서 쓴 타입과 지금 사용한 타입이 (서로 바뀌어도) 다르지만 가능
	// int add(int x) {}; // (X)  리턴타입은 오버로딩 조건이 아니다. 매개변수(int x)도 같다 데이터 타입도 같음..
*/	
	// System.out.print(10); // 호출하는 것
    // System.out.print(int x);
	// System.out.print(String str); 
	// System.out.print(double d);
	
	// 오버로딩은 선택이 아닌 필수의 어쩌구이다
	
	
	
	int add(int x, int y) {
		return x+y;
	}
	
	int add(int[] arr) {
		int sum=0;
		for(int num : arr) {
			sum += num;
		}
		return sum;
	} // void 함수는 리턴 받기 전에는 합산이 되는지 안되는지 알 길이 없다
	// 오버로딩
	
}
