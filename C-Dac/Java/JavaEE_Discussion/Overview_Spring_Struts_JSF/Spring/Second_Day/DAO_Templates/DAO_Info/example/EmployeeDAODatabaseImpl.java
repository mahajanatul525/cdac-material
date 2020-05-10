package mypack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value="employeedaodatabaseimpl")
public class EmployeeDAODatabaseImpl implements EmployeeDAO 
{
	@Autowired
    private DataSource datasource;
    private Connection con;
    private PreparedStatement pst;
	@Override
	public void insertEmployee(Employee ref) 
	{
		try
		{ 
		   con=datasource.getConnection();
		  pst=con.prepareStatement("insert into employee values(?,?,?)");
		  pst.setInt(1,ref.getId());
		  pst.setString(2,ref.getName());
		  pst.setString(3,ref.getDesig());
		  pst.execute();
		}
		catch(SQLException e)
		{
		 System.out.println(e);
		}
		finally
		{
		 try
		 {
		   if(pst!=null)
		  {
		     pst.close();
		  }
		if(con!=null)
		{
		    con.close();
		}
		}
		catch(SQLException s)
		{
		 System.out.println(s);
		}
		}
	}

	@Override
	public Employee getEmployee() 
	{
		Employee ref=new Employee();
		try
		{ 
		  con=datasource.getConnection();
		  pst=con.prepareStatement("select * from employee");
		  ResultSet rs=pst.executeQuery();
		  while(rs.next())
		  {
			 ref.setId(rs.getInt(1));
			 ref.setName(rs.getString(2));
			 ref.setDesig(rs.getString(3));
			 break;
		  }
		}
		catch(SQLException e)
		{
		 System.out.println(e);
		}
		finally
		{
		 try
		 {
		   if(pst!=null)
		  {
		     pst.close();
		  }
		if(con!=null)
		{
		    con.close();
		}
		}
		catch(SQLException s)
		{
		 System.out.println(s);
		}
		}
		return ref;
	}

}
