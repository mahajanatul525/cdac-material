using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace Test3.Models
{
    public class TourBusiness
    {
        public SqlConnection getConnection()
        {
            string str = ConfigurationManager.ConnectionStrings["mytour"].ConnectionString;
            SqlConnection conn = new SqlConnection(str);
            return conn;
        }

        public int insertData(Registration reg)
        {
            int record = 0;
            SqlConnection conn = null;
            using (conn = getConnection())
            {
                string query = "insert into Registration(EmailID, Password, Name, Contact, Address) values (@email, @password, @name, @contact, @address)";
                SqlCommand cmd = new SqlCommand(query, conn);

                cmd.Parameters.AddWithValue("@email", reg.EmailID);
                cmd.Parameters.AddWithValue("@password", reg.Password);
                cmd.Parameters.AddWithValue("@name", reg.Name);
                cmd.Parameters.AddWithValue("@contact", reg.Contact);
                cmd.Parameters.AddWithValue("@address", reg.Address);
                conn.Open();
                record = cmd.ExecuteNonQuery();
            }
            return record;
        }
        public string Check(Registration reg)
        {
            string email, pass;
            email = reg.EmailID;
            pass = reg.Password;
            SqlConnection conn = null;
            using (conn = getConnection())
            {
                string password = "select Password,EmailID from Registration where @email=EmailId ";
                SqlCommand cmd = new SqlCommand(password, conn);
                cmd.Parameters.AddWithValue("@email", reg.EmailID);

                conn.Open();
                SqlDataReader rdr = cmd.ExecuteReader();
                
                while (rdr.Read())
                {
                    if (reg.EmailID == (rdr["EmailID"]).ToString())
                    {
                        if (reg.Password == (rdr["Password"]).ToString())
                            break;
                    }
                }
            }
            return reg.EmailID;

        }
    }
}