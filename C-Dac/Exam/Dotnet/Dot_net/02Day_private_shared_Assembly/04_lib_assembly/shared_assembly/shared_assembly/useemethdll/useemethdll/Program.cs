using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Math_Add;
namespace useemethdll
{
    class Program
    {
        static void Main(string[] args)
        {
            Mathclass m = new Mathclass();
          int r=  m.add(5, 6);
          Console.WriteLine(r);
          Console.ReadLine();
        }
    }
}
