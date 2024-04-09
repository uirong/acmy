package function;

public class FunctionTest {

	public static void main(String[] args) {
		
		Function f= new Function();

		Function.staticMethod();
/*
		f.add(); // 메소드의 호출
		// add() : 메소드를 호출... Function 클래스에 있는 실행문을 실행시키라는 것
		f.add2(10, 20); //30
		f.add3(100,200); 
		System.out.println(f.add4(5, 6)); //11
		int sum =f.add4(9,8); // 33번줄에 sum:17이고 return sum이 다시 f.add4(9,8)에 17이라는 값을 준다
		// 여기에 있는 sum과 function에 있는 sum은 클래스가 다르기 때문에 전혀 관계없는 sum이다
		System.out.println(sum); // 돌려받은 값을 호출해야하니 재사용하는 용도로 사용가능
		
		f.add5(3);
		f.add5(11);
		int max=f.add6(40,30);
		System.out.println(max);
		
		
		int x=10;
		int y=20;
		
		f.add(x,y);
		System.out.println(x);
		System.out.println(y);
		

		Data d=new Data(); // 객체를 생성하면 객체를 생성하면서 메모리를 할당하면서 주소값을 가지게된다 // System.out.print(Data d);
		d.x=10;
		f.change1(d.x); 
		System.out.println(d.x); //10
		
		f.change2(d);
		System.out.println(d.x); // 1000
		
*/
		/*
		int[]arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr)); // {1,2,3,4,5}
		
		f.arrChange(arr);
		System.out.println(Arrays.toString(arr)); // {10,2,3,4,5}
		
		*/
		
		f.instanceMethod();
		f.staticMethod();
	}
	

}
