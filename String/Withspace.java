package String;

public class Withspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String name="shweta Narkhede";
		  String result="";
		  for(int i =0;i<name.length();i++) {
			  char c=name.charAt(i);
			  if(c!= ' ') {
				  result=result+c;
				  
			  }
		  }
		  System.out.println("original = "  + result);
		  System.out.println("after remove space= " + result);
	}

}
