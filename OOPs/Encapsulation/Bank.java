package Encapsulation;

public class Bank {

	public static void main(String[] args) {
		Customer c1= new Customer();
		Customer c2=new Customer(2,"shweta","shweta@gmail.com",93842838,"pimpri Chinchwad",30000);
		
		
		c1.setCustomerId(1);
		c1.setName("shweta");
		c1.setEmail("shwetanarkhede@gmail.com");
		c1.setPhone(987653422);
		c1.setAddress("pimpri Chinchwad");
		c1.setBalance(30000);
		
		System.out.println(c1.getCustomerId());
		System.out.println(c1.getName());
		System.out.println(c1.getEmail());
		System.out.println(c1.getPhone());
		System.out.println(c1.getAddress());
		System.out.println(c1.getBalance());
		
		System.out.println(c2.getCustomerId());
		System.out.println(c2.getName());
		System.out.println(c2.getEmail());
		System.out.println(c2.getPhone());
		System.out.println(c2.getAddress());
		System.out.println(c2.getBalance());
		
	
		
		
		
		
	}

}
