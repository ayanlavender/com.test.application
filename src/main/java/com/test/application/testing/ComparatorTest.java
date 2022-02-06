package com.test.application.testing;

import java.util.Collections;
import java.util.Comparator;

import com.test.application.testing.Student; 


     
public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator Com=new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return o1.toString().compareTo(o2.toString());
			}
			
		};
		
		
		//System.out.println(Com.compare(3, 2));
		
		Comparator ComLamda=( o1, o2)->o1.toString().compareTo(o2.toString());
		
		System.out.println("before"+StudentDataBase.getAllStudents());
		
		
		Collections.sort(StudentDataBase.getAllStudents(),ComLamda);
		
		System.out.println("after"+StudentDataBase.getAllStudents());
		
		
		
	}

}
