package ncs.test05;

public class Book {
	String title;
	String author;
	int price;
	String publisher;
	double discountRate;
	
	public Book(String title, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public String toString() {
		return String.format("%s, %s, %s, %d원 10%%할인", 
				getTitle(), getAuthor(), getPublisher(), getPrice());
	}
}//c
