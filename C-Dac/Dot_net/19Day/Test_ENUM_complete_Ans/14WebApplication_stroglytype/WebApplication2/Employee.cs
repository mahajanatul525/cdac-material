using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication2
{
    public enum DEPT { MKT=1,ADV,ADMIN}
    public class Employee
    {   public int Id;
        public string Name;
        public decimal Salary;
        public DEPT d;
        public Employee(){}
      /*  public Employee(int Id, string Name, decimal Salary,DEPT d)
        {
            this.Id = Id;
            this.Name = Name;
            this.Salary = Salary;
            switch(d)
            {
                case DEPT.ADMIN:  this.d = DEPT.ADMIN;
                    break;
                case DEPT.ADV:this. d = DEPT.ADV;
                    break;
                case DEPT.MKT:this. d = DEPT.MKT;
                    break;
                       
            }*/
        
        }
        
    }
}