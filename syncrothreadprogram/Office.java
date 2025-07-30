package syncrothreadprogram;

public class Office {
public static void main(String[] args) {
		
		Tv remote = new Tv();
		
		Aname n = new Aname(remote);
		Bname d = new Bname(remote);
		Cname r = new Cname(remote);
		
		n.start();
		d.start();
		r.start();
	}

}
