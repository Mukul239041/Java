package Utils;

import java.time.LocalDate;
import java.util.List;

import ExceptionPkg.DoctorException;
import Hospitalpkg.Doctor;


public class HospitalValidations {

	
	public static LocalDate parseandvalidateDate(String jDate) throws DoctorException{
		
		//LocalDate b="2001-05-10";
		LocalDate a= LocalDate.parse(jDate);
		if((a.isBefore(LocalDate.of(2001, 5, 10))))
			throw new DoctorException("Not Allowed");
		return a;
		
	}
	
	public static boolean validateEmailId(List<Doctor> dr, String email) throws DoctorException {
		
		for(Doctor d:dr) {
			if((d.getEmail().contains(email)))
				return true;
		}
		throw new DoctorException("Login Failed");
	}
	
	public static Doctor validateAll(int experience, String dname, String email, String degree, String joining_date, double salary,List<Doctor> dr) throws DoctorException {
		
		LocalDate a=parseandvalidateDate(joining_date);
		boolean b=validateEmailId(dr,email);
		
		return new Doctor(experience, dname, email, degree, a, salary);
		
	}
	
	
	
}
