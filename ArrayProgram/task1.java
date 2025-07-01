package ArrayProgram;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// WAP to accept 5 numbers and calculate average and percentage
		
   int a[]=new int[5];
   int sum=0;
  
   System.out.println("enter the 5 number");
   Scanner sc=new Scanner(System.in);
   
     for(int i=0;i<a.length;i++) {
    	 a[i]=sc.nextInt();
    	 sum=sum+a[i];
    	
     }
     int avg=sum/a.length;
    float  p=(sum/500.0f)*100;
    System.out.println("percentage is : " + avg);
 	 System.out.println("percentage is : " + p);
	}

}
