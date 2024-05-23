package com_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new Student("1김의연",1,1,100,100,100));
		list.add(new Student("2신현",1,2,90,100,40));
		list.add(new Student("3찬님",1,3,80,65,70));
		list.add(new Student("4플러수",1,4,100,10,90));
		list.add(new Student("5두비둡",1,5,20,30,80));
		// System.out.println(list);

	      Collections.sort(list); // Comparator 받게 되어있다
	      // System.out.println(list);

	      Iterator it = list.iterator();

	      while (it.hasNext()) {
	         Student s = (Student) it.next();
	         System.out.println(s.toString());
	      }
	      
	      System.out.println("////////////////위는 오름차순 밑에는 내림차////////////////");
	      
	      Collections.sort(list,new Ascending());
	      
	      it = list.iterator();

	      while (it.hasNext()) {
	         Student s = (Student) it.next();
	         System.out.println(s.toString());
	      }

	      


	}

}

class Ascending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			return s1.no - s2.no; // 오름차순
//			return s2.no - s1.no; // 내림차순
		
		}
		return -1;
	}
	
}

