using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

namespace ActionAndFuncDelegates
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("***** Fun with Action and Func *****\n");

            // Use the Action<> delegate to point to DisplayMessage. 
            Action<int, int> actionTarget =
                   new Action<int, int>(DisplayMessage);
            actionTarget(5, 5);  

            Func<int, int, int> funcTarget = new Func<int, int, int>(Add);
            int result = funcTarget.Invoke(40, 40);
            Console.WriteLine("40 + 40 = {0}", result);

            Func<int, int, string> funcTarget2 = new Func<int, int, string>(SumToString);
            string sum = funcTarget2(90, 300);
            Console.WriteLine(sum);

            Console.ReadLine();
        }

        // This is a target for the Action<> delegate. 
        
        // Targets for the Func<> delegate. 
        static int Add(int x, int y)
        {
            return x + y;
        }

        static string SumToString(int x, int y)
        {
            return (x + y).ToString();
        }
        static void DisplayMessage(int x, int y)
        {
            Console.WriteLine(x + y);
        
        }
    }
}
