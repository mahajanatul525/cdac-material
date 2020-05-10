package mypack;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;


public class App {
	public static void main(String[] args) {

        System.out.println("Hibernate many to many (Annotation)");
	Session session = HibernateUtil.getSessionFactory().openSession();

	session.beginTransaction();

	Stock stock = new Stock();
        stock.setStockCode("7052");
        stock.setStockName("XYZ");

        Category category1 = new Category("CONSUMER", "CONSUMER COMPANY");
        Category category2 = new Category("INVESTMENT", "INVESTMENT COMPANY");

        Set<Category> categories = new HashSet<Category>();
        categories.add(category1);
        categories.add(category2);

        stock.setCategories(categories);

        session.save(stock);

        Category category3 = new Category("cccccc", "cc111111");
        Set<Stock> stocks = new HashSet<Stock>();
        Stock s1 = new Stock();
        s1.setStockCode("s1code");
        s1.setStockName("s1name");
        Stock s2 = new Stock();
        s2.setStockCode("s2code");
        s2.setStockName("s2name");
        
        stocks.add(s1);
        stocks.add(s2);    
        category3.setStocks(stocks);
        session.save(category3);

	session.getTransaction().commit();
	System.out.println("Done");
	}
}

