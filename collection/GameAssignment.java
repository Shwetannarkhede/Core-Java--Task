package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GameAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		// String name ="shweta";
		String[] words = { "shweta", "komal", "yash", "rajay" };
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			ArrayList<Character> a = new ArrayList<Character>();

			for (int j = 0; j < word.length(); j++) {
				a.add(word.charAt(j));

			}

			System.out.println("Using these characters, make the right word: ");
			Collections.shuffle(a);
			System.out.println(a);
			
			String r = sc.nextLine();
			

			if (word.equals(r)) {
				System.out.println("congratulation ,correct word");
			
			} else {
				System.out.println("oops! ,incorrect word");
				break;
			}

		}
		sc.close();
	}
}