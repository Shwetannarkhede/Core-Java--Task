package ArrayProgram;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		// 4. WAP to accept 10 numbers and find sum all even 2 digit numbers.
	 int a[]=new int[10];
	 int sum=0;
	 Scanner sc=new Scanner(System.in);
        System.out.println("enter the 10 number");
        for(int i=0;i<a.length;i++) {
        	 a[i]=sc.nextInt();
        	 if(a[i]>=10 && a[i]<99) {
        		 if(a[i]%2==0) {
            		sum=sum+a[i];
            	 }
        	 }
        	 
        }
        System.out.println(sum);
       
	}

}
