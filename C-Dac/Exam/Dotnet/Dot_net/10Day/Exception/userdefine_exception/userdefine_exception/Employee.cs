using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace userdefine_exception
{
    public class employee
    {
        public employee() { }
        public employee(string name, int sal)
        {
            Name = name;
            Salary = sal;
        }
        public string Name { get; set; }
        public int Salary { get; set; }

        public void incriment(int iamt)
       {
           if (iamt > 10000)
               throw new myexception(Salary, Name, "incriment above 10000 not allowed");
             if (iamt < 1)
            {
                throw new Exception("Incriment amount is in Negative");
            }
          
               Salary += iamt;
       }
    }
}
