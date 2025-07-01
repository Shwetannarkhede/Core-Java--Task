package CombineProgram;
import java.util.*;

public class prifix_name {
	public static void main(String args[]) {
		/**String name = "shweta";
		String gender = "female";
		boolean married_states = false;**/
		Scanner sc=new Scanner(System.in);
		String name =sc.next();
		String gender =sc.next();
		boolean married_states =sc.equals(null);
		
		if(gender.equals("female")) {
			if(married_states==true) {
				System.out.println("mrs." +name);
			}
			else {
				System.out.println("miss." +name);
			}
			
		}
		else {
			System.out.println(" mr "+name);
		}
		
	}

}
