package String;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
// WAP to accept a string and convert alternate characters to uppercase and lowercase.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String words = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length(); i++) {
			char ch = words.charAt(i);
			if (i % 2 == 0) {
				sb.append(Character.toUpperCase(ch));
			} else {
				sb.append(Character.toLowerCase(ch));
			}
		}

		System.out.println(sb.toString());

	}

}
