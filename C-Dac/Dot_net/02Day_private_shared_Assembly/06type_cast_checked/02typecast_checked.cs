using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TypeConversions
{
    class Program
    {
        static void Main( string[] args )
        {
            
                ProcessBytes();

            Console.ReadLine();
        }

        #region Helper functions 
        

       

        static void ProcessBytes()
        {
            byte b1 = 100;
            byte b2 = 250;

            // This time, tell the compiler to add CIL code
            // to throw an exception if overflow/underflow
            // takes place.
            try
            {
                checked
                {
                    byte sum = (byte)(b1+b2);
                    Console.WriteLine("sum = {0}", sum);
                }
            }
            catch (OverflowException ex)
            {
                Console.WriteLine("eeeeeeeeeeeeee");// eeeeeeeeeeeeeeeeee
                Console.WriteLine(ex.Message);
            }
        }
        #endregion
    }
}
