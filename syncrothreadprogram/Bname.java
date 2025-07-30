package syncrothreadprogram;

public class Bname extends Thread {
	
	Tv remote;
	
	public Bname(Tv remote) {
		this.remote = remote;
	}
	
	@Override
	public void run() {
		remote.play("Zee News");
	}

}
