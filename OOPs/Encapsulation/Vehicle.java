package Encapsulation;
// vehicleNumber, model, brand, color, mileage, and price 
public class Vehicle {
	private int vehicleNumber;
	private String  model;
	private String  brand;
	private String color;
	private String mileage;
	private int price;
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Vehicle(int vehicleNumber,String  model, String  brand, String color, String mileage, int price)
	{
		this.vehicleNumber=vehicleNumber;
		this.model=model;
		this.brand=brand;
		this.color=color;
		this.mileage=mileage;
		this.price=price;
	}
	
	public Vehicle() {
		
	}
	

}
