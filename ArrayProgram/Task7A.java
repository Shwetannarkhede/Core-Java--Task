package ArrayProgram;

import java.util.Scanner;

public class Task7A {

	public static void main(String[] args) {
		// 7. WAP to store table of a number in an array.
		int num[] = new int[10];
		int n;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n = s.nextInt();
		
		for (int i = 0; i < num.length; i++)
			num[i] = n * (i+1);
		
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i]);

	}

}
