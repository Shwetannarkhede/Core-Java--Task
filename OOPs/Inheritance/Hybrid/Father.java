package Hybrid;

public class Father extends Grandpa {
	public String Shop;
	public String voice;
	
	public void display() {
		System.out.println(Shop);
		System.out.println(voice);
		
		}
	public Father() {
		super.farm="vegetable";
		//System.out.println("father");
		super.show();
	}
	

}
