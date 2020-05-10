using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace property_autoimpli
{
    class propautoimpli
    {

        public propautoimpli(string name)
        {
            Name = name;
            Console.WriteLine(Name);
            Console.ReadKey();
        
        }
        public string Name
        {
            get;
            set;
        }
    
    }


    class Program
    {
        static void Main(string[] args)
        {
            propautoimpli obj = new propautoimpli("vita");
            
        }
    }
}
