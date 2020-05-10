using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Radio_ex.Models ;
namespace Radio_ex.Controllers
{
    public class HomeController : Controller
    {
        //
        // GET: /Home/

        company c = new company();

        public ActionResult Index()
          {
              //List<Emp> data = c.GetEmp;
              return View(c);
          }
        public ActionResult disp(string selectedId)
        {
       
        IEnumerable<Emp> data= c.GetEmp;
         
             int selected = Convert.ToInt16(selectedId);
             List<Emp> cl = c.GetEmp;
               
                data= from r in cl where r.Id == selected select r ;
         
                 //observe data is in key value---         
                var formattedData = data.Select(p => new {
                    Id = p.Id,
                    Name = p.Name,
                    Age =  p.Age
                });
                return Json(formattedData, JsonRequestBehavior.AllowGet);
        }
           
        

    }
}
