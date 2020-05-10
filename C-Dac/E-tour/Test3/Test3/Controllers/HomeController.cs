using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Test3.Models;

namespace Test3.Controllers
{
    public class HomeController : Controller
    {
        //
        // GET: /Home/

        public ActionResult Index()
        {
            return View();
        }

        public ActionResult About()
        {
            ViewBag.Message = "Your app description page.";
            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "Your contact page.";

            return View();
        }

        public ActionResult Register()
        {
            ViewBag.Message = "Your register page.";
            return View();

        }
        [HttpPost]
        public ActionResult Register(Registration reg)
        {
            Console.WriteLine(reg.EmailID);
            if (ModelState.IsValid)
            {
                TourBusiness b = new TourBusiness();
                b.insertData(reg);
                return RedirectToAction("Index");
            }
            return View(reg);
        }


        public ActionResult TourIntern()
        {
            ViewBag.Message = "Your international page.";
            return View();

        }

        public ActionResult TourDom(int page)
        {
            ViewBag.Message = "Your domestic page.";
            ViewBag.CurrentPage = page;
            return View();

        }

        public ActionResult Login()
        {
            return View();

        }

        [HttpPost]
        public ActionResult Login(Registration reg)
        {
            if (ModelState.IsValid)
            {

                 string emailid = null;
                 TourBusiness user = new TourBusiness();
                 emailid= user.Check(reg);
                 HttpCookie cook = new HttpCookie("LoginCookie");
                 cook["name"] = reg.Name;
                 cook["emailid"] =emailid;
            Response.Cookies.Add(cook);
                 if (emailid!= null)
                 {
                     return View("Indexi");
                 }
                else
                     return View();
            }
            return View("Error");
        }
         
        public ActionResult Signout()
        {
            if (Request.Cookies["LoginCookie"] != null)
            {
                HttpCookie cook = new HttpCookie("LoginCookie");
                cook.Expires = DateTime.Now.AddDays(-1);
                Response.Cookies.Add(cook);
            }
            return RedirectToAction("Index");
        }

        public ActionResult Book()
        {
            ViewBag.Message = "Your Booking page.";
            return View();
        }
    }
}

