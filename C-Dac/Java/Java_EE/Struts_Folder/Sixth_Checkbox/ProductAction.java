package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductAction implements SessionAware
{
	Map session;
	boolean flag;
	private List prodList;
	
	@Autowired
	private ProductDAO productdao;
	public List getProdList() 
	{
		prodList=productdao.get();
		//System.out.println("list is\t"+prodList);

		return prodList;
	}
	/**
	 * @param prodList the prodList to set
	 */
	public void setProdList(List prodList) {
		this.prodList = prodList;
		System.out.println(prodList);
		session.put("mycart",prodList);
		flag=true;
	}
	/**
	 * @return the prodList
	 */
	public String execute()
	{
		if(flag)
		{
			return "cart";
		}
		else
		{
		return "success";
		}
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session=arg0;
	}
}







