using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using _05entity.Models;
namespace _05entity.Controllers
{
    public class EmployeeController : Controller
    {
        //
        // GET: /Employee/

        public ActionResult Details(int id=7)
        {
        

                EmployeeContex employeeContext = new EmployeeContex();
                Employee employee = employeeContext.Employees.Single(x => x.EmployeeId == id);
                 return View(employee);
           
            
        }

    }
}
