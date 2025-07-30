package threadprogram;

public class Task2 extends Thread {
  String s="shweta";
	public void run() {
		try {
			for(int i=0;i<s.length();i++) {
				System.out.println(s.charAt(i));
				
				Thread.sleep(1000);
				
			}
		}catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Task2 t=new Task2();
        t.start();
        
	}
	

}
