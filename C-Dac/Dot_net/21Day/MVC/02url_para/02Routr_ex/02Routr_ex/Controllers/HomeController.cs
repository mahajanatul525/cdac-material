using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace _02Routr_ex.Controllers
{
    public class HomeController : Controller
    {
        //
        // GET: /Home/

     /* public String  Index(string Name,int Id=1)
        {
           // return View();
            return "ID= " + Id + " Name= " + Name+ " " ;
        }*/

        public String Index(int Id)
        {
            // return View();
            return "ID= " + Id + " Name= " + Request.QueryString["nm"] + " ";
        }
    }
}
