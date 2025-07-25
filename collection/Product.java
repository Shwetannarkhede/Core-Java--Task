package collection;

public class Product {
	
// Task:
//		Create a class Product with a few variables as id, name, category, price, ratings. Add 10 objects of Product class in an ArrayList.
//
//		1. Display names of all products from Tech category
//		2. Display price of all clothes.
//		3. Count number of products which are from kids category.
//		4. Display only those products whose rating is above 4.5.
//		5. Display all information of all the products.
	
 public int id;
 public String name;
 public String Category;
 public int price;
 public float rating;
 
 
 public Product(int id,String name,String Category,int price,float rating) {
	 this.id=id;
	 this.name=name;
	 this.Category=Category;
	 this.price=price;
	 this.rating=rating;
	 
	 
 }





@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", Category=" + Category + ", price=" + price + ", rating=" + rating
			+ "]";
}
 
	

}
