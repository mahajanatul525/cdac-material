package mypack;
public class Book 
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+bookName+"   "+price+"   "+publisher+"]";
	}
	private String publisher;
	private String bookName;
	private long price;
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
}
