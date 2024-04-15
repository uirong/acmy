package etc;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		// 날짜
		// Date, Calendar
		
		/*
		Date today=new Date();
		System.out.println(today);
		System.out.println(today.getYear()+ 1900); // 1900년도를 기준으로 해서 흘렀다 ... 2024년은 1900에서 124번이 지났다는 뜻
		System.out.println(today.getMonth()+1); // 프로그램 특성상 0~11 월 이
		*/
		
		/*
		
		Calendar cal= Calendar.getInstance(); // 생성하기
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR)); 		// static하고 final한 상수 이기 때문에 (Calendar. ??)로 작성
		System.out.println(cal.get(Calendar.MONTH)+1); 		// 0~11이기 때문에 +1해주기
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); // 이번주는 전체 달의 몇째주?
		System.out.println(cal.get(Calendar.DATE)); 		// 오늘 일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));  // 1:일요일 ... 7:토요일
		System.out.println(cal.get(Calendar.HOUR));			// 12시간제
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));  // 24시간제 
		System.out.println(cal.get(Calendar.MINUTE)); 
		System.out.println(cal.get(Calendar.SECOND));
		 
		System.out.println(cal.getActualMaximum(Calendar.DATE)); // 달의 마지막 날이 며칠인지 알려준다
				
		*/
		
		Calendar cal=Calendar.getInstance();     // calendar 생성
		cal.set(2005, 7,31);		    	 // 필요하면 내가 원하는 날짜로 세팅 할 수 있다 .   3 썼다고 3월이 아니라 2월인거임 ...
		System.out.println(toString(cal)); 	 // 2005년 08월 31일

		cal.add(Calendar.DATE, 1); 		 // 음수는 지정 날짜에서 그만큼 빼고 양수는 그만큼 더하기
		System.out.println(toString(cal)); 	 // 2005년  9월 1일
		cal.add(Calendar.MONTH, -6);
		System.out.println(toString(cal)); 	 // 2005년 3월 1일 
		cal.roll(Calendar.DATE, 31);		 // 해당 기준 값은 "일" 인데 roll은 날짜가지고 더하기 빼기 하는데 월은 바뀌지 않는다
		System.out.println(toString(cal)); 
		cal.add(Calendar.DATE, 31);	 	 // roll 과는 같은데 "월" 에도 영향을 준다 
		System.out.println(toString(cal)); 	 // 2005년 4월 1일



		final int[] TIME_UNIT = { 3600, 60, 1 };
		final String[] TIME_UNIT_MATE = { "시간","분", "초" };

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();

		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30); // 10시 20분 30초

		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10); // 10시 30분 10초

		long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println("time1과 time2의 차이는 " + difference + "초 입니다");
		 
		String tmp="";
		for (int i = 0; i < TIME_UNIT.length; i++) {
			tmp += difference / TIME_UNIT[i] + TIME_UNIT_MATE[i];
			difference %= TIME_UNIT[i];  // 시간 정보만큼 버린 만큼의 나머지 날짜
		 }
		System.out.println("시분초의 차이: "+tmp);
		
		
	}// main
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"+(cal.get(Calendar.DATE))+"일";
	}
	
} //class
