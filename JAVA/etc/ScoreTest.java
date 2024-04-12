package etc;

import java.util.Scanner;

public class ScoreTest {

	static Scanner in=new Scanner(System.in);
	//특정 변수 안에 넣으면 지역변수가 되어버려서 외부에는 못쓴다
	static ScoreData[] scoreData=new ScoreData[10];
	
	

	public static void main(String[] args) {
//		showMenu();// 스테틱한 메소드 끼리는 호출이 바로 가능하다
		int menu;
		
		while(true) {
			showMenu(); // 문제 풀때나 뭐 할때나 코드 칠 때 마다 테스트 하나씩 해보기
			System.out.print("메뉴 선택>> ");
			menu=in.nextInt();
			
			if(menu==1) {
				showAllScores();
			}else if(menu==2) {
				registerScore();
			}else if(menu==3) {
				searchScoreByname();
			}else if(menu==4) {
				deleteScoreByNum();
			}else if(menu==0){
				System.out.println("프로그램 종료");
				break;
			}
		}

	}
	static void showMenu() { 
		// 전체 선택할 메뉴
		System.out.println("-------------------");
		System.out.println("1. 전체 성적 조회");
		System.out.println("2. 성적 등록");
		System.out.println("3. 성적 검색");
		System.out.println("4. 성적 삭제");
		System.out.println("0. 종료");
		System.out.println("-------------------");
	}
	static void showAllScores() {
		System.out.println("전체 성적 조회");
		if(scoreData.length==0) { // 배열의 데이터가 아무것도 없을 때
			System.out.println("저장된 성적 데이터가 없습니다");
			return;
		}
		for(int i=0;i<scoreData.length;i++) {
			if(scoreData[i] !=null) {
				System.out.print((i+1)+"번 - ");
				scoreData[i].show(); // null이 아니면 .show했을때 오류남
			}
		}
	}
	static void registerScore() {
		System.out.println("성적등록");
		
		System.out.print("이름: ");
		String name=in.next(); // nextLine을 하면 문장..?으로 나와서 자바와 같이나옴
		
		System.out.print("자바: ");
		int java=in.nextInt();

		System.out.print("국어: ");
		int kor=in.nextInt();

		System.out.print("수학: ");
		int math=in.nextInt();

		System.out.print("영어: ");
		int eng=in.nextInt();
		
//		new ScoreData(name,java,kor,math,eng);
		for(int i=0;i<10;i++) { // i가 10번 돌 때
			if(scoreData[i] ==null) { // 스코어의 i번째가 null이라면
				scoreData[i]= new ScoreData(name,java,kor,math,eng);// 스코어의 i번째에 하나씩 데이터를 넣는다
				System.out.println(scoreData.toString()+"성적 등록완료");
				break;
			}
		}
	}
	
	static void searchScoreByname() {
		System.out.println("성적 검색");
		System.out.println("검색할 이름을 입력하세용");
		String name=in.next(); 
		boolean found = false;
		for(int i=0;i<10;i++) {
			if(scoreData[i]!=null&&(scoreData[i].name).equals(name)) { // 배열에서 name을 찾으면~~	.null이 아니면서 이름이 같은.	 =>name과 show를 바라 볼 수 있다
							// null이된다면 null이 name을 참조 할 수 없게 된다.
				System.out.println(name + "을(를) 찾았습니당");
				scoreData[i].show();
				found=true; // 찾았으니까 멈추기 전에 found를 true로 바꾼다
				break;
			}
		}
		if(!found) { // 쭉 10번까지 돌다가 if문 실행이 안되면
			System.out.println("이름 검색 실패");
		}
	}
	
	static void deleteScoreByNum() {
		System.out.println("성적 삭제");
		System.out.println("삭제할 성적데이터의 번호를 입력하세요: ");
		int select=in.nextInt();
		
		if(scoreData[select-1]==null) { //스코어데이터의 인덱스 셀렉트 번호에서 -1값이 null 이라면
			System.out.println("일치하는 성적 데이터가 없습니다");
			return; //메소드니까 return
 		}else{
 			scoreData[select-1]=null;
 			System.out.println("성적 데이터가 삭제 되었습니다");
			
		}
		
		
	}
}
