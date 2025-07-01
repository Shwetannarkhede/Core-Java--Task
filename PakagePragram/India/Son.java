package India;

public class Son extends Father {

 public void Son() {
     System.out.println("Son's Access:");
     System.out.println("Family Name : " + familyName);
   
     System.out.println("House : " + house);
     System.out.println("Car : " + car); 
 }
 public static void main(String[] args) {
    
     Son s1=new Son();
     s1.Son();
}
 
}
