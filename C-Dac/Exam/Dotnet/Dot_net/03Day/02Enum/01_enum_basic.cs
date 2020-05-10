using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

namespace FunWithEnums
{
    // A custom enumeration.
    enum EmpType
    {
        Manager,       // = 0
        Grunt,         // = 1
        Contractor,    // = 2
        VicePresident  // = 3
    }

    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("**** Fun with Enums *****");
            EmpType emp = EmpType.Contractor;
            AskForBonus(emp);

            // Prints out "emp is a Contractor".
            Console.WriteLine("emp is a {0}.", emp.ToString());

            // Prints out "Contractor = 2".
            Console.WriteLine("{0} = {1}", emp.ToString(), (byte)emp);

            EmpType e2 = EmpType.Contractor;


            Console.ReadLine();
        }

        #region Enum as parameter
        // Enums as parameters.
        static void AskForBonus(EmpType e)
        {
            switch (e)
            {
                case EmpType.Manager:
                    Console.WriteLine("How about stock options instead?");
                    break;
                case EmpType.Grunt:
                    Console.WriteLine("You have got to be kidding...");
                    break;
                case EmpType.Contractor:
                    Console.WriteLine("You already get enough cash...");
                    break;
                case EmpType.VicePresident:
                    Console.WriteLine("VERY GOOD, Sir!");
                    break;
            }
        }
        #endregion

            }
}
