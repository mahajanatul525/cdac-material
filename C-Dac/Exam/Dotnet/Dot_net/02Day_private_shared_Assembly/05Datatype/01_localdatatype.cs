using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

// BigInteger lives here! 
// You must reference System.Numerics.dll to use this namesapce. 


namespace BasicDataTypes
{
    class Program
    {
        static void Main( string[] args )
        {
            Console.WriteLine("***** Fun with Basic Data Types *****\n");
            LocalVarDeclarations();
                   
        
            Console.ReadLine();
        }

        static void LocalVarDeclarations()
        {
            Console.WriteLine("=> Data Declarations:");
            // Local variables are declared and initialized as follows:
            // dataType varName = initialValue;
            int myInt = 0;

            string myString;
            myString = "This is my character data";

            // Declare 3 bools on a single line.
            bool b1 = true, b2 = false, b3 = b1;

            // Use System data type to declare a bool.
            System.Boolean b4 = false;

            Console.WriteLine("Your data: {0}, {1}, {2}, {3}, {4}, {5}",myInt, myString, b1, b2, b3, b4);

            Console.WriteLine();
        }

        
       }
}
