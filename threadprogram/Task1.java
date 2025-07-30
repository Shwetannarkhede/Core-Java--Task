package threadprogram;

public class Task1 extends Thread {

	
 public void run() {
	  try {
		  for(int i=1;i<=10;i++) {
			  System.out.println(i);
			  Thread.sleep(1000);
		  }
	  }catch(Exception e) {
		  
	  }
 }
	

}
