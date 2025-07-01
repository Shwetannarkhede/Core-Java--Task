package Encapsulation;

public class Product {
	private int productId ;
	private String name;
	private String description;
	private int  price;
	private int quantity;
	private String category;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Product(int productId ,String name,String description,int  price, int quantity, String category)
	{
	
	this.productId=productId;
	this.name=name;
	this.description=description;
	this.price=price;
	this.quantity=quantity;
	this.category=category;
	
	
		
	}
	public Product() {
		// no paramerized
	}

}
