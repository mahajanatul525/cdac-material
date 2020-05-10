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
            DisplayFancyMessage(message: "Wow! Very Fancy indeed!", number:50, name:"raj");
            DisplayFancyMessage(name: "geeta", number: 50, message: "hello");
            Console.ReadLine();

        }

        static void DisplayFancyMessage(int number, string name, string message)
        {
            Console.WriteLine("{0},{1},{2}",number,name,message );
            
        }

    }
}
