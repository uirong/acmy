package polymorphism;

public class BuyTest {

	public static void main(String[] args) {
		
		TV t=new TV();
		Audio a=new Audio();
		Computer c=new Computer();
		
		Buyer buyer=new Buyer();
		buyer.buy(t);
		buyer.buy(a);
		buyer.buy(c);
		

	}

}
