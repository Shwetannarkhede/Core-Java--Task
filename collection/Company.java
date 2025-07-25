package collection;

public class Company {
	//1. Create a map of PAN and Company. Put 5 companies in it. 
	//Display name and address of companies along with their PAN.
	
	public String name;
	public String address;
	//public String Pan;
	
	public Company(String name, String address) {
		this.name=name;
		this.address=address;
	//	this.Pan=Pan;
		
	  }

	@Override
	public String toString() {
		return "Company name is " + name + " and address is " + address ;
	}

}
