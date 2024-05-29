package lambDaStream;

public class LambdaTest2 {

	   static void execute(MyFunction f) {
	      f.run();
	   }

	   static MyFunction getMyFunction() {
	      MyFunction f = () -> System.out.println("f3.run()");
	      return f;
	   }

	   public static void main(String[] args) {
	      MyFunction f1 = () -> System.out.println("f1.run()");

	      // 익명 class를 이용한 객체 생성
	      MyFunction f2 = new MyFunction() {

	         @Override
	         public void run() {
	            System.out.println("f2.run()");

	         }

	      }; // 익명 클래스

	      MyFunction f3 = getMyFunction(); // 호출함으로써 람다식을 직접 받을 수 있다

	      f1.run();
	      f2.run();
	      f3.run();
	      
	      execute(f1);
	      execute(()-> System.out.println("run()"));
	   }

	}