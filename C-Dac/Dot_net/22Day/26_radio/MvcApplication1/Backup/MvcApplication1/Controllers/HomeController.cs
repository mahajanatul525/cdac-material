using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using MvcApplication1.Models;

namespace MvcApplication1.Controllers
{
    public class HomeController : Controller
    {
        [HttpGet]
        public ActionResult Index()
        {
            Company company = new Company();
            return View(company);
        }

        [HttpPost]
        public string Index(Company company)
        {
            if (string.IsNullOrEmpty(company.SelectedDepartment))
            {
                return "You did not select any department";
            }
            else
            {
                SampleDBContext cx = new SampleDBContext();
                int id = Convert.ToInt32(company.SelectedDepartment);
                var nm = from x in cx.Departments where x.Id == id  select (x.Name);
                  string n = nm.Single();
                 
                return "You selected department with ID = " + company.SelectedDepartment + n;
            }
        }

    }
}
