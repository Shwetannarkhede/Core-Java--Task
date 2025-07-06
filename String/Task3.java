package String;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		// WAP to accept a name from the user and check whether it is a palindrome or not.
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enetr the name : ");
			 String name = sc.nextLine();
		 StringBuilder sb = new StringBuilder(name);
	    
		String reversed= sb.reverse().toString();
		 //System.out.println(sb.reverse());
		String orignal=name;
		if(orignal.equals(reversed)) {
			System.out.println("palindrom");
			
		}
		else {
			System.out.println("not Palindrom");
		}
		       

	}

}
