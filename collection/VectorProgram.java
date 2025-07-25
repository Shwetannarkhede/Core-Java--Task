package collection;

import java.util.Scanner;
import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		// 1.add element
		// 2.remove elemnt
		// 3.check element
		// 4.exit
		Vector<String> s = new Vector<String>();
		 while (true) {
		System.out.println("choose any one :");

		System.out.println("1: Add element");
		System.out.println("2: Remove element");
		System.out.println("3: Check element");
		System.out.println("4: Exit");

		Scanner sc = new Scanner(System.in);

		int choose = sc.nextInt();
		  sc.nextLine(); 
		switch (choose) {
		case 1:
			System.out.println(" Enter to Add element");
			String add = sc.nextLine();
			s.add(add);
			System.out.println("Element added successfuly.");
			System.out.println(s);
			break;
		case 2:
			System.out.println("Enter to Remove element");
			String remove = sc.nextLine();
			s.remove(remove);
			System.out.println("Element Remove successfuly.");
			System.out.println(s);
			break;
		case 3:
			System.out.println("Enter to Check element");
			String check = sc.nextLine();
			 if (s.contains(check)) {
                 System.out.println("Element found in the vector.");
             } else {
                 System.out.println("Element not found.");
             }
			System.out.println("Element checked successfuly.");
			System.out.println(s);
			break;
		case 4:
			System.out.println("4 : Exit");
			 System.out.println("Exiting program.");
             sc.close();
             return;
			
		}
		 }
	}
}
