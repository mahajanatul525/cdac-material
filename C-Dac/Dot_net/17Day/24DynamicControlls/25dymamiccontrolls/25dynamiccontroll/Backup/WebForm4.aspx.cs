using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _25dynamiccontroll
{
    public partial class WebForm4 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnGenerateControl_Click(object sender, EventArgs e)
        {
            // Retrieve the count of the controls to generate
            int Count = Convert.ToInt16(txtControlsCount.Text);
            // Loop thru each list item in the CheckBoxList
            foreach (ListItem li in chkBoxListControlType.Items)
            {
                if (li.Selected)
                {
                    // Generate Lable Controls
                    if (li.Value == "Label")
                    {
                        for (int i = 1; i <= Count; i++)
                        {
                            Label lbl = new Label();
                            lbl.Text = "Label - " + i.ToString();
                          //  this.Page.Controls.Add(lbl); this will gives you err as it place data outside form
                            this.form1.Controls.Add(lbl);
                        }
                    }
                    // Generate TextBox controls
                    else if (li.Value == "TextBox")
                    {
                        for (int i = 1; i <= Count; i++)
                        {
                            TextBox txtBox = new TextBox();
                            txtBox.Text = "TextBox - " + i.ToString();

                            this.form1.Controls.Add(txtBox);
                        }
                    }
                    // Generate Button Controls
                    else
                    {
                        for (int i = 1; i <= Count; i++)
                        {
                            Button btn = new Button();
                            btn.Text = "Button - " + i.ToString();

                            this.form1.Controls.Add(btn);
                        }
                    }
                }
            }
        }
    }
}