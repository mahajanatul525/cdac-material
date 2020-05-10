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

        public ActionResult Details(int  EmployeeName)
        {
           
                EmployeeContex employeeContext = new EmployeeContex();
                Employee employee = employeeContext.Employees.Single(x => x.EmployeeId == EmployeeName);

                return View(employee);
          
        }


        public ActionResult Index()
        {      EmployeeContex employeeContext = new EmployeeContex();

          List<Employee> employee = employeeContext.Employees.ToList();
/*
            List<SelectListItem> items = new List<SelectListItem>();
            foreach (Employee e in employee)
            {              items.Add(new SelectListItem { Text = e.Name, Value = e.EmployeeId.ToString () });            }
            */
            //ViewBag.EmployeeName = items;
                   ViewBag.EmployeeName = new SelectList(employee, "EmployeeId", "Name");
            return View();
            
        }

    }
}
