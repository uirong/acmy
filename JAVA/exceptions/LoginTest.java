package execptions;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		String id="java";
		String pw="1234"; // 아이디와 pw는 따로 예외 처리를 할 것이기 때문에 클래스를 따로 만들었다
		
		System.out.print("아이디 입력 >> ");
		String userId=in.next();
		
		System.out.print("비밀번호 입력>> ");
		String userPw=in.next();
		
		try {
			if(!(userId.equals(id))) { // userId가 다르다면
				throw new LoginIdFail("아이디가 일치하지 않습니다");
			}
			if(!(userPw.equals(pw))) {
				throw new LoginPwFail("비밀번호가 일치하지 않습니다");
			}
			System.out.println("로그인 성공");
			
			// 예외 클래스 만드는법
			
			// catch는 한번에 하나씩만 나와서 아이디랑 비번이 다르면 아이디가 틀렸다는 말만 나온다
			
		}catch(LoginIdFail e) {
			System.out.println(e.getMessage()); // 이걸 넣어주면 throw new 어쩌구가 나옴
			System.out.println("아이디를 확인하세요");
		}catch(LoginPwFail e) {
			System.out.println(e.getMessage());
			System.out.println("비밀번호를 확인하세요");
		}

	}

}
