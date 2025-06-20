package exercises;

public class Student {
	private String name, major;
	private int year;
	
	Student(String name, int year, String major){
		this.name = name;
		this.year = year;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	
	@FunctionalInterface
	public interface StudentFormatter {
		 String format(Student s);
	}
	
	public static void main(String []args) {
		
		StudentFormatter simpleFormatter = student ->
		"Student " + student.getName() + ", Year " + student.getYear();
		
		StudentFormatter detailedFormatter = student ->
		student.getName() + " studies " + student.getMajor() + " in Year " +  student.getYear();
		
		Student s = new Student("Alice", 2, "Physics");
		Student z = new Student("Bonel", 2, "Comp. Sci.");
		
		System.out.println(simpleFormatter.format(s));
		System.out.println(detailedFormatter.format(z));
	}
}
