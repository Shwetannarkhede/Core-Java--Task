package polymorphism;

public class Password {

//	1. login with username and password
//	2. login with Google account
//	3. login with phone number with OTP
//	4. login with biometric
	
	public void login(String username,String password){
		
		System.out.println("1. login with Username and Password");

		System.out.println(" Username = "+ username);
		System.out.println(" password = "+ password);
	}
	

	public void login(String username,String password,String Google_account){
		
		System.out.println("2. login with google account");

		System.out.println("google account = "+Google_account);
	}
	

	public void login(String username,String password,String Google_account,int phone_number,int otp){
		
		System.out.println("3. login with phone number with otp");
		System.out.println(" phone number = "+ phone_number);
		
	}

	public void login( String username,String password,String Google_account,int phone_number,int otp, String Biometric){
		
		System.out.println("4. login with biometric");
		System.out.println(" biometric = "+Biometric);
		
	}
	
	
	public static void main(String[] args) {
		Password p=new Password();
		
		p.login("shweta", "123");
		p.login("shweta", "123", "google");
		p.login("shweta", "123", "google", 942039450, 2744);
		p.login("shweta", "123", "google", 942039450, 2744, "finger");
	}

}
