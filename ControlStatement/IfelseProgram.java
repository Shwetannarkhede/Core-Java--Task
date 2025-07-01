package ControlStatement;

public class IfelseProgram {

	public static void main(String[] args) {
		// 1. WAP to print Apple if the character contains value A, similarly print Ball for B, Cat for C, Doll for D and print "I don't know" for other values
      char ch = 'D';
      if(ch=='A') {
    	  System.out.println("Apple");
    	  
      }
      else if(ch=='B') {
    	  System.out.println("ball");
      }
      else if(ch=='C') {
    	  System.out.println("cat");
      }
      else if(ch=='D') {
    	  System.out.println("doll");
      }
      else {
    	  System.out.println("I don't know");
      }
      
      
      //2.  WAP to check if the number is even or odd or zero.
      
      int n=4;
      if(n==0) {
    	  System.out.println("value is zero");
      }
      else if(n%2==0) {
    	  System.out.println("value is even");
      }
      else
      {
    	  System.out.println("value is odd");
      }
   
      // 3. WAP to convert currency
      
      int i=2500;
      char c= '$' ;
       if (c=='#') {
    	   System.out.println(i/85);
       }
       else if(c=='$') {
    	   System.out.println(i/250);
       }
       else if(c=='@') {
    	   System.out.println(i/56);
       }
       else  {
    	   System.out.println("do not convert amount");
       }

       // 4. WAP to perform the selected operation
       
       int a=4;
       int b=3;
       char operation ='+';
       
       if (operation=='+') {
    	   System.out.println(a+b);
       }
       else if(operation=='-') {
    	   System.out.println(a-b);
       }
       else if(operation=='/') {
    	   System.out.println(a/b);
       }
       else if(operation=='*') {
    	   System.out.println(a*b);
       }
       else  {
    	   System.out.println("does not match opertion");
       }

       //5. WAP to check if the number is double digit or not.
       
       int r =560;
        if (r >=10 && r<=99) {
        	System.out.println("postive 2 digit");
        	
        }
        else {
        	System.out.println("not 2 digit");
        }
        //6. WAP to check if the character is vowel or consonant
        char v= 'o';
        if (v=='a'|| v=='e' || v=='i'||v=='o'|| v=='u') {
     	   System.out.println("it is vowel");
        }
        
        else  {
     	   System.out.println("it is consonant");
        }
	}

}
