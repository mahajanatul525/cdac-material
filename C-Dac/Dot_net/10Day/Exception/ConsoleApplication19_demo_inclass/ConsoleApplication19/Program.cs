using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication19
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Employee e1 = new Employee("Raj", 80000);
                Employee e2 = new Employee("geeta", 70000);
                Employee e3 = new Employee("Ravina", 60000);
                Console.WriteLine(e1);
                Console.WriteLine(e2);
                Console.WriteLine(e3);
                Employee e4 = new Employee("Raj", 80000);
                  Console.WriteLine(e4);
            }
            catch(MyException e) 
            {
                Console.WriteLine(e.msg);
            
            }
           

        }
    }
}
