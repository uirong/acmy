package Generic;

public class FruitTest {

	public static void main(String[] args) {

		Box<Fruit> fruitBox = new Box<>(); // Fruit밖에 못 담는 데이터 타입을 한정한다 == 그 타입만 받겠다
		Box<Fruit2Apple> appleBox = new Box<>();
		Box<Toy> toyBox = new Box<>();
		// Box<Fruit3melon> melonBox = new Box<Apple> // 타입 불일치
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Fruit2Apple()); // 상속관계에 의한 다형성
		
		appleBox.add(new Fruit2Apple());
//		appleBox.add(new Toy()); // 타입 불일치
		
		toyBox.add(new Toy());
//		toyBox.add(new Fruit2Apple()); // 타입 불일치

		System.out.println(fruitBox); // [Fruit, Apple]
		System.out.println(appleBox); // [Apple]		
		System.out.println(toyBox); // [Toy]

	}

}
