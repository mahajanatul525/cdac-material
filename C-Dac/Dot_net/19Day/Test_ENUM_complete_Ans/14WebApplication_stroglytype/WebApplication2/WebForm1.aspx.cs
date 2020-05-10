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
            if(!IsPostBack)
            { DropDownList1.Items.Add("--Select DEPT--");
               //get enum items to get the respective enum value 
              string[] enumNames=Enum.GetNames(typeof(DEPT ));
                          foreach (string item in enumNames)
                         {                         //get the enum item value
                           
                    int value = (int)Enum.Parse(typeof(DEPT), item);
                    ListItem listItem = new ListItem(item, value.ToString());
                         DropDownList1.Items.Add(listItem);
                                    }
         
            }
        }
        protected void Button1_Click(object sender, EventArgs e)
        {     //Employee emp = new Employee(1,"raj",5000,DEPT.ADV);
        Employee emp = new Employee();
            emp.Id = Convert.ToInt32(TextBox1.Text);
            emp.Name = TextBox2.Text;
            emp.Salary = Convert.ToDecimal(TextBox3.Text);
 emp.d =(DEPT)Enum.Parse(typeof(DEPT),DropDownList1.SelectedValue);

      //    DEPT DD=  (DEPT)Enum.Parse(typeof(DEPT), DropDownList1.SelectedIndex.ToString());

                Business b = new Business();
            //    Employee Y = new Employee(22,"Raj",500,DD );
           int x= b.store(emp);
           b.up += () => Response.Write("Record Inserted");
           b.onchange();
           Response.Write("record entered"+ x);
        }
    }
}