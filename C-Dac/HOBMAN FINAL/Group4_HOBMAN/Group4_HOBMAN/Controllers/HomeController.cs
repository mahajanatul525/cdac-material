using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Hobman;
using System.Data.SqlClient;
using System.Data;
using System.Configuration;
using Group4_HOBMAN.Models;
using System.Web.Services;
using System.Web.Security;

namespace Group4_HOBMAN.Controllers
{
    public class HomeController : Controller
    {
        Business b = new Business();

        

       public ActionResult Index()
        {
            return View();
        }

       public ActionResult custcancelRoom()
       {
           return View("cancelRoom");
       }

        public ActionResult find(string dropdownstate, string dropdowncity)
        {
            Business b = new Business();
            List<hotel_details> l = b.findHotels(dropdownstate, dropdowncity);
            //query
            return View("hotels",l);
        }

        public ActionResult staffLogin()
        {
            return View();
        }

        [HttpPost]
        public ActionResult staffLogin(staff_details s)
        {
            //Validation code

            bool b1 = b.aunthlogin(s);
            if (b1 == true)
                return View("staffsuccessLog");
            else
                return View();
        }

        public ActionResult staffbookRoom(booking_details b, string submit)
        {
            List<booking_details> list;
            Business b1 = new Business();

            if (submit == "Book")
            {
                list = b1.bookingfromdatabase(b.booking_id);

                return View("staffbookRoom", list);
            }
            else if (submit == "Cancel")
            {
              //  b1.cancelroom(b.booking_id);
                return View("cancelRoom");
            }
            else if (submit == "Bill")
            {
                return View("bill");
            }
            else return View();
        }

        [HttpPost]
        public ActionResult staffbookRoom(booking_details list)
        {
            return View("successBook");
        }


        public JsonResult bill(int booking_id)
        {
            Business b = new Business();
            // DataSet ds = new DataSet();
            List<bill_details> ds = b.getbill(booking_id);

            return Json(ds, JsonRequestBehavior.AllowGet);
        }
        [HttpPost]
        public ActionResult bill(bill_details d)
        {
            Business b = new Business();
            b.insertbill(d);
            return View("billgenerated", d);
        }

        public ActionResult custLogin(customer_details c)
        {
            return View();
        }

        [HttpPost]
        public ActionResult custLogin(customer_details c,int id=0)
        {
            bool b1 = b.custaunthlogin(c);
            if (b1 == true)
            {
                Session["customer_name"] = c.customer_name;
                Session["password"] = c.customer_password;
                return View("custsuccessLog");
            }
            else
                return View();
        }

        public ActionResult registration()
        {
            return View();
        }

        [HttpPost]
        public ActionResult registration(customer_details c)
        {
            //validation code
            string c1 = c.state_id;
            Console.WriteLine(c1);
            b.intodatabase(c);
            return View("Index");
        }

        public ActionResult hotels()
        {
            Business b = new Business();
            List<hotel_details> ls = b.getHotels();
            return View("hotels",ls);
        }

        public ActionResult feedback()
        {
            return View();
        }

        public ActionResult whyKrishna()
        {
            return View();
        }

        public ActionResult contact()
        {
            return View();
        }

        public JsonResult Getstates()
        {
            Business b = new Business();
            List<state_details> ds = b.getstate();
            return Json(ds, JsonRequestBehavior.AllowGet);
        }
        public JsonResult Getcitybystateid(string state_id)
        {
            Business b = new Business();
            List<city_details> ds = b.getcity(state_id);
            return Json(ds, JsonRequestBehavior.AllowGet);
        }

        public ActionResult custbookRoom()
        {
            if (Session["customer_name"] != null && Session["password"] != null)
            {
                return View();
            }
            else
                return RedirectToAction("custLogin");

        }

        [HttpPost]
        public ActionResult custbookRoom(booking_details book)
        {

            b.bookingdatabase(book);
            return View("successBook");

        }

        public ActionResult Logout()
        {
            FormsAuthentication.SignOut();
            Session.Abandon(); // it will clear the session at the end of request
            return RedirectToAction("Index");
        }

    }
}
