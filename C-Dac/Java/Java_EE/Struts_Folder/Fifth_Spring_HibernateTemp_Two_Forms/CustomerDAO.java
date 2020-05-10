package mypack;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CustomerDAO 
{
	void addCustomer(Customer customer);
}
