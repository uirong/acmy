package Generic;

public class FruitTest2 {

	public static void main(String[] args) {
		
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Fruit2Apple> appleBox = new FruitBox<Fruit2Apple>();
//		Box<Fruit2Apple> appleBox = new Box<>();
		FruitBox<Fruit3melon> melonBox = new FruitBox<Fruit3melon>();
		// FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 타입 불일치
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Fruit2Apple());
		
		appleBox.add(new Fruit2Apple());
//		appleBox.add(new Fruit2melon()); // 타입불일치
		melonBox.add(new Fruit3melon());

		System.out.println(fruitBox);
		System.out.println(appleBox);		
		System.out.println(melonBox);

	}

}
