using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _05prop_const
{
    class propdisp
    {

        string _name;

        public propdisp(string nm)
        {
            Name = nm;
            Console.WriteLine(Name);
            Console.ReadKey();
        }

        public string Name
        {
            get{return _name; }

            set{
                if (value.Length >=3)
                    Console.WriteLine("err");

                else _name = value;
            }

        }
    
    
    }



    class Program
    {
        static void Main(string[] args)
        {
            propdisp obj = new propdisp("vita");

        

        }
    }
}
