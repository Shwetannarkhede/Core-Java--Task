package syncrothreadprogram;

public class Tv {
	public void play(String channelName) {
	
	try {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Playing " + channelName);
			Thread.sleep(1000);
		}
		
	} catch (Exception e) {
	}
}

}
