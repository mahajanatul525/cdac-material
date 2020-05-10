using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication2
{
    public partial class WebForm_delete : System.Web.UI.Page
    {
   
      
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                SqlConnection sqlconn = new SqlConnection();
                string connstring = ConfigurationManager.ConnectionStrings["demo"].ConnectionString;
                sqlconn.ConnectionString = connstring;


                SqlCommand cmd = new SqlCommand("select Id from tblemp",sqlconn);
                sqlconn.Open();
             DropDownList1.DataSource =  cmd.ExecuteReader ();
             DropDownList1.DataValueField = "Id";
             DropDownList1.DataTextField = "id";
                DropDownList1 .DataBind ();
            }


        }

        protected void Button1_Click(object sender, EventArgs e)
        {       Business b = new Business();
            int id = Convert.ToInt32 (DropDownList1.SelectedValue);
            bool r = b.DeleteEmployee(id);
            b.up += ()=>Response.Write ("Record deleted event message");
            b.onchange();
            if (r == true)
            {
                
                Response.Write("record deletaed");
            }
            else
                Response.Write("err deleteing record");

        }

        protected void Search_Click(object sender, EventArgs e)
        {

            if (RadioButton1.Checked)
            {
                Business b = new Business();
                int id=int.Parse ((TextBox1.Text).Trim() );
               DataSet rd=b.search (id);
                GridView1.DataSource=rd;
                GridView1.DataBind();
            }
            else
            {
                Business b = new Business();
              string Name=  TextBox1.Text;
            DataSet rd = b.search(Name);
               GridView1.DataSource = rd;
              GridView1.DataBind();
            }

        }
    }
}