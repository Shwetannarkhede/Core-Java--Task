package  CombineProgram;

public class ReversedProgram {

	public static void main(String[] args) {
		int a = 123;
		int rev = 0;
		int org = a;

		while (a != 0) {
			int dig = a % 10;
			rev = rev * 10 + dig;
			a = a / 10;

		}

		System.out.println(rev);

	}

}
