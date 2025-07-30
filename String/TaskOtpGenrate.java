package String;

import java.util.Scanner;

public class TaskOtpGenrate {

	public static void main(String[] args) {
		// Generate an Otp of length 6.otp must have following character in any order
		// 2 alphabets,from a-z and A-Z
		//2 digits ,from 0-9
		// 2 special symbols
		 
		String charater= "Aa";
		String digits= "93";
		String special= "#@";
		
		StringBuilder otp= new StringBuilder();
		otp.append(charater).append(digits).append(special);
		System.out.println(otp);
		
	}

}
