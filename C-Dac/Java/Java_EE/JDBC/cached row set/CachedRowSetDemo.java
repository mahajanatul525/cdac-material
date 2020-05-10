/*
 For "CachedRowSetImpl" you have to set the classpath of "com.sun.rowset.jar"
*/ 

import com.sun.rowset.*;
import java.sql.*;
public class CachedRowSetDemo
{
	public static void main(String args[])
	{
		try(CachedRowSetImpl rs = new CachedRowSetImpl())
		{
	rs.setUsername("root");
	rs.setPassword("root");
	rs.setUrl("jdbc:mysql://localhost:3306/mydb?relaxAutoCommit=true");
	rs.setCommand("select * from dept");
	rs.execute();
System.out.println("Even after connection closed with ARM");
while(rs.next())
{
	int a=rs.getInt(1);
	String b=rs.getString(2);
	String c=rs.getString(3);
	System.out.println(a+"\t"+b+"\t"+c);
}

rs.absolute(3);
rs.updateString(3,"pune");
rs.updateRow();

rs.acceptChanges();
rs.absolute(3);
System.out.println(rs.getString(3));

}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}