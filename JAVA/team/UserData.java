package team;

public class UserData {
	public static int length;
	String name;
	int age;
	int num;
	int card; // 면허증 class 1: 1종 class 2: 2종
	
	public UserData(String name, int age, int num,int card) {
		super();
		this.name=name;
		this.age=age;
		this.num=num;
		this.card=card;
		
	}
	void UserShow() {
		System.out.println("예약자명 : "+name+"나이 : "+age+"\r 전화번호"+"면허번호(1:1종 / 2:2종)"+card);
	}

}
