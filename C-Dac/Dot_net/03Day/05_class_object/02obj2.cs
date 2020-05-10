using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace basic1
{
    class Employee
    {
        public int age;    // number of floors 
        public int salary;      // total square footage of building 
        public string name; // number of occupants 
    }

      

    class EmployeeDemo
    {

        static void Main()
        {

            Employee emp = new Employee(); // create a  object 

            double netsal; 

           

            emp.age = 25;
            emp.salary= 8500;
            emp.name = "Raj";

            // Compute the area per person. 
            netsal = emp.salary - emp.salary * 0.1;

            Console.WriteLine("employee has age: " + emp.age + "\n Name=  " + emp.name + "\n salary  " +
                              emp.salary + " net sal\n  " + netsal );


            Employee emp1 = new Employee(); // create a object 

           
 

            emp1.age = 20;
            emp1.salary = 8000;
            emp1.name = "Reena";

             
            netsal = emp1.salary - emp1.salary * 0.1;

            Console.WriteLine("Employee has age:  " + emp1.age + "\n Name= " + emp1.name + "\n Salay  " +
                              emp1.salary + " net sal\n  " + netsal );
            Console.ReadKey();
        }
    }
}
