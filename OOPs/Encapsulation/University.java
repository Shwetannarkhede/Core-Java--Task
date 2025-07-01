package Encapsulation;

public class University {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(2,"komal pandit","java","7th",7,"pimpri chinchwad ");
		
		s1.setRollNumber(1);
		s1.setName("shweta Narkhede");
		s1.setCourse("java");
		s1.setSemester("7th");
		s1.setCGPA(8);
		s1.setAddress("pimpri chinchwad");
		
		System.out.println(s1.getRollNumber());
        System.out.println(s1.getName());
        System.out.println(s1.getCourse());
        System.out.println(s1.getSemester());
        System.out.println(s1.getSemester());
        System.out.println(s1.getCGPA());
        System.out.println(s1.getAddress());
        
          
        System.out.println("--------------------");
        
        
		System.out.println(s2.getRollNumber());
        System.out.println(s2.getName());
        System.out.println(s2.getCourse());
        System.out.println(s2.getSemester());
        System.out.println(s2.getSemester());
        System.out.println(s2.getCGPA());
        System.out.println(s2.getAddress());
	}

}
