package CombineProgram;

public class Alternative {

	public static void main(String[] args) {
		int num = 45673;
        int rev = 0;

        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        // Step 2: Print alternate digits
        int count = 0;
        while (rev != 0) {
            int digit = rev % 10;
            if (count % 2 == 0) {
                System.out.print(digit + " ");
            }
            rev = rev / 10;
            count++;
        }
	}

}
