package ArrayProgram;

import java.util.Scanner;

public class Task3A {

	public static void main(String[] args) {
		// WAP to accept 10 elements and store in an array.
		// Create 2 arrays: one for even and one for odd numbers.

		int[] a = new int[10];
		int[] even = new int[10];
		int[] odd = new int[10];
		int e = 0, o = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers:");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

			if (a[i] % 2 == 0) {
				even[e] = a[i];
				i++;
			} else {
				odd[o] = a[i];
				o++;
			}
		}

		System.out.println("Even numbers:");
		for (int i = 0; i < e; i++) {
			System.out.println(even[i]);
		}

		System.out.println("Odd numbers:");
		for (int i = 0; i < o; i++) {
			System.out.println(odd[i]);
		}

	}
}
