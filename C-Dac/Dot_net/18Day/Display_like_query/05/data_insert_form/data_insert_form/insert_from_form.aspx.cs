using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Configuration ;
using System.Data;
using System.Data.SqlClient;
namespace data_insert_form
{
    public partial class insert_from_form : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void GetProductsButton_Click(object sender, EventArgs e)
        { string ConnectionString = ConfigurationManager.ConnectionStrings["DatabaseConnectionString"].ConnectionString;
            using (SqlConnection connection = new SqlConnection(ConnectionString))
              {
                  try
                  {
                      //Build the query dynamically, by concatenating the text, that the user has 
                      //typed into the ProductNameTextBox. This is a bad way of constructing
                      //queries. This line of code will open doors for sql injection attack
                      SqlCommand cmd = new SqlCommand("Select * from Product where Name like '" + ProductNameTextBox.Text + "%'", connection);
                      connection.Open();
                      ProductsGridView.DataSource = cmd.ExecuteReader();
                      ProductsGridView.DataBind();
                  }
                  catch(Exception ex)
                  {
                      Response.Write(ex.Message);
                  }
              }

          /*  string ConnectionString = ConfigurationManager.ConnectionStrings["DatabaseConnectionString"].ConnectionString;
            using (SqlConnection connection = new SqlConnection(ConnectionString))
            {
                try
                {
                    // Parameterized query. @ProductName is the parameter
                    string Command = "Select * from Product where Name like @ProductName";
                    SqlCommand cmd = new SqlCommand(Command, connection);
                    // Provide the value for the parameter
                    cmd.Parameters.AddWithValue("@ProductName", ProductNameTextBox.Text + "%");
                    connection.Open();
                    ProductsGridView.DataSource = cmd.ExecuteReader();
                    ProductsGridView.DataBind();
                }
                catch (Exception ex)
                {
                    Response.Write(ex.Message);
                }
            }

            /*   using (SqlConnection con = new SqlConnection(ConnectionString))
               {
                   // The command, that we want to execute is a stored procedure,
                   // so specify the name of the procedure as cmdText
                   SqlCommand cmd = new SqlCommand("spGetProductsByName", con);
               
        // Specify that the T-SQL command is a stored procedure
                   cmd.CommandType = System.Data.CommandType.StoredProcedure;
                

       // Associate the parameter and it's value with the command object
                   cmd.Parameters.AddWithValue("@ProductName", ProductNameTextBox.Text + "%");
                   con.Open();
                   ProductsGridView.DataSource = cmd.ExecuteReader();
                   ProductsGridView.DataBind();
               }
           }*/



        }
    }
}