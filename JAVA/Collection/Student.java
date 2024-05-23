package com_set;

import lombok.AllArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@ToString
public class Student {
		
		String name;
		int ban, no, kor, eng , math;
		
		
		int getTotal() {
			return kor+eng+math;
		}
		
		float getAverage() {
			return (int)((getTotal()/ 3f)*10+0.5)/10f;
		}
		
		
//		@Override
		public int compareTo(Object o) { // Object o=> Student ..  object니까 type체크를 해줘야한다
			if(o instanceof Student) {
				// 여전히 Object type이기 때문에 student 타입으로 바꿔줘야한다
				Student other = (Student)o; // 멤버변수를 각각 사용할 수 있게 된다
				
				return this.name.compareTo(other.name); // 오름차순 ..매개변수를 받은 other에게 name값을 준다
			}
			return -1;
		}
//		override해서 그냥 간단하게 값만 가지고 이용한다


}
