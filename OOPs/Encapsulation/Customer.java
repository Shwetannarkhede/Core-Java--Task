package Encapsulation;
//1. Create a class Customer with customerId, name, email, phone, address, and balance 
//as private variables.The Customer class must have getter and setter methods,
//parameterized constructor, non-parameterized constructor, and toString method.
//Create 3 objects of the same class in another class say Bank. Assign appropriate values to variables and print the entire object.

public class Customer {
	private int customerId ;
	private String name;
	private String email;
	private long phone;
	private String address;
	private int balance ;
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Customer(int customerId,String name,String email,long phone,String address, int balance )
	{
		this.customerId= customerId;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.address=address;
		this.balance=balance;
		
	}
	public Customer() {
		// no paramerize
	}
	
	

}
