using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using _04Model_emp.Models;
namespace _04Model_emp.Controllers
{
    public class EmployeeController : Controller
    {
        //
        // GET: /Employee/

        public ActionResult Detail()
        {
            Employee employee = new Employee()
             {
        EmployeeId = 101,
        Name = "John",
        Gender = "Male",
        City = "London"
          };
            
            
            return View(employee); //observe object pass to view
        }

    }
}
