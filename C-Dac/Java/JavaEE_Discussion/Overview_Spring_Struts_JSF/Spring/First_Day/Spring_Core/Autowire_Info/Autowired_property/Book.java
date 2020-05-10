package mypack;

import org.springframework.beans.factory.annotation.Autowired;

public class Book
{
    @Autowired
    private Author author;
    private String isbn;
    private String year;
   	public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return author+"\t"+isbn+"\t"+year;
    }
}
