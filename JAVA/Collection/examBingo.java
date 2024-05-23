package com_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class examBingo {

	public static void main(String[] args) {

		
		// 1 ~ 50 난수 중 25개의 숫자를 중복 없이 2차원 배열에 저장
		Random random = new Random();
		Set set = new HashSet();
		
		int[][] board = new int[5][5]; // 5x5인 빙고판
		
		for(int i=0; set.size() < 25; i++) {
			set.add((int)(Math.random()*50)+1);
			/*
			int num = random.nextInt(50)+1;
			set.add(num);
			*/
			
			
//			shuffle도 list형식으로 받는다 ... set 자체를 받지 못한다
			List list = new ArrayList(set);
			Collections.shuffle(list); // 알아서 배열 나온 것들을 섞어준다 ... list가 데이터 타입으로 바뀐다
			Iterator it = list.iterator(); // list를 iterator 형식으로 바뀐다
			
			
		}
//		System.out.println(set);
		
		Iterator it = set.iterator(); //? Iterator 형식을 사용하는 이유 ??
		
		for(int i=0; i<board.length;i++) {
			for(int j=0; j<board[i].length;j++) { // 2차원 방식이라 중첩으로 들어간다
				board[i][j] = (Integer)it.next(); // 언박싱 해서 25(5*5)개의 데이터가 배열에 들어간다
				System.out.print((board[i][j] < 10 ? "  " : " ")+ board[i][j]);
			}
			System.out.println();
		}
		/*
		while(it.hasNext()) { // 데이터가 있는지 없는지 확인
			int num = (Integer)it.next();
			System.out.print(num + ", "); // set에 있는 데이터를 Iterator 형식으로 출력
		}
		*/
		
		
		
	}

}
