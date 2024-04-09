package Inheritance;

public class TVCaption extends TVs{
	
	boolean caption;
	
	void displayCaption(String text) { // 자막 서비스
		if(caption) { // 조건이 boolean caption이 true/fasle인지 보는것
			System.out.println(text);
		}
	}
}
