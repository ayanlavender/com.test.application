package com.test.application.testing;

import java.util.function.Consumer;

public class Consumertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Consumer<String> cns=new Consumer<String> () {

			@Override
			public void accept(String  t) {
				System.out.println(t.toUpperCase());
				
			}}
		;
		
		//cns.accept("Sreejith");
		
		//Consumer<String> cns2=(s)->System.out.println(s);
		
		//cns2.accept("Sreejith");
		
		
		//Consumer<Student> cns3=(s)->System.out.println(s.getName());

		Consumer<Student> ConsName=s->System.out.println(s.getName());
		Consumer<Student> ConsList=s->System.out.println(s.getActivities());
		
		new StudentDataBase().getAllStudents().forEach(ConsName.andThen(ConsList));   //consumer chaining 
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
