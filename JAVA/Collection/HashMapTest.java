package collectionFrame;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("myId","1234");
		map.put("qwer","1111");
		map.put("asdf","2222");
		System.out.println(map); // 중복시 마지막 값을 사용한다
		
//		map.get("Key값"); --> key를 이용해서 value를 반환
//		System.out.println(map.get("myId"));
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("id와 passWord를 입력하세요");
			System.out.print("ID >>");
			String id = sc.nextLine();
			System.out.print("PASSWORD >>");
			String pw = sc.nextLine();
			System.out.println();
			
			if(!map.containsKey(id)) { // 내가 넘긴 값이 map의 키 값(id) 으로 들어가지 않으면 !
				System.out.println("입력한 Id는 존재하지 않음");
				continue;
			}else {
				if(!(map.get(id)).equals(pw)) { // 만약 key값(id) 가 가지고 있는것과(일치한데) 너가 입력한 pw가 맞지 않는다면 (pw가 value값)
					System.out.println("비밀번호가 불일치");
					continue;
				}else {
					System.out.println("id와 pw가 일치");
					break; // 반복 종료
				}
			}
		}

	}

}
