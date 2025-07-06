package String;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// WAP to accept a string and print it in reverse order but without using 
		//inbuilt reverse methods.
	
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the name: ");
	        String name = sc.nextLine();
	        
	        String rev = "";
	        
	        for (int i = name.length() - 1; i >= 0; i--) {
	            rev = rev + name.charAt(i);
	        }

	        System.out.println("Reversed string: " + rev);
	    }
		  

	}


