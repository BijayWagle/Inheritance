
public class Book {
public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
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
protected long isbn;
protected String title;
protected String author;
public Book(long isbn, String title) {
	//super();
	this.isbn = isbn;
	this.title = title;
}
public Book(long isbn, String title, String author) {
	//super();
	this.isbn = isbn;
	this.title = title;
	this.author = author;
}
public String generateID() {
	return this.title+"-"+this.isbn;
}
}
