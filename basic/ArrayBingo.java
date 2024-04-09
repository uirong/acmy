package basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBingo {

	public static void main(String[] args) {
		
		// 변수 <-> 상수
		// 10
		// 상수는 선언과 동시에 초기화를 해줘야한다
		// 대문자로만 이름을 만들 수 있는건 PI밖에 없다
		// final 사용시 대문자로 해줘야하고 그와 동시에 초기화를 해줘야한다(처음 할때 값을 한번만 줄 수 있다)
		
/*		int x;
		x=10;
		x=20;
		final double PI=3.14;
		System.out.println(PI);
*/
		final int SIZE =5;
		int x,y;
		int num=0; // --> 빙고가 되었는지 안되었는지 체크해서 입력받는 값을 여기에다가
		
		int [][] bingo=new int[SIZE][SIZE];
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<bingo.length;i++){ // i가 0일때 j가 5번(0~4)	돌아야한
			for(int j=0;j<bingo[i].length;j++) {
				bingo[i][j]=i*SIZE+j+1; // (0*5)+j+1
			}
		}
//		System.out.println(Arrays.deepToString(bingo));
		
		// 열 행열 인덱스가 필요하다
		//x y에 난수를 넣는다
		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++) {
				x=(int)(Math.random()*SIZE);
				y=(int)(Math.random()*SIZE);
				
				int temp= bingo[i][j];
				bingo[i][j]=bingo[x][y];
				bingo[x][y]=temp;
			}
		}//System.out.println(Arrays.deepToString(bingo));
		
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				System.out.print(bingo[i][j]+ " ");
			}System.out.println();
		}
		System.out.println();
		
		
		// 배열을 사용해야 하므로 bingo...행을 가르킴 arr :행을 가르킴 arr[]:행의위치 arr[][]:열의위치
		for( int[] a : bingo ) {
			for(int n : a) {
				System.out.print(n+" ");
			}System.out.println();
		}
		
		System.out.println();
		
		do {
			for(int[] a: bingo) {
				for(int n : a) {
					System.out.print(n+ " ");
				}System.out.println();
			}
			System.out.println(); // 줄 바꾸기
			
			System.out.printf("1 ~%d의 숫자를 입력하세요.(종료 == 0)>> ",SIZE*SIZE); // SIZE=5 SIZE=5 ==> 25
			num=in.nextInt();
			
			
			
			boolean flag=true;
			
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) { // num값과 SIZE 크기만큼 나온 숫자가 일치하는지 
					if(bingo[i][j] ==num) { // 제일 먼저 찾아질 수도 있고 제일 나중에 찾을 수도 있다
						bingo[i][j]=0;
						flag=false;
						break;
					}
				}
				if(!flag) {
					break;
				}
			}
			
			int sum;
			flag=true;
			
			for(int i=0;i<SIZE;i++) { // 0을 만드는 반복문
				sum=0;
				for(int j=0;j<SIZE;j++) { // 여기 오면 한 행을 다돌았다는 뜻
					sum+= bingo[i][j]; // 0을 저장하는 역할... 돌면서 숫자가 맞으면 0을 저장한다  
					}
				
				if(sum==0) { // 현재 행이 0이 되었다는 뜻
					flag=false;
					break; // 97번의 for문을 멈추는것 . 0인지 아닌지 안 찾아도 된다
				}
			}
			
			if(!flag) {
				break; // do while문을 멈춘다 == 빙고가 된다는 뜻
			}
			
		}while(num !=0); // 0이 아닐 때까지 계속 돌리기
		
		for(int[] a: bingo) {
			for(int n : a) {
				System.out.print(n+ " ");
			}System.out.println();
		} // >> 이 코드를 넣어줘야 숫자가 0으로 바뀐걸 볼 수있다 :메서드가 있으면 한번에 처리가능한데 아직 안배워서 넣어야함
		
		System.out.println("==========");
		System.out.println("==빙====고==");
		System.out.println("==========");
		
		// 빙고가되면 빙고가 됐다고 뜨게하기
		
		
		
	} // !!!

}
