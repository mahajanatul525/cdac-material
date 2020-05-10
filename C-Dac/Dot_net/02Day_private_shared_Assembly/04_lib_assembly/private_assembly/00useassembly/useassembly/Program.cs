using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using meth_lib;

namespace useassembly
{
    class Program
    {
        static void Main(string[] args)
        {
            Mathclass m = new Mathclass();
           int r= m.add(5, 4);
           Console.WriteLine(r);
           Console.ReadLine();
        }
    }
}
