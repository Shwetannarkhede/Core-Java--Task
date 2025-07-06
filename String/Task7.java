package String;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// WAP to accept a string and print only those characters which appear more than once.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String words = sc.nextLine();
		
		for(int i=0;i<words.length();i++) {
			 int count=0;
			 char ch=words.charAt(i);
			 for(int j=0;j<words.length();j++) {
				
				 if(ch==words.charAt(j)) {
					 count++;
					
				 }
			 }
			 if (count > 1) {
	                System.out.println(ch + " = " + count);
	            }
		}
	}

}
