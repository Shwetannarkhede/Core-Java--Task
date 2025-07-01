package Methods;

public class FactorialNumber {
	// 1. WAM to print factorial of a number.
	public int number(int num) {
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		 return factorial;
	}

	public static void main(String[] args) {
		FactorialNumber f=new FactorialNumber();
		int num=5;
		int result=f.number(num);
		System.out.println(result);
		

	}

}
