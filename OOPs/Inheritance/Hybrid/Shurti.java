package Hybrid;

public class Shurti extends Anut{
	public String Scooty;
	
	public Shurti() {
		System.out.println("scooty");
		super.Company="PHN company";
		super.showCompany();
	}
	
	
	public static void main(String args[]) {
		
	Shweta s=new Shweta();
	s.setJob("infoys");
	s.setDegree("Btech");
	s.setSkill("java full stack");
	
	System.out.println(s.getJob());
	System.out.println(s.getDegree());
	System.out.println(s.getSkill());
	
	System.out.println("-----------------");
	Nikita n1= new Nikita();
	System.out.println("-----------------");
	Ram r1=new Ram();
	System.out.println("-----------------");
	Shurti s1=new Shurti();
	
	

	
	}

}
