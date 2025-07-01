package ArrayProgram;

public class OddProgram {

	public static void main(String[] args) {
	// WAP to print average of all odd numbers of the array.
		
		int a[]= {10,22,30,40,59,60,77,80,90};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum/a.length);

	}

}
