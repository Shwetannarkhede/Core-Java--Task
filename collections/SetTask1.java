package collections;

import java.util.HashSet;
import java.util.Scanner;

public class SetTask1 {
    public static void main(String[] args) {
//		Create a friends set and add a few friend names in that set.
//		Try to check if Manoj is your friend or not, 
//		try to count number of friends you have etc.

		Scanner sc = new Scanner(System.in);

		HashSet<String> set = new HashSet<String>();
		System.out.println("Enter friend name:");
		for (int i = 0; i < 5; i++) {

			String name = sc.nextLine();
			set.add(name);
		}

		System.out.println(set.contains("manoj"));
		System.out.println(set.size());
		System.out.println(set);

	}

}

