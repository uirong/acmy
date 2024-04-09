
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter

package Class;

public class Time {

	private int hour; // 0 ~ 23
	private int minute; // 0 ~ 59
	private float second; // 0 ~ 59
	
// Getter 읽기 / Setter 쓰기
	
	
	
	
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (!(hour >= 0 && hour <= 23)) { // 이 사이값이 아니라면~
			return;
		} // 이게 실행되면

		this.hour = hour; // 이것을 실행하지 않겠다
	}
	// 하나의 메소드엔 getter setter가 올 수 있다

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (!(minute >= 0 && minute <= 59)) {
			System.out.println("범위를 벗어난 값");
			return;
		}

		this.minute = minute;
	}

	public float getSecond() {
		return second;
	}

	public void setSecond(float second) {
		if (!(second >= 0 && second <= 59)) {
			System.out.println("범위를 벗어난 값");
			return;
		}
		this.second = second;
	}

}
