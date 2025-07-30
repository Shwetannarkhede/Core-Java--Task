package syncrothreadprogram;

public class Aname extends Thread {

	Tv remote;
	
	public Aname(Tv remote) {
		this.remote = remote;
	}
	
	@Override
	public void run() {
		remote.play("Star Gold");
	}

}
