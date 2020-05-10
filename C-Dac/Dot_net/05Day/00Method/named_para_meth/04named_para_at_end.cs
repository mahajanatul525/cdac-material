using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication4
{
    class Program
    {
        static void Main(string[] args)
        {
            DisplayFancyMessage( "Wow! Very Fancy indeed!", 50, name:"raj");
          // DisplayFancyMessage( "geeta",  message: "hello",50);
            Console.ReadLine();

        }

        static void DisplayFancyMessage( string message,int number, string name,)
        {
            Console.WriteLine("{0},{1},{2}",number,name,message );
            
        }

    }
}
