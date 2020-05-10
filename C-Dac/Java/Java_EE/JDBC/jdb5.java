import java.sql.*;
public class jdb5 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
PreparedStatement pst=con.prepareStatement("update dept set loc=?");
pst.setString(1,"delhi");
int mod=pst.executeUpdate();

if(mod>0)
{
	System.out.println("Records are successfully added");
}
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}						