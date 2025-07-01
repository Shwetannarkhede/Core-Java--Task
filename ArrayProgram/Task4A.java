package ArrayProgram;

public class Task4A {

	public static void main(String[] args) {
		// 4. WAP to find min and max of an array.
		int a[] = { 10, 20, 30, 50, 100 };
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {

				min = a[i];
			} else if (max < a[i]) {
				max = a[i];
			}

		}
		System.out.println(" Min Number is : " +min);
		System.out.println(" Max Number is : " +max);
	}

}
