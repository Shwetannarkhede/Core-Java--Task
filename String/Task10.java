package String;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// WAP to accept a mobile number from the user and validate whether it is a 10-digit number or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mobile Number: ");
		String MobileNumber = sc.nextLine();
         
        	  if(MobileNumber.length()==10 ) {
        		  System.out.println("validate Number");
        	  }
        	  else {
        		  System.out.println("  Number is Not valid ");
        	  }
         }
         
	}


