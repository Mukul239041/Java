package testPkg;

import java.time.Period;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.*;

import mess.Customer;
import mess.MessPlan;

import static utils.MessValidations.parseandValidate;
import static utils.MessValidations.validateDuplication;
import static utils.MessValidations.validateAll;
import static utils.MessValidations.validateSignIn;
import static utils.PopulateMess.populateMess;


public class testMess {

	
	public static void main (String[] args) {
		
		Map<Integer , Customer> mp = populateMess();
			Scanner sc = new Scanner(System.in);
			boolean set=false;
			
			
			
			
			try {
			while(!set) {
				
				System.out.println("1.Add Customer 2.Display  3 .SignIn  4.Change Password 5.Sort As Per FirstName 6.Sort As Per Plan"
						+ " 7.Sort as per date of Registration 8. 9.Registration in Month" );
				
				int opt = sc.nextInt();
				switch(opt) {
				
				case 1: 
					System.out.println("Enter Customer Details:");
					System.out.println("int Customer_id , String first_name, String last_name ,String email, String password, \r\n" + 
							"			 String Address, String RegisterDate, String planEndDate, String Phone_No,MessPlan plan, double final_amount");
				
					validateAll(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),MessPlan.valueOf(sc.next()),sc.nextDouble(),mp);	
					break;
					
				case 2:
				//	mp.forEach((k, v) -> { System. out. println("Key: " + k + ", Value: " + v); });
					mp.values().forEach(System.out::println);
					break;
		
				case 3:
					System.out.println("Enter Email");
					
				//	mp.values().stream().filter(p->p.getEmail()!=sc.next()).findAny();
					validateSignIn(sc.next() , mp);
					
					break;
					
				case 4:
					System.out.println("Enter Email:");
					String email;
					email=sc.next();
					validateSignIn(email,mp);
					System.out.println("Enter New Password");
					String pass;
					pass=sc.next();
					for(Customer c:mp.values()) {
						if(c.getEmail().equals(email)){
							c.setPassword(pass);
						}
					}
					break;
					
				case 5:
					Comparator<Customer> comp = (c1,c2) ->(c1.getFirst_name().compareTo(c2.getFirst_name()));
					mp.values().stream().sorted(comp).forEach(c->System.out.println(c));
					break;
					
				case 6:
					Comparator<Customer> comp1 = (c1,c2) ->(c1.getPlan().compareTo(c2.getPlan())); 
					mp.values().stream().sorted(comp1).forEach(c->System.out.println(c));
					break;
					
				case 7:
					Comparator<Customer> comp2 =(c1,c2) ->(c1.getRegisterDate().compareTo(c2.getRegisterDate()));
					mp.values().stream().sorted(comp2).forEach(c->System.out.println(c));
					break;
					
//				case 8:
//					for(Customer c:mp.values()) {
//						if(c.getFirst_name().charAt(0)>=97 && c.getFirst_name().charAt(0)<=122 ) {
//							char ch = Character.toUpperCase(c.getFirst_name().charAt(0));
//							
//							
//						        
//						}
//					}
					
				case 9:
					
					mp.values().stream().filter(c->c.getRegisterDate().getMonthValue()==1).forEach(System.out::println);
					System.out.println();
					break;
					
					
					
				case 0:
					set=true;
					break;
					
				}
			  }	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

