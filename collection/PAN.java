package collection;
import java.util.HashMap;
public class PAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Company > m =new HashMap<String,Company >();
		
      Company c1=new Company("TCS","Akurdi");
      Company c2=new Company("infosys","Hinjewadi");
      Company c3=new Company("Cognizant","Akurdi");
      Company c4=new Company("Websums","Sambhajinagar");
      Company c5=new Company("mahindra","VimalNagar");
      
      m.put("A101", c1);
      m.put("A102", c2);
      m.put("A103", c3);
      m.put("A104", c4);
      m.put("A105", c5);
      
      for(int i=0;i<=m.size();i++) {
      
      System.out.println(m.get(i));
      }
      
	}

}
