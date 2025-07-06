package String;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// WAP to accept a sentence and print only the words which start with a capital letter.ub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		
		for(int i=0;i<sentence.length();i++) {
			char ch=sentence.charAt(0);
			if(ch>='A' && ch<='Z') {
				System.out.println(ch);
			}
		}
	}

}
