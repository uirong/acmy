package polymorphism;

public class Product { //object에 있는 toString이 오버라이딩이 된다..?
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price; 
		bonusPoint= (int)(price/10.0); // 이름이 똑같을 땐 this를 붙이고 들어가는 값이 다르면 this 생략 가능
	}

	
	
	

}


//class Product{
//}
//
//class TV extends Product{
//	
//}
//
//class Audio extends Product{
//	
//}
//
//class Computer extends Product{
//	
//}
//
//class Buyer{
//	
//}



