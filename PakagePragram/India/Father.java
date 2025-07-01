package India;

public class Father {
	public String familyName = "Narkhede";
    private int bankBalance = 500000;
    protected String house = "3BHK Apartment";
    int car = 1; 

    public void Father() {
        System.out.println("Father's Family Name: " + familyName);
        System.out.println("Bank Balance : " + bankBalance);
        System.out.println("House : " + house);
        System.out.println("Car : " + car);
    }
    public static void main(String[] args) {
        Father f1 = new Father();
        f1.Father();

   }

}


 