package ArrayProgram;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// 2. WAP to accept 10 numbers and print in reverse order.
		
		
		  int a[]=new int[10];
		   System.out.println("enter the 10 number");
		   Scanner sc=new Scanner(System.in);
		   
		     for(int i=0;i<a.length;i++) {
		    	 a[i]=sc.nextInt();
		     }
		     for(int i=a.length -1;i>=0;i--) {
		    	 System.out.println( a[i]+ "");
		     }
		    	
	}

}
