package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import mess.Customer;
import messExp.MessException;
import java.time.LocalDate;
import java.time.Period;

import mess.MessPlan;



public class MessValidations {
	
	public static int validateDuplication(Map<Integer,Customer> mp , Integer id) throws MessException{
		
		if((mp.containsKey(id)))
			throw new MessException("Duplicate Entry");
		else
		return id;
	}
	
	public static void validateSignIn(String email , Map<Integer,Customer> mp) throws MessException {
		
		     Scanner sc = new Scanner(System.in);
		     int a=0;
			for(Customer c:mp.values()) {
				if(c.getEmail().equals(email)) {
					System.out.println("Enter Password");
					if(c.getPassword().equals(sc.next())) {
						System.out.println("SignIn Succesful");
						a=1;
						break;
					}
					else
						 throw new MessException("Invalid Password");
				}
				
			}
			if(a==0)
				throw new MessException("Invalid EmailId");
		}
	
      public static LocalDate parseandValidate(String date) throws IllegalArgumentException {
		
		return LocalDate.parse(date);
	}
      
      public static void validatePlan(Map<Integer , Customer> mp , MessPlan plan , double amt) throws MessException{
    	  
    	  for(Customer c:mp.values()) {
    		  
    		  if(!(c.getPlan()==plan && c.getFinal_amount()==amt))
        			  throw new MessException("Invalid Plan");
    		  break;
    		  
    		  
    		  
    	  }
    	 
      }
      
      public static void validateDate(Map<Integer ,Customer> mp , LocalDate RegisterDate, LocalDate planEndDate) throws MessException{
    	  
    	//  Period p;
    	  
    	  for(Customer c : mp.values()) {
    		  
    		  if(c.getPlan()==MessPlan.Monthly) {
    			  
    			 if( Period.between(RegisterDate, planEndDate).getMonths() > 1 )
    			  throw new MessException("Invalid Date Entries");
    		  }
    	  }
    		  
      }
      
      
	
	public static void validateAll(int Customer_id , String first_name, String last_name ,String email, String password, 
			 String Address, String RegisterDate, String planEndDate, String Phone_No,MessPlan plan, double final_amount,Map<Integer , Customer> mp) throws MessException {
		
		int cid =validateDuplication(mp, Customer_id);
		LocalDate a = parseandValidate(RegisterDate);
		LocalDate b = parseandValidate(planEndDate);
		validatePlan(mp,plan,final_amount);
		validateDate(mp,a,b);
		
	//	Map<Integer , Customer> mp = new HashMap<>();
		
		
		
		mp.put(Customer_id , new Customer(cid , first_name, last_name ,email, password, 
				 Address, Phone_No, b, a, plan, final_amount));
		
	}

	
	
}
