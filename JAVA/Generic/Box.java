package Generic;

import java.util.ArrayList;

public class Box<T> {
	// 제네릭스 (Generic)
	// 클래스 멤버의 타입을 컴파일 시에 정의하는 방법
	// 타입의 안정성을 주기 위해서 사용
	// 제네릭스 타입은 참조형만 가능하다
	// 제네릭스 타입 자체를 제한해서 사용 할 수 있다
	
	/*
//	String item;
	T item;
//	void setItem(String item) {
	void setItem(T item) { // 이런식으로 타입을 정해서 한다
		this.item = item;
	}

//	String getItem() {	
	T getItem() {
		return item;
	
	}
		
	*/
	
	
	ArrayList<T> list = new ArrayList<>();
	// ArrayList 자체가 제네릭 타입 ... 제네릭은 타입에 제한을 해서 특정데이터만 값으로 쓰겠다
	
	void add(T item) { // ArrayList를 Box에 담기 위해 add를 사용
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
	
}
