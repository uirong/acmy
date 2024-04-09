package Inheritance;

public class TVTest extends TVs {
	
	public static void main(String[] args) {
		
		TVCaption ctv=new TVCaption();
		ctv.displayCaption("김의연김의연");
		ctv.caption=true; // TVCaption클래스에 있는게 기본이 false이기 때문에 true로 켜준다
		ctv.displayCaption("김의연김의연");
		
		ctv.channel=10;
		System.out.println(ctv.channel); // 10
		ctv.channelUp(); // 부모의 메소드를 상속받음
		System.out.println(ctv.channel); // 11
		
		TV3D tv3d=new TV3D();
		tv3d.display3d(); // display 메소드를 실행해도 아무일도 안일어난다
		tv3d.tv3d=true; // 얘도 활성화 시키는 코드
		tv3d.display3d();
		
		tv3d.channel=20;
		System.out.println(tv3d.channel); // 30
		tv3d.channelDown(); // 부모의 메소드를 상속받음
		System.out.println(tv3d.channel); // 41
		
		// 부모의 공통요소를 정리하고 자식이 그대로 받아서 처리를 할 수 있게 해야한다
		// 부모를 어떤걸 정의할건지 자식에는 또 어떤식으로 할지 설계하고 어쩌구저쩌구
		// 코딩하기 전에 어떻게 해야할지 미리 다 짜고 해야한다
		
		// 모든 자바에서는 오브젝트를 .... 
				
	}
}
