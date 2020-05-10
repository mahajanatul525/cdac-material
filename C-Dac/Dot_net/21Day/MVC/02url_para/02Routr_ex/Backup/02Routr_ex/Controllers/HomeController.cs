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

        public String  Index(int Id,String Name)
        {
           // return View();
            return "ID= " + Id + " Name= " + Name;
        }

    }
}
