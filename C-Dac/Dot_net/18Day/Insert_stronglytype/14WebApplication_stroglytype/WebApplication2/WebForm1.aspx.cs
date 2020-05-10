using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication2
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Employee emp = new Employee();
            emp.Id = Convert.ToInt32(TextBox1.Text);
            emp.Name = TextBox2.Text;
            emp.Salary = Convert.ToDecimal(TextBox3.Text);
            Business b = new Business();
           int x= b.store(emp);
           Response.Write("record entered"+ x);
        }
    }
}