package Hospitalpkg;

import java.time.LocalDate;
import java.util.Comparator;


public class Doctor {

	private static int count;
	private int  experience;
	private int docId;
	private String Dname , email , degree ;
    private LocalDate joining_date;	
    private double Salary;
	public Doctor(int experience, String dname, String email, String degree, LocalDate joining_date, double salary) {
		super();
		this.docId=count++;
		this.experience = experience;
		Dname = dname;
		this.email = email;
		this.degree = degree;
		this.joining_date = joining_date;
		Salary = salary;
	}
	
	static {
		count=1;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public LocalDate getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(LocalDate joining_date) {
		this.joining_date = joining_date;
	}

	public double getSalary() {
		return this.Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Doctor [experience=" + experience + ", docId=" + docId + ", Dname=" + Dname + ", email=" + email
				+ ", degree=" + degree + ", joining_date=" + joining_date + ", Salary=" + Salary + "]";
	}

//	@Override
//	public int compareTo(Doctor o) {
//		return this.getSalary().compareTo(o.getSalary());
//		return 0;
//	}
    
//	public  int compareTo(Doctor d) {
//		return this.getSalary().CompareTo(d.getSalary());
//	}
    
}
