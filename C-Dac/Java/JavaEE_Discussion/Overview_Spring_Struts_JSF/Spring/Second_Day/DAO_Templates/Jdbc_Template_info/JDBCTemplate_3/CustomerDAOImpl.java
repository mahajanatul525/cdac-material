package mypack;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class CustomerDAOImpl implements CustomerDAO 
{
	private SimpleJdbcTemplate jdbcTemplate;
	@Override
	public void insertCustomer(Customer customer) 
	{
		String query="insert into customers values(?,?,?)";
		jdbcTemplate.update(query,customer.getCustomerId(),customer.getCustomerName(),customer.getAddress());
	}


public Customer selectCustomer(int customerId)
	{
		String query="select * from customers where customerid=?";
		return (Customer)jdbcTemplate.queryForObject(query,new ParameterizedRowMapper<Customer>()
		{
			@Override
			public Customer mapRow(ResultSet resultSet,int rowNum)throws SQLException
			{
				return new Customer(resultSet.getInt("customerid"),resultSet.getString("customername"),resultSet.getString("address"));
			}
		},customerId);
	}
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate=new SimpleJdbcTemplate(dataSource);
	}

}
