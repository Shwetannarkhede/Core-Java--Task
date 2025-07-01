package Encapsulation;
//rollNumber, name, course, semester, CGPA, and address 
public class Student {
	private int rollNumber;
	private String name;
	private String  course;
	private String semester;
	private float CGPA;
	private String address;
	
	public int getRollNumber(){
		return rollNumber;
		
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public float getCGPA() {
		return CGPA;
	}
	public void setCGPA(float cGPA) {
		CGPA = cGPA;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student( int rollNumber, String name,String  course,String semester,float CGPA,String address)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		this.course=course;
		this.semester=semester;
		this.CGPA=CGPA;
		this.address=address;
		
	}
	
    public Student() {
    	
    }
	

}
