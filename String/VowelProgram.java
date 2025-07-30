package String;

public class VowelProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence= "shweta Nilkanth narkhede";
		 int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
		 
	   char c = sentence.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;

			}
		}
		if(count>=3) {
			System.out.println(sentence);
		}
             		
		
		 

	}

}
