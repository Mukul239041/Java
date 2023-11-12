package testerpkg;

import java.util.Map;
import java.util.Scanner;

import studentPkg.Course;
import studentPkg.Student1;
import utils.StudentValidationRules;
import static utils.PopulateStudent.populate;

public class Tester {
	
	
	public static void main(String[] args) {
	
	try(Scanner sc = new Scanner(System.in)){
		
		boolean abc = false;
		int opt;
		
		Map<String , Student1> mp1 =populate();
		
		try {
		while(!abc) {
			
			System.out.println("1.Display All Students:"+" "+"2.Add Student1"+"3.Remove RollNowise"+" " + "4.Remove Course");
			opt=sc.nextInt();
			
			switch(opt) {
			
			case 1:
//				for(Student1 s:mp1.values()) {
//					System.out.println(s);
//				}
//					break;
				
				mp1.values().stream().forEach(System.out::println);
				break;
					
			//case 2:
				
	        	case 2:
////				System.out.println("Enter Name:"+"Rank:"+"Age:"+"Course:");
////				String name , cr;
////				int rank , age;
////				name=sc.next();
////				rank=sc.nextInt();
////				age=sc.nextInt();
////				cr=sc.next();
////				Course course = Course.valueOf(cr.toUpperCase());
////				Student1 std = validateAll(rank, name, age, course);
////				break;
//				
				System.out.println("Enter RollNO "+" "+ "Rank "+" "+"Name "+" "+ "Age"+" "+ "Course");
			mp1.put(sc.next(),new Student1(sc.next(),sc.nextInt(),sc.next(),sc.nextInt(), Course.valueOf(sc.next().toUpperCase())));
			break;
				
			case 3 :
				System.out.println("Enter Roll No to be Removed");
				String rollno = sc.next();
				mp1.keySet().remove(rollno);
				break;
				
				
			case 4:
				System.out.println("Enter Course to be removed");
				String course=sc.next();
				mp1.entrySet().removeIf(v->v.getValue().getCourse().equals(Course.valueOf(course.toUpperCase())));
				break;
				
		//	case 5:
				
			case 0:
				abc=true;
				break;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	 }

   }

