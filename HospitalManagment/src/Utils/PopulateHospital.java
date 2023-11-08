package Utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ExceptionPkg.DoctorException;

import static Utils.HospitalValidations.parseandvalidateDate;

import Hospitalpkg.Doctor;

public class PopulateHospital {

	
	public static List<Doctor> populateHospital() throws DoctorException{
		
		List<Doctor> dr = new ArrayList<>();
		
		dr.add(0,new Doctor(20, "Shirish", "Shirish@123", "MD", parseandvalidateDate("2001-12-10"), 200000));
		dr.add(1,new Doctor(18, "Kunal", "Kunal@123", "MBBS", parseandvalidateDate("2003-12-10"), 100000));
		dr.add(2,new Doctor(3, "Abhi", "Abhi@123", "BHMS", parseandvalidateDate("2020-12-10"), 5000));
		dr.add(3,new Doctor(5, "Sunny", "Sunny@123", "MBBS", parseandvalidateDate("2018-12-10"), 300000));
		
		
		return dr;
	}
}
