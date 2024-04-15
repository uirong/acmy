package etc;

public class StringTest {

	public static void main(String[] args) {
		/*
		String str="Hello"; // 할당된 Hello가 어디있는지 주소값을 찾는 것
		str +="world";
		// String은 str이 참조되는 주소값을 다르게 간다. 매번 메모리를 할당해서 메모리 효율성이 제법 좋지않다. 새로운게(변경값)생기면 또 주소값이 바뀌면서 새롭게 생긴 메모리를 할당하는 방식
		
		String str2=new String("Hello"); // 클래스 이기 때문에 생성을 해줘야한다
		*/
		
		/*
		String str1="hello";
		String str2="world"; // String 클래스에 생성되는 애들. ==사용 불가
		
		if(str1.equals(str2)) { // 오버라이딩 된것
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		} // 결과 : 다르다
		*/
		
		// 문자열 자체가 string
		
		char[] cArr= {'h','e','l','l','o'}; // String과 붙으면 문자열이 된다. 문자 -> 문자열
		String str=new String(cArr); // 문자타입의 "hello"라는 문자열을 만들게 된다
		System.out.println(str);
		
		String str2="hello"; // 문자열은 index번호 부여됨. 문자열 -> 문자
		System.out.println(str2.charAt(0)); // 한글자 씩 뽑아내기 : 0-h, 1-e
		for(int i=0;i<str2.length();i++) { // length()는 메소드이다. 길이를 구하는 것 ! 헷갈리지 않기
			System.out.print(str2.charAt(i));
		}
		
		String str3="world";
		System.out.println(str3.indexOf('r')); // r이 있는지 없는지 확인하는지 확인 후 위치값을 뽑아내준다 world의 'r'의 위치값은 2
		System.out.println(str3.indexOf("ld")); // wor : 0 . ld : 3 . 전체 인덱스에서 특정 문자 시작 인덱스 번호를 알려준다
		
		String str4="cat,dog,bear"; // st4가 cat dog bear의 주소값을 받는거지 데이터가 들어가 있는게 아니다
		String[] arr= str4.split(","); // () 안에 있는 것을 기준으로 쪼갠다
		// arr이라는 string타입. 
		
		String str5="java.lang.Object"; // 전체 문자열에서 일부분의 값을 사용하고 싶다
		str5.substring(5,9); // 전체에서 특정 부분만 가져오기 위한 메소드 .subString(0,0);
		// 마지막의 숫자는 +1 해줘야한다. 8번째 글자 까지 가져오고 싶으면 +1해서 9해야함
		System.out.println(str5.substring(5,9)); // lang
		
		
		
		int x=100;
		String.valueOf(x); // x가 valueOf에 의해서 문자열로 형식이 바뀌게 된다
		String is=String.valueOf(x); // String is2=x+"";와 같은 결과값이 나온다  / boolean, int, long, float ... 가능
		System.out.println(is); // 100
		String is2=x+""; // x를 문자열로 변경
		if("hello".equals("hello")) { // 변수에 담지 않아도 그냥 문자열 그 자체로 담아서 사용 할 수 있다
			System.out.println("같다"); 
		}
		
		
		
		String fullName="hello.java"; //  . 이 있는 곳이 인덱스 번호
		int idx=fullName.indexOf('.'); // . 이 있는 인덱스 번호를 얻어오기
		
		String fileName=fullName.substring(0,idx); // 1) (시작점,끝값)
		String ext=fullName.substring(idx+1); // 2) 시작점 a가 끝나는 점에서 한 값이 더 커야한다 마지막위치까지 가지게 오게 되니까 전체 값을 가져올 수 있다
		
		System.out.println(fileName); // hello
		System.out.println(ext); // java
		
		System.out.println();
		
//		StringBuffer / StringBuilder
		
		StringBuffer sb=new StringBuffer("abc");
		System.out.println(sb); // abc
		sb.append("001"); // abc의 값뒤에서 001의 값이 붙는다
		System.out.println(sb); // abc001
		
		System.out.println(sb.length()); // 6
		sb.delete(1, 3); // 1~2번이 삭제된다 
		System.out.println(sb); // a001
		System.out.println(sb.length()); // 4 
		
		
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		if(sb1.equals(sb2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		} // 다르다
		
		String st1=sb1.toString(); // toString으로 문자열로 반환 후 사용 할 수 있다
		String st2=sb2.toString();
		if(st1.equals(st2)) { // equals가 값을 ... 확인하기 때문에 같은 것
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		} // 같다
 		
	}

}
