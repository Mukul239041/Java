package utils;

import java.time.LocalDate;
import java.util.Map;

import studentPkg.Course;
import studentPkg.Student1;
import java.util.Map.Entry;
import java.util.HashMap;

public class PopulateStudent {
	
	public static Map<String , Student1> populate(){
		
	Map<String , Student1 > mp = new HashMap<>();
	
	System.out.println("Added "
			+ mp.put("dac-001", new Student1("dac-001",1, "Mukul", 24 , Course.DAC)));
	
	System.out.println("Added "
			+ mp.put("dac-005", new Student1("dac-005",2, "Abhi", 23 , Course.DAC)));
	
	System.out.println("Added "
			+ mp.put("dac-010", new Student1("dac-010",3, "Sunny", 22 , Course.DAC)));
	
	System.out.println("Added "
			+ mp.put("dbda-001", new Student1("dbda-001",4, "Shivam", 24 , Course.DBDA)));
	
	System.out.println("Added "
			+ mp.put("ditiss-001", new Student1("ditiss-001",5, "Pratik", 22 , Course.DITISS)));
	
	System.out.println("Added "
			+ mp.put("ditiss-002", new Student1("ditiss-002",5, "Harsha", 22 , Course.DITISS)));
	
	System.out.println("Added "
			+ mp.put("ditiss-003", new Student1("ditiss-001",5, "Sakshi", 22 , Course.DBDA)));
	
	return mp;
	}
}
