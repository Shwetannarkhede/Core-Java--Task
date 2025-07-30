package syncrothreadprogram;

public class Cname extends Thread {

	Tv remote;
	
	public Cname(Tv remote) {
		this.remote = remote;
	}
	
	@Override
	public void run() {
		remote.play("MTV");
	}

}
