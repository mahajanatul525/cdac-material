using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Text;

namespace _09check_box
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

            if (!IsPostBack)
            {
                PostGraduateCheckBox.Focus();
            }
        }

        protected void GraduateCheckBox_CheckedChanged(object sender, EventArgs e)
        { //make autopostback =true
            Response.Write("Graduate Checkbox Selection changed");
        }

        protected void Button1_Click(object sender, EventArgs e)
        {

            StringBuilder sbUserChoices = new StringBuilder();
            if (GraduateCheckBox.Checked)
            {
                sbUserChoices.Append(GraduateCheckBox.Text);
            }
            if (PostGraduateCheckBox.Checked)
            {
                sbUserChoices.Append(", " + PostGraduateCheckBox.Text);
            }
            if (DoctrateCheckBox.Checked)
            {
                sbUserChoices.Append(", " + DoctrateCheckBox.Text);
            }
            Response.Write("Your Selections: " + sbUserChoices.ToString());
        }
    }
}