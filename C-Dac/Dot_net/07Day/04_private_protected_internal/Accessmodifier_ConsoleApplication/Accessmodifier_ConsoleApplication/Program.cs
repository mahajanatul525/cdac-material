using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using internalClassLibrary;
namespace Accessmodifier_ConsoleApplication
{
    

    class Program:publicclass
    {
        static void Main(string[] args)
        {
           Program c = new Program();
            c.add();
            c.sub();
            publicclass p = new publicclass();
            p.add();
            Console.ReadLine();
        }
    }
}
