using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication3
{
   
    class A { }
    class B : A { }

    class CheckCast
    {
        public static void Main()
        {
            A a = new A();
            B b = new B();

            b = a as B; // cast, if possible 

            if (b == null)
                Console.WriteLine("Cast b = (B) a is NOT allowed.");
            else
                Console.WriteLine("Cast b = (B) a is allowed");
            Console.ReadLine();

          a  =b as A;
          if (a == null)
              Console.WriteLine("Cast a = (a) a is NOT allowed.");
          else
              Console.WriteLine("Cast a = (a) a is allowed");
          Console.ReadLine();


           a = new B();

          b = a as B;
          if (b == null)
              Console.WriteLine("Cast b = (b) a is NOT allowed.");
          else
              Console.WriteLine("Cast b = (b) a is allowed");
          Console.ReadLine();

               }
    }

}
