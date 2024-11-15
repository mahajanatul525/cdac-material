﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Businesslayer;
namespace _08businesslogic.Controllers
{
    public class EmployeeController : Controller
    {
        //
        // GET: /Employee/

        public ActionResult Index()
        {
            Employeelayer e = new Employeelayer();
                 List<Employee> employees = e.Employees.ToList();
        return View(employees);
            
        }
        [HttpGet]
        [ActionName("Create")]
        public ActionResult Create_Get()
        {
            
            return View();

        }
        [HttpPost]
        [ActionName("Create")]
        public ActionResult Create_Post()
        {
            if (ModelState.IsValid)
            {


                Employeelayer employeeBusinessLayer =
                    new Employeelayer();

                Employee employee = new Employee();
                UpdateModel<Employee>(employee);

                employeeBusinessLayer.AddEmmployee(employee);
                return RedirectToAction("Index");
            }
                return View();            
        }
    }
}
