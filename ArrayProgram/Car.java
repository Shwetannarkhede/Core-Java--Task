package ArrayProgram;

public class Car {
        String brand;
        String model;
        int price ;
        
		public Car (String brand, String model, int price){
        	 
        	        this.brand = brand;
        	        this.model = model;
        	        this.price = price;
        	         	
        }
	public static void main(String[] args) {
		//  WAP to store 5 objects of Car class in an array.
		
         Car c[]=new Car[5];
         c[0] = new Car("Toyota", "Fortuner", 4000000);
         c[1] = new Car("Hyundai", "Creta", 1500000);
         c[2] = new Car("Tata", "Harrier", 1800000);
         c[3] = new Car("Honda", "City", 1200000);
         c[4] = new Car("Maruti", "Swift", 800000);
        
         for(int i=0;i<c.length;i++) {
        	 System.out.println("Brand: " + c[i].brand + ", Model: " + c[i].model + ", Price: " + c[i].price);

         }
	}

}
