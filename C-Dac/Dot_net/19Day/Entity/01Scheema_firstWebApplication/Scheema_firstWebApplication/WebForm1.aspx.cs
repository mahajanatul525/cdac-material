using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.Entity;
namespace Scheema_firstWebApplication
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            mydataContext c = new mydataContext();
            var r = from rang in c.Employees select rang ;
            GridView1.DataSource = r;
            GridView1.DataBind();

        }
    }
}