package ArrayProgram;



public class SumEven {
	// 1. WAP to find sum of all even numbers of the array.
	public static void main(String[] args) {
		int a[]= {2,4,5,7,8,9,10,20,40};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			sum=sum+a[i];	
			}
			
		}
		System.out.println("sum of even = "+ sum);
	}

}
