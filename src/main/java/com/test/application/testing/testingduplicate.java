package com.test.application.testing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.test.application.testing.Student;
import com.test.application.testing.StudentDataBase;

public class testingduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentDataBase.getAllStudents().forEach(System.out::println);
		System.out.println("--------------------------");
		
		List<Student> StudentList =  StudentDataBase.getAllStudents().stream().distinct()
				 .collect(Collectors.toList());
	
		
		//employeesDistinctByName.forEach(System.out::println);
		
		Predicate<Student> stp=(s)->s.getGradeLevel()>3;
		
		Function<List<Student>,Map<String,Double>> F=(students->{
			Map<String,Double> p=new HashMap<String,Double>();
			
			students.forEach(student->p.put(student.getName(), student.getGpa()));
		
		return p;
				
		});
			
			
			
		
		
		System.out.println(F.apply(StudentList));
		
		
		
		
	}

}
