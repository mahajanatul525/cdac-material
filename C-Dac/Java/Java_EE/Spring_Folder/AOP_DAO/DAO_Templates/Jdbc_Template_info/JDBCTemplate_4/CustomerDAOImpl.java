package mypack;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class CustomerDAOImpl implements CustomerDAO 
{
	private SimpleJdbcInsert jdbcInsert;
	@Override
	public void insertCustomer(Customer customer) 
	{
		Map<String,Object>parameters=new HashMap<String,Object>(3);
		parameters.put("customerid",customer.getCustomerId());
		parameters.put("customername",customer.getCustomerName());
		parameters.put("address",customer.getAddress());
		jdbcInsert.execute(parameters);
	}
	public void setDataSource(DataSource dataSource) {
		jdbcInsert=new SimpleJdbcInsert(dataSource);
		jdbcInsert.withTableName("customers");
	}

}







