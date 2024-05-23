package com_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class examHash {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		Random random = new Random();
		
		// 1~45 사이의 난수 중에서 6개의 숫자를 중복없이 set에 저장해서 출력
		
//		while(set.size()<6)
		for(int i=1; set.size() <= 6;i++) {
			int num = random.nextInt(45)+1;
			set.add(num);
		}
		System.out.println(set);
		
		
		
		for(int i = 0; set.size() < 6 ;i++) { // set에는 6개의 데이터가 보인다
			int lotto = (int)(Math.random() * 45) +1;
			set.add(lotto);
		}
		System.out.println(set);
		
		
		
		
		List list = new ArrayList(set); // set 타입이 list 타입으로 변경된다
		Collections.sort(list); // sort는 list만 받는다 ... type이 list인 친구만 받는다
					// 타입의 기본 정렬 방식을 사용해서 처리... 오름차순으로 정렬한다
		System.out.println(list);
		
		
	}

}
//
//
//
////creating a Random Object ran
//Random ran = new Random();
//
////generating a number using nextInt() method
//int randomNumber = ran.nextInt();