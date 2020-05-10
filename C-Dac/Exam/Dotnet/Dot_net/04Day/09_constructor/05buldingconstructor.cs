using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace basic1
{
    class Employee
    {
        public int age;    
        public int salary;      
        public string name; 

        public Employee(int a, int sal, string nm)
        {
            age = a;
            salary = sal;
            name = nm;
        }

        public double calculate()
        {
            double netsal;
            netsal = salary - salary * 0.1;
            return netsal;
        }
    }


    // This class declares an object of type Building.   

    class EmployeeDemo
    {

        static void Main()
        {

            Employee emp = new Employee(25, 8500, "Raj"); 

            double netsal; 

            
            netsal = emp.calculate();

            Console.WriteLine("employee has:\n  " + emp.age + " Name=\n  " + emp.name + " occupants\n  " +
                              emp.salary + " net sal\n  " + netsal);


            Employee emp1 = new Employee(20, 8000, "Reena"); // create a object 



            // Compute the area per person. 
            netsal = emp1.calculate(); ;

            Console.WriteLine("Employee has:  " + emp1.age + "\n Name=  " + emp1.name + "\n Salay  " +
                              emp1.salary + "\n net sal  " + netsal);
            Console.ReadKey();

        }
    }
}
