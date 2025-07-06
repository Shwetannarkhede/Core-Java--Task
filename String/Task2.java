package String;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//WAP to accept a sentence from the user and count the number of words present in it.
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enetr the srntence : ");
		 String sentence = sc.nextLine();
		 String[] words = sentence.split(" ");
		 System.out.println(words.length);
	}

}
