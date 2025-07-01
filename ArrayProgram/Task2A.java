package ArrayProgram;

public class Task2A {

	public static void main(String[] args) {
		// 2. WAP to count frequency of array elements.
		
		    int a[] = {3, 7, 8, 3, 4, 4};

		    for (int i = 0; i < a.length; i++) {
		        int count = 0;

		        for (int j = 0; j < a.length; j++) {
		            if (a[i] == a[j]) {
		                count++;
		            }
		        }
		        System.out.println("element " +a[i]+ " = "  +count);
		   
		        
		    }
	}

}
