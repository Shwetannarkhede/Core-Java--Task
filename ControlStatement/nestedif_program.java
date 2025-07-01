package ControlStatement;

public class nestedif_program {
	public static void main(String args[]) {
	 int num = -120;
	 if(num==0) {
		 System.out.println("number is zero ");
			
		}
	 else {
		 if(num >0) {
			 System.out.println("postive number");
		 }
		 else
		 {
			 System.out.println("negative number");
		 }
	 }
	 
	// example 2
	 
	 int i=4;
	 if(i==0) {
		 System.out.println("number is zero");
	 }
	 else {
		 if(i%2==0) {
			 System.out.println("even");
		 }
		 else {
			 System.out.println("odd");
		 }
	 }
	 
	 
	}
	

}
