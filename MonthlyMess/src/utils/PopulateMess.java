package utils;

import java.time.LocalDate;
import static utils.MessValidations.parseandValidate;
import java.util.HashMap;
import java.util.Map;

import mess.Customer;
import mess.MessPlan;

public class PopulateMess {
	
	public static Map<Integer, Customer> populateMess(){
	
	Map<Integer , Customer> mp = new HashMap<>(); 
//	private int Customer_id ;
//	private String first_name, last_name , email, password , Address, Phone_No ;
//	private LocalDate RegisterDate; 
//	private LocalDate planEndDate;
//    private MessPlan plan;
//    private double final_amount;
	
   mp.put(1,new Customer(1, "Mukul" ,"Khot" ,"Mukul@123", "Mukul123", "Sangli", "123456",parseandValidate("2023-11-04"),
		   parseandValidate("2023-11-05"), MessPlan.Monthly, 3000));
   mp.put(2,new Customer(2, "Abhi" ,"Paikrao" ,"Abhi@123", "Abhi123", "Nashik", "987650",parseandValidate("2023-11-05"),
		   parseandValidate("2023-11-08"), MessPlan.Quarterly, 11700));
   mp.put(3,new Customer(3, "Sunny" ,"Jate" ,"Sunny@123", "Sunny123", "Yevale", "889745",parseandValidate("2023-11-03"),
		   parseandValidate("2023-11-09"), MessPlan.Half_Year, 17500));
   mp.put(4,new Customer(4, "Bhaskar" ,"Gogoi" ,"Bhaskar@123", "Bhaskar123", "Aasam", "776542",parseandValidate("2023-11-05"),
		   parseandValidate("2024-11-05"), MessPlan.Yearly, 32000));
   mp.put(5,new Customer(5, "Saurabh" ,"Garg" ,"Saurabh@123", "Saurabh123", "Hariyana", "864993",parseandValidate("2023-11-05"),
		   parseandValidate("2023-11-08"), MessPlan.Monthly, 3000));
   mp.put(6,new Customer(6, "Shirish" ,"nalwade" ,"Shirish@123", "Shirish123", "Dharashiv", "748933",parseandValidate("2023-11-01"),
		   parseandValidate("2023-11-02"), MessPlan.Monthly, 3000));
   
	return mp;
	}
}
