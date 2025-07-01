package ArrayProgram;

public class Task5A {

	public static void main(String[] args) {
		// 5. WAP to find an element in an array.
		int element= 20;
		int a[]= {10,20,30,40};
		for(int i=0;i<a.length;i++) {
			if(element==a[i]) {
				System.out.println("element is prsent in array");
break;

			}
			else {
				System.out.println("element is not prsent in array");
			}
		}

	}
}
//	public static void main(String[] args) {
//		// 5. WAP to find an element in an array.
//		int element= 20;
//		int a[]= {10,20,30,40};
//		boolean found=false;
//		for(int i=0;i<a.length;i++) {
//			if(element==a[i]) {
//				found=true;
//			}
//			
//		}
//		if(found) {
//			System.out.println("element is prsent in array");
//		}
//		else {
//			System.out.println("element is not prsent in array");
//		}
//	}
//
//}
