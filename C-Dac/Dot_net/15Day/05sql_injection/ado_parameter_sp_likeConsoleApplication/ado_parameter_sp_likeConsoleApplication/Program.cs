using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

namespace ado_parameter_sp_likeConsoleApplication
{
    class productdetail
    {
        public void displayproduct(string pname)
        {

           /*  string ConnectionString = ConfigurationManager.ConnectionStrings["DatabaseConnectionString"].ConnectionString;
               using (SqlConnection connection = new SqlConnection(ConnectionString))
                 {
                     try
                     {
                         //Build the query dynamically, by concatenating the text, that the user has 
                         //typed into the ProductNameTextBox. This is a bad way of constructing
                         //queries. This line of code will open doors for sql injection attack
                         SqlCommand cmd = new SqlCommand("Select * from Product where Name like '" + pname + "%'", connection);
                         connection.Open();
                     SqlDataReader rd=   cmd.ExecuteReader();
                     while (rd.Read())
                     {
                     Console.WriteLine("{0} {1} {2} {3}", rd["Id"], rd["Name"], rd["Price"],rd["Qty"]);
                     }
                }
                     
                     catch(Exception ex)
                     {
                      Console.Write(ex.Message);
                     }
                 }*/
            
               string ConnectionString = ConfigurationManager.ConnectionStrings["DatabaseConnectionString"].ConnectionString;
               using (SqlConnection connection = new SqlConnection(ConnectionString))
               {       try
                   {     // Parameterized query. @ProductName is the parameter
                       string Command = "Select * from Product where Name like @ProductName";
                       SqlCommand cmd = new SqlCommand(Command, connection);
                       // Provide the value for the parameter
                       cmd.Parameters.AddWithValue("@ProductName", pname + "%");
                       connection.Open();
                    SqlDataReader rd=   cmd.ExecuteReader();
                        while (rd.Read())
                        {
                        Console.WriteLine("{0} {1} {2} {3}", rd["Id"], rd["Name"], rd["Price"],rd["Qty"]);
                        }
                   }
                   catch (Exception ex)
                   {
                       Console.WriteLine(ex.Message );
                   }
               }
                   }  
    
    
    }
    class Program
    {
        static void Main(string[] args)
        {
            productdetail pd = new productdetail();
            string s="L'; Delete from Product;Select * from Product where Name like 'L";
            pd.displayproduct(s);
            Console.ReadLine();
        }
    }
}
