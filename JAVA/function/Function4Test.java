package function;

public class Function4Test {

	public static void main(String[] args) {
		
		Function4 f4=new Function4();
		f4.varArgs(1,2,3,4,5); // 배열 형태로 5개를 받는다
		
		
		int[] arr= {6,7,8,9,10}; // 배열로 넘겨줘도 된다(Function4에다)
		f4.varArgs(arr);

	}

}
