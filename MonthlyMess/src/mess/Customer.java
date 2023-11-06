package mess;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{

	public Customer(int customer_id, String first_name, String last_name, String email, String password, String address,
			String phone_No, LocalDate registerDate, LocalDate planEndDate, MessPlan plan, double final_amount) {
		super();
		this.Customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		Address = address;
		Phone_No = phone_No;
		RegisterDate = registerDate;
		this.planEndDate = planEndDate;
		this.plan = plan;
		this.final_amount = final_amount;
	}
	private int Customer_id ;
	private String first_name, last_name , email, password , Address, Phone_No ;
	private LocalDate RegisterDate; 
	private LocalDate planEndDate;
    private MessPlan plan;
    private double final_amount;
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(String phone_No) {
		Phone_No = phone_No;
	}
	public LocalDate getRegisterDate() {
		return RegisterDate;
	}
	public void setRegisterDate(LocalDate registerDate) {
		RegisterDate = registerDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public MessPlan getPlan() {
		return plan;
	}
	public void setPlan(MessPlan plan) {
		this.plan = plan;
	}
	public double getFinal_amount() {
		return final_amount;
	}
	public void setFinal_amount(double final_amount) {
		this.final_amount = final_amount;
	}
	@Override
	public String toString() {
		return "Customer [Customer_id=" + Customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", password=" + password + ", Address=" + Address + ", Phone_No=" + Phone_No
				+ ", RegisterDate=" + RegisterDate + ", planEndDate=" + planEndDate + ", plan=" + plan
				+ ", final_amount=" + final_amount + "]";
	}
    
    
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.first_name.compareTo(o.first_name);
	}
	
}
