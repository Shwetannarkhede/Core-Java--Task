package ArrayProgram;

import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		// 3. WAP to accept 5 numbers and display 1st and last element only.
		System.out.println("enter number 5");
		int a[]= new  int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length;i++) {
        	a[i]=s.nextInt();
//        	int last=a[i]%10;
//            while(a[i]>=10) {
//            	a[i]=a[i]/10;
//            }
//            System.out.println(last);
//            System.out.println(a[i]);
//            
           
        }
        
        System.out.println("First number: " + a[0]);
        System.out.println("Last number: " + a[a.length - 1]);
     
        }

}
