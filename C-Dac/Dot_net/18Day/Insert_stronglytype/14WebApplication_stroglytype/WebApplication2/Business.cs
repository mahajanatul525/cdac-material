using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

namespace WebApplication2
{  public class Business
    {   public SqlConnection getconnection()
        { SqlConnection sqlconn = new SqlConnection();
           string connstring = ConfigurationManager.ConnectionStrings["demo"].ConnectionString;
           sqlconn.ConnectionString = connstring;
           Console.WriteLine(sqlconn);
           return sqlconn;
        }
      public int store(Employee e)
    {
        SqlConnection sqlconn;
           SqlCommand sqlcmd;
            int record = 0;
           try
            {  sqlconn = getconnection();
                sqlconn.Open();
                sqlcmd = new SqlCommand("store", sqlconn);
                sqlcmd.CommandType = CommandType.StoredProcedure;
 sqlcmd.Parameters.AddWithValue("@e_id", SqlDbType.Int).Value = e.Id;
 sqlcmd.Parameters.AddWithValue("@e_nm", SqlDbType.NVarChar).Value = e.Name;
 sqlcmd.Parameters.AddWithValue("@e_sal ", SqlDbType.Decimal).Value = e.Salary;
                record = sqlcmd.ExecuteNonQuery();
           }
            catch (SqlException se)  {  }
            finally
            {   sqlconn.Close();   sqlconn = null;   }
             return record;

        }


    }

}
