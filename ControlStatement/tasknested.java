package ControlStatement;

public class tasknested {


	public static void main(String[] args) {
		int a=20;
		int b=30;
		 if(a>0 && b>0) {
			 if(a<=b) {
				 System.out.println("b is greater than a");
			 }
			 else {
				 System.out.println(" a is greater than b");
			 }
		 
		 }
		 else {
			 System.out.println("number less than zero");
		 }
		 
		 
		 
// 2.WAP to find maximum between three numbers.
   int c=40;
   if(a>0 && b>0) {
	   
	   if(a>=b && a>=c) {
   		System.out.println( "a is maximum");
   		
   	    }
	   else if(b>=a && b>=c)
    	{
   		System.out.println("b is maximum");
   	    }
   	
   	else
   	{
   		System.out.println(" c is maximam");
   	}
   }
	 
   // 3.WAP to check whether a character is alphabet or not.
   char ch = 'a';
  
   if(ch>= 'A' && ch<= 'Z' || ch>= 'a' && ch<= 'z') {
	   System.out.println("charcter is alphabet");
	      
   }
   else {
	   System.out.println(" not character");
   }
   
   
   // 4.WAP to check whether character is vowel or consonant.
   char s='s';
	if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u' )
	{
		System.out.println(s+ "is the vowel");
	}
	else if(s=='A' || s=='E' || s=='I' || s=='O' || s=='U') 
	{
		System.out.println(s+ " is the vowel");
	}
	else
	{
		System.out.println(s+ " is the consonat");
	}
	
//5.WAP to input angles of a triangle and check whether triangle is valid or not.
	int i=60;
	int m=90;
	int n=60;
	
	int add =i+m+n;
	if(add==180) {
		System.out.println("traigle is vaild");
	}
	else {
		System.out.println("traingle is invaild");
	}
	/**5.WAP to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
	Percentage >= 90% : Grade A
			Percentage >= 80% : Grade B
			Percentage >= 70% : Grade C
			Percentage >= 60% : Grade D
			Percentage >= 40% : Grade E
			Percentage < 40% : Grade F **/
	
	int P=60;
	int C=70;
	int B=90;
	int M=80;
	int CS= 95;
	
	int totalmarks =P+C+B+M+CS;
	double Percentage = (totalmarks /500.0)*100;
	System.out.println( "percentage is " +Percentage);
	 if(Percentage >= 90) {
		 System.out.println("Grade A");
	 } 
	 else if(Percentage >= 80) {
		 System.out.println("Grade B");
	 }
	 else if(Percentage >= 70) {
		 System.out.println("Grade C");
	 }
	 else if(Percentage >= 60) {
		 System.out.println("Grade D");
	 }
	 else if(Percentage >= 40) {
		 System.out.println("Grade E");
	 }
	 else {
		 System.out.println("Grade F");
	 }
	
	
	
	
}

	}


