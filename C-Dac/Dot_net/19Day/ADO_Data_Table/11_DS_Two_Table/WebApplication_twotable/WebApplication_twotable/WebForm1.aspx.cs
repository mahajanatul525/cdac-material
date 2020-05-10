using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication_twotable
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string ConnectionString = ConfigurationManager.ConnectionStrings["DBConnectionString"].ConnectionString;
            using (SqlConnection connection = new SqlConnection(ConnectionString))
            {
                SqlDataAdapter dataAdapter = new SqlDataAdapter("spGetProductAndCategoriesData", connection);
                dataAdapter.SelectCommand.CommandType = CommandType.StoredProcedure;
                DataSet dataset = new DataSet();
                dataAdapter.Fill(dataset);

                dataset.Tables[0].TableName = "Products";
                dataset.Tables[1].TableName = "Categories";

                //   Gridview1.DataSource = dataset.Tables[0];
                //   Gridview1.DataBind();
                Gridview1.DataSource = dataset.Tables["Products"];
                Gridview1.DataBind();

              //  Gridview2.DataSource = dataset.Tables[1];
               // Gridview2.DataBind();
                Gridview1.DataSource = dataset.Tables["Categories"];
                Gridview1.DataBind();
            } 

        }
    }
}