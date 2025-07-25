package Encapsulation;
//bookId, title, author, publisher, price, and publicationYear
public class Book {
	private int bookId;
	private String title;
	private String  author;
	private String publisher;
	private int price;
	private int publicationYear;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public Book(int bookId,  String title,  String author,String publisher,int  price, int publicationYear)
	{
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
		this.publicationYear=publicationYear;
	}
	
	public Book() {
		
	}
}
