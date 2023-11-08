package testerPkg;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ExceptionPkg.DoctorException;

import static Utils.PopulateHospital.populateHospital;

import Hospitalpkg.Doctor;

import static Utils.HospitalValidations.validateAll;
import static Utils.HospitalValidations.validateEmailId;

public class Tester {

	public static void main(String[] args) throws DoctorException {
		
		List<Doctor> dr = new ArrayList<>();
		dr=populateHospital();
		
		Scanner sc = new Scanner(System.in);
		boolean exit=false;
		
		while(!exit) {
			
			System.out.println("1.Add Doctor 2.Display 3. SignIn  4.Highest Salary 5. Sorting on Expe. 6. Othopedics");
			int opt = sc.nextInt();
			
			switch(opt) {
			
			case 1: 
			System.out.println("int experience, String dname, String email, String degree, LocalDate joining_date, double salary");
			Doctor doctor = validateAll(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),dr);
			dr.add(doctor);
			break;
			
			case 2:
			dr.stream().forEach(d->System.out.println(d));
			break;
				
			case 3:
				System.out.println("Enter EmailId");
				validateEmailId(dr,sc.next());
				System.out.println("Sign In Succesful");
				break;
				
        	case 4:
//   				Comparator<Doctor> comp = (d1,d2)->((Double)d1.getSalary().compareTo(d2.getSalary()));
//				dr.stream().sorted(comp)
//				.forEach(System.out::println);
//				break;
        		dr.stream().filter(d->d.getDegree().equals(sc.next().toUpperCase())Math.max(d));
				
//			case 5:
//				Comparator<Doctor> dr = (d1,d2) -> (d)
				
		//	case 6:
			case 0:
				exit=true;
				break;
			}
		}
	}
}
