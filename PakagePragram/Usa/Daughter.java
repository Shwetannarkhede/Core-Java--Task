package Usa;

import India.Father;

public class Daughter extends Father {

   

	public void Daughter() {
        System.out.println("Daughter's Access:");
        System.out.println("Family Name : " + familyName);  
        System.out.println("House : " + house);          
    }
    
    public static void main(String[] args) {
       Daughter  d1 = new Daughter();
       d1.Daughter();
         }

}

