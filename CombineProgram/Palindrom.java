package CombineProgram;

public class Palindrom {

	public static void main(String[] args) {
		int a=121;
		int rev=0;
		int org=a;
		
		if(a<0) {
			System.out.println("not palindram");
		}
		while(a!=0) {
			int dig= a%10;
			rev=rev*10+dig;
			a=a/10;
		}
		if(org==rev) {
			System.out.println(rev + " : is palindrom ");
		}
	}

}
	
	// using boolean with static keyword 	
	
//   public static boolean isPalindrome() {
//		int x=121;
//        int rev=0;
//        int org=x;
//        if(x<0){
//            return false;
//        }
//        while (x!=0){
//           int dig=x%10;
//           rev=rev*10+dig;
//           x=x/10;
//        
//            
//        }
//
//    return org==rev;
//	}
//	public static void main(String[] args) {
//		boolean result=isPalindrome();
//		  System.out.println("Is palindrome: " + result);
//	}
//}
 
	
