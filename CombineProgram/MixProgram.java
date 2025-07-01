package CombineProgram;

public class MixProgram {

	public static void main(String[] args) {
	//1. WAP to check if the number is prime or not.
			int num=3;
			int count=0;
			if(num==2) {
				System.out.println("number is prime");
			}
			else {
				for(int i=1;i<=num;i++) {
					if(num%i==0) {
					count++;
					}
	
				}
				if(count==2) {
					System.out.println("prime number");
				}
				else {
					System.out.println("not prime");
				}
			}
			
			
			
			
		 
	//2. WAP to count the number of digits of a number
			int n=1235;
			 while(n>0) 
			 {
				 n=n/10;
				 count++;
			 
			 }
			 System.out.println(count);
				
		
		 
	//4. WAP to check the number is palindrome or not
			 
				        int m = 121; 
				        int original = m;
				        int rev = 0;

				       
				        while (m != 0) {
				            int digit = m % 10;        
				            rev = rev * 10 + digit; 
				            m = m / 10;              
				        }

				        
				        if (original == rev) {
				            System.out.println(original + " is a palindrome.");
				        } else {
				            System.out.println(original + " is not a palindrome.");
				        }
				    
// 5. 5. WAP to print alternate digits of a number
				        
				

		 
	
	}

}
