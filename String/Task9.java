package String;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// WAP to accept a string and remove all the white space characters from it.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name = sc.nextLine();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch != ' ') {
				System.out.print(ch);
			}
		}

	}

}