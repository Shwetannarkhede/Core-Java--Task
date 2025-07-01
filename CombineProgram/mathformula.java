package CombineProgram;

public class mathformula {

	public static void main(String[] args) {
	
		// area of cicle
	  float r=2 ;
		                                          // circle = 3.14*r*r
    float circle=3.14f*r*r;
	System.out.println(circle);
	
//area of triangle
		byte b=2;
		byte h=4;
		
		float triangle=0.5f *b*h;
		System.out.println("area of triangle :" +triangle);   
		
		// area of rectangle
		 int l=4;
		 int m=2;
		 
		 int rectangle =l*m;
		 System.out.println("area of rectangle :" +rectangle);
		
	//circle
				
		byte a=2;
		float diameter=2*a ;
		float perimeter =2*3.14f*a;
		 
		System.out.println("area of diameter of circle :"+diameter);
		System.out.println("area of perimeter of circle :"+perimeter);
		
		// gram into kilogram convert
		int grams=2500;
		float kilogram =grams/1000f;
		System.out.println(kilogram);
		
		 //convert (USD) to  (INR)
				int USD=60;
		        float CR=83.2f;
		         float INR =USD*CR;
		         System.out.println(INR);
	}

}
