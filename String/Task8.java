package String;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// WAP to accept a string and count the number of special characters in it.
		// (Ignore alphabets and digits)
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name = sc.nextLine();
	//	String name = "shweta@3$5^7*";
		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {

				System.out.println("Special character: " + ch);
				count++;

			}

		}

		System.out.println("Total special character : " +count);
	}
}
