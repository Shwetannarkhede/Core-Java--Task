package Encapsulation;

public class Showroom {

	public static void main(String[] args) {
		Vehicle v1 =new Vehicle();
		Vehicle v2=new Vehicle(1101,"swift","maruti suzuki","black","55km",2022);
		
		v1.setVehicleNumber(1010);
		v1.setModel("swift");
		v1.setBrand("maruti suziki");
		v1.setColor("black");
		v1.setMileage("55km");
		v1.setPrice(500000);
		
		
	
		System.out.println(v1.getVehicleNumber());
		System.out.println(v1.getModel());
		System.out.println(v1.getBrand());
		System.out.println(v1.getColor());
		System.out.println(v1.getMileage());
		System.out.println(v1.getPrice());
		
		System.out.println("----------------------");
		
		System.out.println(v2.getVehicleNumber());
		System.out.println(v2.getModel());
		System.out.println(v2.getBrand());
		System.out.println(v2.getColor());
		System.out.println(v2.getMileage());
		System.out.println(v2.getPrice());

		
	}

}
