package String;
import java.util.Scanner;
public class Task4 {
	

      	public static void main(String[] args) {
		// WAP to accept a string and print all characters along with their frequencies.
	
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter the String");
		String name=sc.nextLine();
		
		for(int i=0;i<name.length();i++) {
		//	System.out.println(name.charAt(i));
		 char ch=name.charAt(i);
			int count=0;
		for(int j=0;j<name.length();j++) {
			if(ch==name.charAt(j)) {
				count++;
				
			}
		}
		System.out.println(name.charAt(i) + "= " +count);
		
		}
		

	}

}
