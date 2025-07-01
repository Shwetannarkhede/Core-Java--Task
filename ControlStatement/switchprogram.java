package ControlStatement;

public class switchprogram {

	public static void main(String[] args) {
		// 1. WAP to check if the number is even or odd
		 int a=4;
		switch(a%2) {
		 case 0:System.out.println("even"); break;
		 case 1:System.out.println("odd");
			  }
		
		
		
// 2. WAP to check if the number is positive or negative
		int b= 40;
		 if(b>=0) {
		     switch(b) {
		          case 20: System.out.println("value is postive");
		               }
		    
		          }
		 else {
			 System.out.println("value is negative");
		      }
		
		 
		 // 3. WAP to check if the number is single digit or not
		 
		  int c=20;
		 
			  switch(c) {
			  case 1: 
			  case 2: 
			  case 3: 
			  case 4: 
			  case 5:
			  case 6: 
			  case 7: 
			  case 8: 
			  case 9: System.out.println("digit is single"); 
			  break;
			  default : System.out.println("digit is not single");
			  
		  }
			  
			  
	//4. WAP to check if the alphabet is vowel or not.
			  char ch = 'f';
				
				switch(ch) {
					case 'a': 
					case 'e': 
					case 'i':
					case 'o': 
					case 'u': System.out.println("Vowel"); 
					break;
					default: System.out.println("Consonant"); 
					break;
				}
//5. WAP to perform the selected operation on 2 variables.
				int m=4;
				int n=4;
				double result ;
				char opertaion= '+';
				switch(opertaion) {
				case '+': System.out.println(result=m +n);break;
				case '-': System.out.println(result= m -n);break;
				case '*': System.out.println(result= m *n);break;
				case '/': System.out.println(result= m /n);break;
				case '%': System.out.println(result= m % n);break;
				
				
				}
		 }

	}


