using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace _03viewbag.Controllers
{
    public class HomeController : Controller
    {
        //
        // GET: /Home/

     /*  public List<string> Index()
        {

            return new List<string>()
    {
        "India",
        "US",
        "UK",
        "Canada"
    };
           // return View();
        }*/



       public ActionResult Index()
        {
            // Store the list of Countries in ViewBag.  
            ViewData["Countries"] = new List<string>()
    {
        "India",
        "US",
        "UK",
        "Canada"
    };

            // Finally return a view
            return View();
        }

    }
}
