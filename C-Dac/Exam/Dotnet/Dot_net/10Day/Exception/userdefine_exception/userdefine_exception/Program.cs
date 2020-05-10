using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace userdefine_exception
{
    
   
    class Program
    {
        static void Main(string[] args)
        {
            employee e1 = new employee("raj", 8000);
            employee e2 = new employee("geet", 7000);
            try
            {
                e1.incriment(1000);
                e2.incriment(12000);
            }
               
            catch (myexception e)
            {
                Console.WriteLine("eeeeeeeeeeeee"+e.smg);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);

            }
            Console.WriteLine("{0},{1}",e1.Name,e1.Salary);
            Console.ReadKey();
        }
    }
}
