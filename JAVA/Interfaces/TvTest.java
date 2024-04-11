package interfaces;

public class TvTest {

	public static void main(String[] args) {
		
		
		LgSpeaker lgs=new LgSpeaker(); // Tv클래스가 Lgspeak라는 정보를 가지고 있으므로 꺼내와야한다
		SmSpeaker sms=new SmSpeaker();
		AppleSpeaker apps=new AppleSpeaker();
		
		Tv t=new Tv(apps);
		t.speakSound();
	}
	
//	인터페이스를 통해서 각각의 클래스가 추상 메소드로 약속을 정해서 이거이거는 이렇게이러게 상속해야하니 인터페이스의 클래스를 가지고 쓸 때 인터페이스만 알면된다
//	새로 추가할때는 추가가 되더라도 이 코드는 변하지 않는다

}
