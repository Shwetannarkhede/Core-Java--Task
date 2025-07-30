package ArrayProgram;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "shweta";
		
		String[] s= {"shweta","komal","yash","neha","om"};

		for (int i = 0; i < s.length; i++) {
			String name=s[i];
			int count = 0;
		
		for (int j = 0; j < name.length(); j++) {
			char c = name.charAt(j);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;

			}
		}
		if (count >= 2) {
			System.out.println(name);
		} else {
			System.out.println(" ");
		}

	}
	}
}
