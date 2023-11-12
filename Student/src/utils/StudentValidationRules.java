package utils;

import studentPkg.Course;
import studentexception.*;
import studentPkg.*;

public class StudentValidationRules {
	
	
	private static int rk;
	static {
		rk=7000;
	}
	public static boolean validateAge(int age) throws InvalidInputException{
		
		if(!(age > 18))
		   throw new InvalidInputException("Invalid");
		return true;
	}
	
	public static Course validateCourse(String st) {
		
		       return Course.valueOf(st.toUpperCase());
		
	}
	
	public static boolean validateRank(int rank) throws InvalidInputException {
		
		if(rank > rk) 
			 throw new InvalidInputException("Not Allowed");
		
		return true;
		
	}
	
	public static Student1 validateAll(String rollno,int rank, String name, int age, Course course) throws InvalidInputException{
		
		boolean a = validateAge(age);
		
		boolean b = validateRank(rank);
		
		return new Student1(rollno,rank, name, age, course);
	}

}
