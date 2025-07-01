package ArrayProgram;

public class ReplaceArray {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9};
		for (int i = 0; i < a.length - 1; i=i+2) {
		    int temp = a[i];
		    a[i] = a[i + 1];
		    a[i + 1] = temp;
		}
		  System.out.println("Array swap :");
		    for (int i = 0; i < a.length; i++) {
		        System.out.print(a[i] + " ");
		    }
	}

}
// i < a.length - 1 this is use because length of array is like 4 but we are swap 
//i and i+1 so if last index is 3 and i+1 is not exist so  i < a.length - 1 so -1 is use perious