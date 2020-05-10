using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _05ispostback
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {         // ddlCity.Items.Clear();  //or make Viewsate of false
           //if(!IsPostBack )
            LoadCityDropDownList();
        }
        public void LoadCityDropDownList()
        {      Response.Write("hello");
        ListItem li0 = new ListItem("Select");
        ddlCity.Items.Add(li0);
            ListItem li1 = new ListItem("London");
            ddlCity.Items.Add(li1);
            ListItem li2 = new ListItem("Sydney");
            ddlCity.Items.Add(li2);

            ListItem li3 = new ListItem("Mumbai");
            ddlCity.Items.Add(li3);
        }

        protected void Button1_Click(object sender, EventArgs e)
        {

        }

        protected void ddlCity_SelectedIndexChanged(object sender, EventArgs e)
        {
            Response.Write("you selected");
                int a=ddlCity.SelectedIndex;
                string s = ddlCity.SelectedValue;
                Response .Write (a.ToString ());
                Response.Write(s );
        }
    }
}