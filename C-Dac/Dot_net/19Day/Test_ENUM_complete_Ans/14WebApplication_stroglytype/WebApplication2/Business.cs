using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;
using System.Web.UI;
namespace WebApplication2
{  public delegate void chkupdate();
    public class Business
    { public event chkupdate up;
        public void onchange()
        {  if (up != null)
              up();
        }

        public SqlConnection getconnection()
        {     SqlConnection sqlconn = new SqlConnection();
            string connstring = ConfigurationManager.ConnectionStrings["demo"].ConnectionString;
            sqlconn.ConnectionString = connstring;
            Console.WriteLine(sqlconn);
            return sqlconn;
        }


        public int store(Employee e)
        {
            SqlConnection sqlconn = null;
            SqlCommand sqlcmd;
            int record = 0;
            //try
           // { 
             sqlconn = getconnection();
                sqlconn.Open();
                sqlcmd = new SqlCommand("stored", sqlconn);
                sqlcmd.CommandType = CommandType..StoredProcedure;
                int x = (int)(e.d);
                sqlcmd.Parameters.AddWithValue("@e_id", SqlDbType.Int).Value = e.Id;
                sqlcmd.Parameters.AddWithValue("@e_nm", SqlDbType.NVarChar).Value = e.Name;
                sqlcmd.Parameters.AddWithValue("@e_sal ", SqlDbType.Decimal).Value = e.Salary;
                sqlcmd.Parameters.AddWithValue("@e_dept ", SqlDbType.Int).Value = x ;
                record = sqlcmd.ExecuteNonQuery();

           // }

         //   catch (SqlException se)
          //  {
           //     return se.Number;
         //   }
         //   finally
         //   {
                sqlconn.Close();
                sqlconn = null;
          //  }

            return record;

        }
        public bool DeleteEmployee(int EmployeeId)
        {
            string CS = ConfigurationManager.ConnectionStrings["demo"].ConnectionString;
            using (SqlConnection con = new SqlConnection(CS))
            {
                SqlCommand cmd = new SqlCommand("Delete from tblemp where Id = @EmployeeId", con);
                 cmd.Parameters.AddWithValue("@EmployeeId", EmployeeId);
                con.Open();
                int r = cmd.ExecuteNonQuery();

                if (r > 0)
                    return true;
                else
                    return false;

            }
        }

        public DataSet  search(int id)
        {   string CS = ConfigurationManager.ConnectionStrings["demo"].ConnectionString;
            using (SqlConnection con = new SqlConnection(CS))
            {       string s="select * from tblemp where Id = @EmployeeId";
                  SqlDataAdapter cmd = new SqlDataAdapter(s, con);
                  cmd.SelectCommand.Parameters.AddWithValue("@EmployeeId", id);
              DataSet ds = new DataSet();
              cmd.Fill(ds);
               
                return ds;
            }

        }
        public DataSet  search(string name)
        {
            string ConnectionString = ConfigurationManager.ConnectionStrings["demo"].ConnectionString;
            using (SqlConnection connection = new SqlConnection(ConnectionString))
            {

                // Parameterized query. @ProductName is the parameter
                string Command = "Select * from tblEmp where Name like @ProductName";
                SqlDataAdapter cmd = new SqlDataAdapter(Command, connection);
                // Provide the value for the parameter
                DataSet ds = new DataSet();
          
                cmd.SelectCommand.Parameters.AddWithValue("@ProductName", name + "%");

                cmd.Fill(ds);

                return ds;


            }
        }

    }
}
