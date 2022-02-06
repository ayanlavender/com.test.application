package com.test.application.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@ToString
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Student { 
	@NonNull
    private String name;
	@NonNull
    private int gradeLevel;
	@NonNull
    private double gpa;
	@NonNull
    private String gender;
	private int noteBooks;
	@NonNull
	private List<String> activities;
    
	private Optional<Bike> bike;
	
	
	
	 public Student(String name, int gradeLevel, double gpa, String gender, int noteBooks, List<String> activities) {
	        this.name = name;
	        this.gradeLevel = gradeLevel;
	        this.gpa = gpa;
	        this.gender = gender;
	        this.noteBooks = noteBooks;
	        this.activities = activities;
	    }


}
