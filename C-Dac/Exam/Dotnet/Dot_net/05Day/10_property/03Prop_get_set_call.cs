using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace propert_constructor.cs
{
    class Employee
    {
        double _salary;
        int empno;
      public double Salary
        {
            get
            {
                Console.WriteLine("I am in get");
            return _salary;}
            set
            {
                Console.WriteLine("I am in set");
                if (value >= 20000)
                    Console.WriteLine("check amt");
                else 
            
            _salary=value;}
    
         }
               
    }


    public class demo
    {

        public static void Main()
        {
            Employee emp = new Employee();
            emp.Salary = 282000;
          
            Console.WriteLine(emp.Salary);
            emp.Salary = 5000;
            Console.WriteLine(emp.Salary);
            Console.Read();

        
        }
    }
}
