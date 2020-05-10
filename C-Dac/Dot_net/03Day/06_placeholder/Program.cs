using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

namespace BasicConsoleIO
{
    class Program
    {
        static void Main( string[] args )
        {
            Console.WriteLine("***** Basic Console I/O *****");
            

            // John says...
            Console.WriteLine("{0}, Number {0}, Number {0}", 9);
                        // Prints: 20, 10, 30
            Console.WriteLine("{1}, {0}, {2}", 10, 20, 30);
int p = 940;
int q = 73;
Console.WriteLine("{0,4}\n{1,4}\n ---- \n {2,4}", p, q, p + q);	
//0,1,2 is place holder index 4 is width(4digitspace)
            FormatNumericalData();

            Console.ReadLine();
        }

       
        #region Format flags.
        // Now make use of some format tags.
        static void FormatNumericalData()
        {
            Console.WriteLine("The value 99999 in various formats:");
            Console.WriteLine("c format: {0:c}", 9999999); 
            Console.WriteLine("d9 format: {0:d9}", 9999999);
            Console.WriteLine("f3 format: {0:f3}", 9999999);
            Console.WriteLine("n format: {0:n}", 9999999);

           
        }
        #endregion
    }
}
