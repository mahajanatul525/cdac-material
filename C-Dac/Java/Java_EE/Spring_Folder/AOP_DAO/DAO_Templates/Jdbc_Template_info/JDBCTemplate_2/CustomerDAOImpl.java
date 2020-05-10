package mypack;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class CustomerDAOImpl implements CustomerDAO 
{
	private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public void insertCustomer(Customer customer) 
	{
		String query="insert into customers values(:first,:second,:third)";
		Map namedParameters=new HashMap();
		namedParameters.put("first",customer.getCustomerId());
		namedParameters.put("second",customer.getCustomerName());
		namedParameters.put("third",customer.getAddress());
		jdbcTemplate.update(query,namedParameters);

	}

public Customer selectCustomer(int customerId)
	{
		String query="select * from customers where customerid=:xyz";
		Map namedParameters=new HashMap();
		namedParameters.put("xyz",customerId);
		return (Customer)jdbcTemplate.queryForObject(query,namedParameters,new RowMapper()
		{
			@Override
			public Object mapRow(ResultSet resultSet,int rowNum)throws SQLException
			{
				return new Customer(resultSet.getInt("customerid"),resultSet.getString("customername"),resultSet.getString("address"));
			}
		});
	}
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
	}

}
