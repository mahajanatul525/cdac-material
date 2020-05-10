using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data.Entity;
namespace _05entity.Models
{
    public class EmployeeContex:DbContext 
    {
        public DbSet<Employee> Employees { get; set; }

    }
}