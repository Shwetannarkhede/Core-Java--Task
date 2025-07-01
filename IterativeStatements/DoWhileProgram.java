package IterativeStatements;

public class DoWhileProgram {

	public static void main(String[] args) {
		// 1. WAP to print all even numbers between 1 to 25

		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {

				System.out.println(i);

			}

		}
		// 2. WAP to print add all odd numbers between 1 to 25
		System.out.println("odd number between 1 to 25");
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {

				System.out.println(i);
			}

		}
		// 3. WAP to count all 2 digit even numbers between 1 to 25
		System.out.println(" 2 digit even numbers between 1 to 25");
		int count = 0;
		for (int i = 1; i <= 25; i++) {
			if (i >= 10 && i <= 99 && i % 2 == 0) {

				// System.out.println(i);
				count++;
			}

		}

		System.out.println(count);

		// 4. WAP to print all vowels between 'S' to 'Y' . a,e,i,o,u
		System.out.println("vowels between 'S' to 'Y'");
		for (char ch = 'S'; ch <= 'Y'; ch++) {
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(ch);
			}

		}
		// 5. WAP to calculate average of all odd numbers between 1 to 10
		System.out.println("average of all odd numbers between 1 to 10");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				sum += i;
				count++;
			}

		}
		int average = sum / count;
		System.out.println(average);
	}

}
