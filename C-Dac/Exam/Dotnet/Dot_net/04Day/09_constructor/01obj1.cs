using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace basic1
{    class Employee
    {
        public int age;     
        public int salary;     
        public string name;  
    }

  
    class EmployeeDemo
    {

        static void Main()
        {

            Employee emp = new Employee(); // create a object 

            double netsal; 

            // Assign values to fields 

            emp.age = 25;
            emp.salary = 8500;
            emp.name = "Raj";

            // Compute the area per person. 
            netsal = emp.salary - emp.salary * 0.1;

            Console.WriteLine("\n age:  " + emp.age + " \nName  " + emp.name + "\nsalary  " +
                              emp.salary + " \n net sal  " + netsal );
            Console.ReadKey();
        }
    }
}
