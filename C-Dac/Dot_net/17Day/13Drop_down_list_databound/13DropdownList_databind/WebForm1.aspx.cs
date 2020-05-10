using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;
using System.Configuration;
namespace _13DropdownList_databind
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {      String cs = ConfigurationManager.ConnectionStrings["DBCS"].ConnectionString;
                using (SqlConnection con = new SqlConnection(cs))
                {    SqlCommand cmd = new SqlCommand("select Id , Name from Product", con);
                    con.Open();
                    DropDownList1.DataSource = cmd.ExecuteReader();
                    /// DropDownList1.DataBind();
  //System.Data.Common
                    DropDownList1.DataTextField = "Name";
                    DropDownList1.DataValueField = "Id";
                 //DropDownList1.DataBind();
                 DropDownList1.Items.Insert(0, new ListItem("select", "-1"));
                  
                }
            }
        }
    }
}