using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            DisplayFancyMessage(message: "vita",  age: 25,addr: "juhu");

           Console.ReadLine();
        }

       static void DisplayFancyMessage(int age,string message, string addr)
        {
        
        Console.WriteLine(message);
        Console.WriteLine("{0} {1}",age,addr);
       
        }

    }
}
/* choose. Thus, rather than passing parameters solely by position (as you will do in most cases), you can
choose to specify each argument by name using a colon operator. 
*/