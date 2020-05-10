using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Configuration;
using System.Data;

namespace WebApplicationdatareder
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string ConnectionString = ConfigurationManager.ConnectionStrings["DBConnectionString"].ConnectionString;
            using (SqlConnection connection = new SqlConnection(ConnectionString))
            {
                connection.Open();
                SqlCommand command = new SqlCommand("Select * from Product", connection);
                using (SqlDataReader reader = command.ExecuteReader()) //Executereader return object of sqlreader
                {
                    // Create the DataTable and columns. This will 
                    // be used as the datasource for the GridView
                    //Coulmns is calling get and returning System.Data.DataColumn
                    //     objects for the table
                    DataTable sourceTable = new DataTable();
                    sourceTable.Columns.Add("ID");
                    sourceTable.Columns.Add("Name");
                    sourceTable.Columns.Add("Price");
                    sourceTable.Columns.Add("DiscountedPrice");

                    while (reader.Read())
                    {
                        //Calculate the 10% discounted price
                        int OriginalPrice = Convert.ToInt32(reader["Price"]);
                        double DiscountedPrice = OriginalPrice * 0.9;

                        // Populate datatable column values from the SqlDataReader
                        DataRow datarow = sourceTable.NewRow();
                        datarow["ID"] = reader["Id"];//ProductId databaase column name
                        datarow["Name"] = reader["Name"];
                        datarow["Price"] = OriginalPrice;
                        datarow["DiscountedPrice"] = DiscountedPrice;

                        //Add the DataRow to the DataTable
                        sourceTable.Rows.Add(datarow); //System.Data.DataRow objects;
                    }

                    // Set sourceTable as the DataSource for the GridView
                    GridView1.DataSource = sourceTable;
                    GridView1.DataBind();
                }
            }


        }
    }
}