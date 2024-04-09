package basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamTest {

	public static void main(String[] args) {
		
		/*
		
		Scanner in=new Scanner(System.in);

		String[] subject= {"국어","수학","과학","영어","사회"}; // 과목의 정보
		int[] score=new int[5]; // 과목의 점수에 대한 정보
		
		int sum=0;
		double avg=0.0;
		
		for(int i=0;i<score.length;i++) {
			System.out.println("["+ subject[i] +"] 점수를 입력하세요");
			score[i]=in.nextInt(); // 과목 점수
		}
		
		for(int num : score) { // score에 있는 데이터를 num에 하나씩 집어 넣는다
			sum += num; // 첫번째 부터 마지막까지 있는 데이터를 합산한다
		
		avg =sum/(double)score.length;// score.length를 통해 score의 갯수를 찾는다
										// score, sum 둘다 int타입이기 때문에 소수점 평균으로 안떨어진다. double 캐스팅으로 데이터 타입이 더 큰 쪽을 따라 가기때문에 변경한다
		
		
//		for(int i=0;i<subject.length;i++) {
//			System.out.println(subject[i]+" 점수는 "+score[i]);
//		}
//		
//		>>>>
		
		int i=0;
		
		for(String sub:subject) { // 과목별 점수 출력
			System.out.println(sub+" 점수는 "+score[i++]); // sub의 점수는 score의 i번째에 온다
												// i=0;(후치는 계산 다하고 값을더함) 니까 0번째 데이터 출력하고 ++ 그다음 1번째 데이터 출력 ...
		}
		System.out.println("총점"+sum);
		System.out.println("평균"+avg);

		
	// 가장 높은 점수의 과목과 점수를 출력하기
		
		int max= score[0];
		String sub=null; // 기본형이 아니라 참조형이다. 지역변수는 초기화를 시켜야한다
		// i=1; : 0번째는 본인과 본인끼리 비교하기 때문에 의미가 없다
		for(int i1=1;i1<score.length;i1++) {
			if(max< score[i1]) {
				sub=subject[i1];
				max=score[i1]; // 크면 큰 점수로 바뀌고 남은 배열이랑 비교하고 크면 바뀐다
			}
		}
		System.out.println(sub+"과목의 점수가 가장 높습니다 "+max+"점");
		
		int min=score[0];
		String suj=null;
		for(int i2=1;i2<score.length;i2++) {
			if(min>score[i2]) {
				suj=subject[i2];
				min=score[i2];
			}
		}
		System.out.println(suj+"과목의 점수가 가장 낮습니다 "+min+"점");
		
		}
		
		*/
		
		
		
		
	}
}
