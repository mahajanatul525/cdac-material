﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sort_obj
{
    class Program
    {
        static void Main(string[] args)
        {
            employee[] p=new employee [5];
            p[0] = new employee() { Name = "Raj", Salary = 50000 };
            p[1] = new employee() {Name="Anita",Salary =80000 };
            p[2] = new employee() {Name="Mona",Salary =30000 };
            p[3] = new employee() { Name = "Geeta", Salary = 90000 };
            p[4] = new employee() { Name = "Ravi", Salary = 70000 };
            Array.Sort(p,new Data_sort());
            foreach (employee e in p)
                Console.WriteLine("{0}", e.Name);
            Console.ReadKey();
        }

    }
}
