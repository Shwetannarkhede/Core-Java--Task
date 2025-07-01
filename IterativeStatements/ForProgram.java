package IterativeStatements;

public class ForProgram {

	public static void main(String[] args) {
		//example 1
		System.out.println(" print number 1 to 5");
		for(int i=1 ;i<=5; i++) {
			System.out.println(i);
			
		}
		//example 2
		System.out.println("print reverse 10 to 1");
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		// example 3
		System.out.println("print table of 8");
		int num=8;
		for(int i=1;i<=10;i++) {
			System.out.println(i*num);
		}
		
		
		//example 4
		
		System.out.println("print 1 to 5 and aslo print hi ");
		for(int i = 1; i<=5; i++)
		{
			System.out.println(i);
			for(int j = 1; j <= 2; j++)
			{
				System.out.println("Hi!");
			}
		}
	//	example 5
		System.out.println("print number 1 to 5 and reverse it 5 to 1 ");
		 for(int i = 1; i <= 5; i++)
		 {
			 System.out.println(i);
	     }
		 for(int j = 5; j >= 1; j--) 
		 {
			 System.out.println(j);
		 }
// example 6
		 System.out.println("Star pattern ");
		 for(int i = 1; i <= 5; i++) {
			   
		      for(int j = 1; j<i; j++) {
		        System.out.print("*");
		    }
		     System.out.println("*");
	}
	}
}
