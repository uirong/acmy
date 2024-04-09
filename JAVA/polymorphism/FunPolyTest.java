package polymorphism;

public class FunPolyTest {

	public static void main(String[] args) {
		
		FireEngine fe=new FireEngine();
		Ambulance ab=new Ambulance();
		
		FuncPoly fp=new FuncPoly();
		fp.doWork(fe);
		fp.doWork(ab);
		// car타입으로 넣어놨을 때 소방차인지 응급차인지 모른다
	}

}
