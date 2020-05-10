using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace MvcApplicationfile_upload
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)

        {
            if (FileUpload1.HasFile)
            {
                try
                {

                    if (FileUpload1.PostedFile.ContentLength < 2550)
                    {

                        string filename = Path.GetFileName(FileUpload1.FileName);
                        FileUpload1.SaveAs(Server.MapPath("~/") + filename);
                        Label1.Text = "Upload status: File uploaded!";
                    }



                    else Label1.Text = "Upload status: The file has to be less than 250 kb!";
                }
                catch (Exception ex)
                {
                    Label1.Text = "Upload status: The file could not be uploaded. The following error occured: " + ex.Message;
                }
            }
        }
    }
}