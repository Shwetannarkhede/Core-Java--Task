package Encapsulation;

public class Inventory {

	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product(2,"realme","nice camera",20000,5,"phone");
		

		p1.setProductId(1);
		p1.setName("samsung");
		p1.setDescription("good product");
		p1.setPrice(3000);
		p1.setQuantity(4);
		p1.setCategory("phone");
		
		
		System.out.println(p1.getProductId());
		System.out.println(p1.getName());
		System.out.println(p1.getDescription());
		System.out.println(p1.getPrice());
		System.out.println(p1.getQuantity());
		System.out.println(p1.getCategory());
		
        System.out.println("-----------------  ");
		
		System.out.println(p2.getProductId());
		System.out.println(p2.getName());
		System.out.println(p2.getDescription());
		System.out.println(p2.getPrice());
		System.out.println(p2.getQuantity());
		System.out.println(p2.getCategory());
		
		
	}

}
