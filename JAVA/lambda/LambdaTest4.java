package lambDaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest4 {

	public static void main(String[] args) {
		
		Supplier<Integer> s = () -> (int)(Math.random() * 100) +1;
		Consumer<Integer> c = i -> System.out.print(i + ", "); // 값을 받아서 컴마를 찍게함
		Predicate<Integer> p = i -> i % 2 == 0; // i를 2로 나눠서 0이면 true, 아니면 false
		Function<Integer,Integer> f =  i -> i / 10 * 10;// Function<매개변수타입,리턴타입> 10단위에서 1의 자리를 빼라~ 라는 뜻
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s,list); // s에 list값을 하나씩 추가하도록 처리
		System.out.println(list);
		
		printEvetntNum(p,c,list);
		List<Integer> newList = doSomething(f,list);
		System.out.println(newList); // 1의 자리는 삭제되고 10의 자리만 나옴
		
	}

	static <T> List <T> doSomething(Function<T,T> f, List<T> list){ // 매개변수로 사용 할 수 있도록 처리가능
		
		List<T> newList = new ArrayList(list.size());
		for(T i : list) {
			newList.add(f.apply(i));// 	10의 자리를 1의 자리로 만들어야함
		}
		return newList;
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list){
		for(int i=0; i<10; i++) {
			list.add(s.get()); // get을 한다는건 람다식 난수*100 +1 값을 받아온다는 것
		}
	}
	
	static <T> void printEvetntNum(Predicate<T> p ,Consumer <T> c, List<T> list) {
		System.out.print("[ ");
		for(T i : list) {
			if(p.test(i)) { // 첫번째 돌린 것 에서 
				c.accept(i); // 짝수라고 판단된 경우에만 내놓기
			}
		}
		System.out.println(" ]");
	}
}
