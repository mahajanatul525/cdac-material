using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
namespace _05prop_const
{   class propdisp
    {   string _Name;
        public propdisp(string _name)
        {    Name = _name;
            Console.WriteLine(Name);
            Console.ReadKey();
        }
        public string Name
        {     get{         Console.WriteLine("get called");
                return _Name; }
            set{        Console.WriteLine("set called");
                if (value.Length >=3)
                    Console.WriteLine("err");
                else
		 _Name = value;
            }       }   }
  class Program
    {     static void Main(string[] args)
        {       propdisp obj = new propdisp("vi");
        }
    }
}
