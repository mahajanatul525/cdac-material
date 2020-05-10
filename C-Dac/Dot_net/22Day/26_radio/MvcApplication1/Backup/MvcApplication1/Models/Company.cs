using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace MvcApplication1.Models
{
    public class Company
    {
        public string SelectedDepartment { get; set; }
        
        public List<Department> Departments
        {
            get
            {
                SampleDBContext db = new SampleDBContext();
                return db.Departments.ToList();
            }
        }
    }
}