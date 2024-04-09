package basic;

import java.util.Arrays;
import java.util.Collections;

public class Array2 {

	public static void main(String[] args) {
		
		
		/*		
		// 데이터 옮기기
		
		int[] ar= {1,2,3,4,5};
		int[] ar1=new int[5];
		
		for(int i=0;i<3;i++){ // ar의 3
			ar1[i+2]=ar[i+2];
		}System.out.println(Arrays.toString(ar));
			System.out.println(Arrays.toString(ar1));

			
		// arraycopy(값을가진배열, 인덱스값, 값을복사할배열, 인덱스값, 크기)
			
		System.arraycopy(ar, 0, ar1, 2, 3); // 1,2,3 개 가져오니까 3
		System.arraycopy(ar, 0, ar1, 0, ar.length);
		System.out.println(Arrays.toString(ar1));

		
		// Arrays
		// copyOf()
		ar1=Arrays.copyOf(ar, ar.length); // ar의 전체 다 가져오는
		System.out.println(Arrays.toString(ar1));

		// copyOfRange
		ar1=Arrays.copyOfRange(ar, 2, 5); // 3,4,5 / 시작 인덱스,ar의 2번째부터 배열의 크기만큼. 
		System.out.println(Arrays.toString(ar1));
		
*/
	
		
/*
		
		// 배열의 정렬
		// 크기가 정해진 배열은 정렬이 가능하다
		// 변수와 변수간의 데이터 교환은 temp 사용
		// 임의의 저장소를 만든다(temp) > y의 20을 x에 옮긴다1 > x의 10을 temp에 저장 후(1) x는 20이 되고 temp에서 y로 이동하면 y는 10이 된다(3)
		int temp; int x=10; int y=20;
		
		System.out.println(x+","+y); // 10, 20
		temp=x;
		x=y;
		y=temp;
		System.out.println(x+","+y); // 20, 10
		
		
		int[] arr1= {2,7,3,5,1}; // 2>7>3>5>1 ==> 1>7>3 ==> 1>3>7>5>2 ==> 1>2>(5)>7>3 ==> 1>2>3>5>7
		// 2 7 - 2 3 - 2 5 - 2 1 :: 4번반복 ,,, 7 3 - 7 5 - 7 1 :: 3번반복 ,,, 2번반복 1번반복,,, 1번째는 4번 반복 2번째는 3번반복 3번째는 2번반복 4번째는 1번반복... 총 4번 반복해야
		
		Integer[] arr2= {2,4,7,3,5};
		
		for(int i=0;i<arr1.length-1;i++) { // arr1의 길이에서 -1
			for(int j=i+1;j<arr1.length;j++) { // i(기준값)의 바로 다음값이니까 기준값 +1 | arr1의 마지막까지 돌아야하므로 length;
				int temp1;
				if(arr1[i]> arr1[j]) { // 기준값에서 arr1[j](비교하는값) 보다 크면 :: 오름차
					temp1=arr1[i]; // arr1[i]의 값을 temp1에 넣기
					arr1[i]=arr1[j]; // arr[j]비교의 값을 arr1[i]기준 값에 넣기
					arr1[j]=temp1; // temp1의 값을 arr1[j]비교 값에 넣기
				}
			}
		}
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		// 내림차순
		Arrays.sort(arr2,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));
				
*/
/*		
 * 		// 행단위로 묶어서 데이터를 관리 할 수 있다
 * 
		int[][] arr1; // 배열의 선언
		arr1 =new int[5][3]; //  배열의 생성 || 선언한게 2개니까 2개 || 행:5(index. 0,1,2,3,4,5) 열:3(0,1,2)--> 15
		// 순차처리 : 행의 열이 실행이 되면 그 다음 행의 열이 실행이 된다 ... 반드시 행열의 index번호를 사용해야한다
		int[][] arr= new int[5][3]; // 선언+생성
		
		arr1[0][0] =1; // 배열의 초기
		arr1[0][1] =2;
		arr1[0][2] =3; 

		arr1[1][0] =4;
		arr1[1][1] =5;
		arr1[1][2] =6;

		arr1[4][0]=13;
		arr1[4][1]=14;
		arr1[4][2]=15;
*/
		
		/*
		int [][]arr1= { // {} {} 두개가 있어야 2차원 생성+선언+생성+초기화
				{1,2,3}, //1행 3열짜리 데이터가 생김
				{4,5,6}, // 2행 3
				{7,8,9},
				{10,11,12},
				{13,14,15}
		};
		
		
		System.out.println(arr1[0][0]); // 첫번째 행의 첫번째 열의 데이터 ---> 1
		System.out.println(arr1[4][2]); // 마지막 행의 마지막 열의 데이터 ---> 15
		*/
		
		
//		중첩구조의 반복문을 사용해야한다. for문을 사용하는건 배열의 크기가 정해져있기때문
		
/*
		int [][]arr1= { 
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
				{13,14,15}
		};
		// 행의 크기는 같다
		// 2차원은 행과 열의 지정이 주소의 크기를 말한다
		// 할당은 1차원이랑 같지만 데이터 관리하는법은 2차원
		for(int i=0;i<5;i++) { // arr0이 가리키고 있는 열의 크기
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j] +" ");
			}System.out.println(); // 행 열의 모습처럼 보이기 위해 추가

*/
		// 행의 크기가 2이고 열의 크기가 5인 2차원배열 생성, 1~10까지 반복문을 사용하여 초기화한다
		// 홀수만 출력한다
		
//		int [][]arr= {
//				{1,2,3,4,5},
//				{6,7,8,9,10}
//		};
		int[][] arr= new int[2][5];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]= i*5+j+1;
				if(arr[i][j]%2==1) {
					System.out.print(arr[i][j]);
				}
			}
		}System.out.print(Arrays.deepToString(arr));
		
	} //!!

}
