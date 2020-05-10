using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication2
{
    public class Employee
    {
        public int Id;
        public string Name;
        public decimal Salary;
        public Employee(){}
        public Employee(int Id, string Name, decimal Salary)
        {
            this.Id = Id;
            this.Name = Name;
            this.Salary = Salary;
            
        
        }
        
    }
}