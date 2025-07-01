package Encapsulation;

public class Library {
	//bookId, title, author, publisher, price, and publicationYear

	public static void main(String[] args) {
		Book b1 =new Book();
		Book b2=new Book(1,"core java","mr.kiran sir","kiran sir",700,2022);
		
		b1.setBookId(101);
		b1.setTitle("core java");
		b1.setAuthor("mr.kiran sir");
		b1.setPublisher("mr.kiran sir");
		b1.setPrice(700);
		b1.setPublicationYear(2022);
		
		System.out.println(b1.getBookId());
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPublisher());
		System.out.println(b1.getPrice());
		System.out.println(b1.getPublicationYear());
		
		System.out.println("--------------");
		
		System.out.println(b2.getBookId());
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getPublisher());
		System.out.println(b2.getPrice());
		System.out.println(b2.getPublicationYear());


	}

}
