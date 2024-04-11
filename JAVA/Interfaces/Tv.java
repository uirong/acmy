package interfaces;

public class Tv {

//	LgSpeaker lgSpeaker;
//	SmSpeaker smSpeaker;
	
	Speakable speak; 
	
	// 생성자를 통해 lg스피커를 가져올것
//	public Tv(LgSpeaker lgSpeaker) {
//		this.lgSpeaker = lgSpeaker;
//	}

//	void speakSound() {
//	lgSpeaker.sound(); //tv에 lg를 적용시킨거임
//}

	
	public Tv(Speakable speak) {
		this.speak = speak;
	}
	
	void speakSound() {
		speak.sound();
	}
	
//	public Tv(Speakalbe speak) {
//		this.smSpeaker = smSpeaker;
//	}
//	
//	void speakSound() {
//		smSpeaker.sound();
//	}
	
	
}
