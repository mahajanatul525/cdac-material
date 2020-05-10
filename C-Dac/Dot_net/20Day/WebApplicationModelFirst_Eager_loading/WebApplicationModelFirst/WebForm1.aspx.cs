using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplicationModelFirst
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            Model1Container m = new Model1Container();
            var r=from x in m.MyEmployeeDatas.Include("MyDept") where x.MyDept.Name == "Admin" select x.ToList<MyEmployeeData>();
            GridView1.DataSource = r;
            GridView1.DataBind();
        }
    }
}