package basic;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		// 배열

		int x, y, z, k, f;

		/*
		   int[] arr; // 배열의 선언 arr=new int[5]; // 배열의 생성
		   
//		int[] arr= new int[5]; // 선언+초기화

//			arr[0]=10; // 배열의 초기화
//			arr[1]=20;
//			arr[2]=30;
//			arr[3]=40;
//			arr[4]=50;

		// 선언+생성+초기화
		 */
//		int[] arr = { 10, 20, 30, 40, 50 };
	
		
		
		
		int[] arr = new int[5];
	
		for(int i=0;i<5;i++) { // i= 0 1 2 3 4 
			arr[i]=(i+1)*10; // arr[i]는 arr의 데이터를 읽어오는것이다
		}
		
//		for(int i=0;i<5;i++) {
//			System.out.println(arr[i]);
//		}// 배열은 기본적으로 반복문에 사용한다
		// 초기값인 i 값을 0으로 시작한다 특별한 경우엔 다르게 한다. 
		// i<5는 배열의 크기를 뜻한다
		
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//  	}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		
		
		
/*
		 // Int 크기가 10인 배열생성. 반복문을 사용해서 1~10정수로 초가화 배열의 값의 홍 찹을초기화
		// 배열의 값의 총합을 구하는 프로그램을 작성
		
		int[] arr=new int[10];
		for(int i=1;i<=arr.length;i++) {
			arr[i] = i+1;
		}
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println(sum);
*/
		
		
/*
		// 향상된 for문
		String[] arr1= {"sean","kim","park","lee"};
		for(String s : arr1 ) {
			System.out.println(s); // sean / kim / park / lee	
		}
		
*/		
		
		
	}

}
