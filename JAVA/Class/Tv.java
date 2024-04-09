package Class;

public class Tv {

	// tv 클래스 정의 ; 객체의 생성
			public String color;
			public boolean power;
			public int channel;  // 특정 클래스 안에 정의된 변수 : 멤버변수
			
			public void power() {
				power = !power;
			}
			
			public void channelUp() {
				channel++;
			}
			public void channelDown() {
				channel--;
			}

}
