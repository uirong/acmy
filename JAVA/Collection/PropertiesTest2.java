package com_set;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;
import java.util.stream.Stream;

public class PropertiesTest2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		String inputFile = "src/input.txt"; // 이 경로로 파일을 사용 할 것 이다
		
		try {
			prop.load(new FileInputStream(inputFile));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} // load가 하는게 아니라 파일을 스트림을 통해 읽어오는 것
		System.out.println(prop);
		
		String name = prop.getProperty("name");
		System.out.println(name);
		
//		String data = prop.getProperty("data");
		String[] data = prop.getProperty("data").split(","); // String타입의 1차원 배열로 데이터가 반환되도록 만들어져 있다
		// prop.getProperty("") : Property에서 이 자체가 String타입이다 
		// split() : String 타입에서 제공하는 메소드
		// 마지막에 사용한게(.split(",");) 맨 앞에 있는 변수(String[] data) 타입에 맞춰서 받아준다.
		System.out.println(Arrays.toString(data)); // 배열 찍는 방법 Arrays.toString() ... >>>type이 String<<<

		System.out.println();
		System.out.println();		
		System.out.println();
		
		
		int max = 0;
		int min = 0;
		int sum = 0;
		double avg = 0.0;
		
		Properties pro = new Properties();
		String inputFile2 = "src/input2.txt";
		try {
			pro.load(new FileInputStream(inputFile2));
		}catch(FileNotFoundException f) {
			f.printStackTrace();
		}catch(IOException f) {
			f.printStackTrace();
		}
//		System.out.println(pro);
		
		
		// name2
		String name2 = pro.getProperty("name2");
//		System.out.println(name2);
		
		// max
		String[] data2 = pro.getProperty("data2").split(",");
		System.out.println(Arrays.toString(data2));
		

		int[] num = new int[data2.length];
		
		for( int i=0; i<num.length;i++) {
			num[i] = Integer.parseInt(data2[i]);
		}
		for (int i=0; i<num.length;i++) {
			int sValue = num[i];
			if(max < sValue) {
				max = sValue;
			}
			if(max > sValue) {
				min = sValue;
			}
			sum += num[i];
		}
		
		avg = (double) sum/num.length;
		
		
//		for( int num : score) {
//			score[i] = Integer.parseInt(data2[i]);
//			
//		}
		
		
//		Stream<String> score = Arrays.stream(data2).mapToInt(Integer :: parseInt);
		
		
		
		
		System.out.println("이름 : " + name2);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		
		

	}

}
