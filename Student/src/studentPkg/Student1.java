package studentPkg;

public class Student1 {
	
	private String rollno;
	private int rank;
	private String name;
	private int age;
	private Course course;
	
	public Student1(String rollno ,int rank, String name, int age, Course course) {
		super();
		this.rollno=rollno;
		this.rank = rank;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", rank=" + rank + ", name=" + name + ", age=" + age + ", course=" + course
				+ "]";
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	
	
	
	
	

}
