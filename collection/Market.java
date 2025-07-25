package collection;

import java.util.ArrayList;

public class Market {

	// Task:
//	Create a class Product with a few variables as id, name, category, price, ratings. Add 10 objects of Product class in an ArrayList.
//
//	1. Display names of all products from Tech category
//	2. Display price of all clothes.
//	3. Count number of products which are from kids category.
//	4. Display only those products whose rating is above 4.5.
//	5. Display all information of all the products.

	public static void main(String[] args) {
    ArrayList<Product> p = new ArrayList<Product>();
		
    Product p1 = new Product(1,"Asus Laptop","Electronics",50000,4.5f);
    Product p2 = new Product(2,"HP Laptop","Electronics",55000,4.1f);
    Product p3 = new Product(3,"Asus Laptop","Electronics",50000,4.5f);
    Product p4 = new Product(4,"GirlsTop","Cloths",2000,4.5f);
    Product p5 = new Product(5,"Girls Jeans","Cloths",4000,4.7f);
    Product p6 = new Product(6,"Men Shirt","Cloths",3000,4.0f);
    Product p7 = new Product(7,"Men Jeans","Cloths",5000,4.4f);
    Product p8 = new Product(8,"Toy","Kids",5000,4.5f);
    Product p9 = new Product(9,"kid cloth","Kids",5000,4.5f);
    Product p10 = new Product(10,"lenovo Laptop","Electronics",60000,4.5f);
    
    
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);
		p.add(p7);
		p.add(p8);
		p.add(p9);
		p.add(p10);
		int count=0;
		for (int i = 0; i < p.size(); i++) {
			// Q no.1
//			if(p.get(i).Category.equals("Electronics")) {
//				System.out.println(p.get(i).name);
//			}

			// Q no.2

//		  if(p.get(i).Category.equals("Cloths")) {
//				System.out.println(p.get(i).price);
//			}
			// System.out.println(p.get(i));
			
		  //Q 3.
//			
//			if (p.get(i).Category.equals("kids")) {
//				System.out.println(p.get(i).Category);
//				count++;
//			}
            // Q4.
			if (p.get(i).rating > 4.5) {
		        System.out.println(p.get(i).name + "  Rating: " + p.get(i).rating);
		    }
		
		}
		//System.out.println(count);
		
		//Q5.
		System.out.println(p);
	}

}