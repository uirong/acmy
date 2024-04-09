package circle;

public class Ractangle {
	
	public int w; // 가로
	public int h; // 세로
	
	public Ractangle(int w,int h){
		this.w=w;
		this.h=h;
	}
	
	public int getArea() { // 사각형의 넓이를 구하는 코드
		return w*h;
	}
}
