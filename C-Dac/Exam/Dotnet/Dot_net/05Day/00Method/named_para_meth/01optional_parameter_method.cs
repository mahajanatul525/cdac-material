using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Named_param
{
   class Program
    {
        static void Main(string[] args)
        {
mycall("vita");
mycall("vita",20);
Console.ReadLine();
        }

        static void mycall(string message, int age =25)
        {
            Console.Beep();
            Console.WriteLine("Error: {0}", message);
            Console.WriteLine("Owner of Error: {0}", age);
        }
    }

}

/*// Error! The default value for an optional arg must be known
// at compile time!
static void EnterLogData(string message,string owner = "Programmer", DateTime timeStamp = DateTime.Now)
{
Console.Beep();
Console.WriteLine("Error: {0}", message);
Console.WriteLine("Owner of Error: {0}", owner);
Console.WriteLine("Time of Error: {0}", timeStamp);
}
This will not compile, as the value of the Now property of the DateTime class is resolved at runtime,
not compile time.*/
