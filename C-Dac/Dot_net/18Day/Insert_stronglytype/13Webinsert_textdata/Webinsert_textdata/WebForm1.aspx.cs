using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Webinsert_textdata
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string ConnectionString = ConfigurationManager.ConnectionStrings["DatabaseConnectionString"].ConnectionString;
            using (SqlConnection connection = new SqlConnection(ConnectionString))
            {
                try
                {
                    //Create an instance of SqlCommand class, specifying the T-SQL command 
                    //that we want to execute, and the connection object.
                    SqlCommand cmd = new SqlCommand("insert into Product values (' " + Textbox1.Text + " ', ' " + Textbox2.Text + " ',' " + Textbox3.Text + " ',' " + Textbox4.Text + " ')", connection);
                    connection.Open();
                    //Since we are performing an insert operation, use ExecuteNonQuery() 
                    //method of the command object. ExecuteNonQuery() method returns an 
                    //integer, which specifies the number of rows inserted
                    int rowsAffected = cmd.ExecuteNonQuery();
                    Response.Write("Inserted Rows = " + rowsAffected.ToString() + "<br/>");

                }
                catch (Exception exp)
                {
                    Response.Write(exp.Message);
                }
            }
        }
    }
}
