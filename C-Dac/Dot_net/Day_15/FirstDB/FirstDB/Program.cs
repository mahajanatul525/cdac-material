using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Configuration;

namespace FirstDB
{
    class Program
    {
        static void Main(string[] args)
        {
            String str = @"Data Source=ANIMUS\SQLEXPRESS;Initial Catalog=Nikdb;Integrated Security=True;Connect Timeout=15;Encrypt=False;TrustServerCertificate=False";
           
          
            SqlConnection con=new SqlConnection();
            con.ConnectionString = str;

            SqlCommand cmd=new SqlCommand("select * from employee",con);


            con.Open();

            SqlDataReader rd = cmd.ExecuteReader();

            while (rd.Read())
            {
                Console.WriteLine("{0}{1}{2}",rd["Id"],rd["Name"],rd["Salary"]);

            }
        }
    }
}
