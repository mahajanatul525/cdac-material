﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication14
{  class employee
    {   public string Name { get; set; }
         public int Age { get; set; }
    }
    class program
    {  static void Main(string[] args)
        {   List<employee> listEmployees = new List<employee>()
            {new employee{ Age=5,Name="rg"},
            new employee{ Age=11,Name="ddd"}
            };
 
            employee emp = listEmployees.Find(ee => ee.Age == 11);
            Console.WriteLine(emp.Name);
            int c = listEmployees.Count(x => x.Name.StartsWith("d"));
            Console.WriteLine(c);
            Console.ReadLine();

           // string s = new string(new char[]{'a','d'});
        }

    }
}
