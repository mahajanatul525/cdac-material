using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;
using System.Configuration;

namespace data_adapter
{
    public partial class data_adapter_ex : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            // Create an instance of SqlDataAdapter. Spcify the command and the connection
            string ConnectionString = ConfigurationManager.ConnectionStrings["DatabaseConnectionString"].ConnectionString;
            using (SqlConnection connection = new SqlConnection(ConnectionString))
            {
                SqlDataAdapter dataAdapter = new SqlDataAdapter("select * from Product", connection);
                // Create an instance of DataSet, which is an in-memory datastore for storing tables

                DataSet dataset = new DataSet();
                // Call the Fill() methods, which automatically opens the connection, executes the command 
                // and fills the dataset with data, and finally closes the connection.
                //no open method
                dataAdapter.Fill(dataset);

           string s= dataset.GetXml();
                ProductsGridView.DataSource = dataset;
                ProductsGridView.DataBind();
                Response.Write(s);

            }
        }
    }
}