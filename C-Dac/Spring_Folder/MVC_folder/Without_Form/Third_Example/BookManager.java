package mypack;

import java.util.LinkedList;
import java.util.List;

public class BookManager 
{
	private static List<Book> bookList;
	static
	{
		Publisher publisher1=new Publisher();
		publisher1.setPublisherId((long)1);
		publisher1.setPublisherName("SPD");
		
		Book bookSet1=new Book();
		bookSet1.setBookId((long)1);
		bookSet1.setPublisher(publisher1);
		bookSet1.setBookName("Let us C");
		bookSet1.setPrice(250);
		
		Book bookSet2=new Book();
		bookSet2.setBookId((long)2);
		bookSet2.setPublisher(publisher1);
		bookSet2.setBookName("Understanding Pointers in C");
		bookSet2.setPrice(350);
		
		Book bookSet3=new Book();
		bookSet3.setBookId((long)3);
		bookSet3.setPublisher(publisher1);
		bookSet3.setBookName("C Complete Reference");
		bookSet3.setPrice(300);
		
		bookList=new LinkedList<Book>();
		bookList.add(bookSet1);
		bookList.add(bookSet2);
		bookList.add(bookSet3);
	}
	public static List<Book> getBookList() {
		return bookList;
	}
}








