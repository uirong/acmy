package interfaces;

public class Unit {

	int hitPoint;
	final int MAX_HP; // final 상수의 경우에는 초기화 해야한다
	
	// 생성자 만들기
	Unit(int hp){
		MAX_HP = hp; 
	}
}
