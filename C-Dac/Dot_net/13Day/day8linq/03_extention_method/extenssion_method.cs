using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication20
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = "acharya";
            string rs = str.changefirstlett();
            Console.WriteLine(rs);
            Console.ReadLine();
            chk();
        }
        //obsereve class is  static and use of this key words

        public static void chk()
        {
            List<int> numbs = new List<int> { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
          // IEnumerable<int> evno = numbs.Where<int>(no => (no % 2) == 0);

            IEnumerable<int> evno = Enumerable.Where<int>(numbs,no => (no % 2) == 0);
            foreach (int e in evno)
            {
                Console.WriteLine(e); 
            }
            Console.ReadLine();
        }
    }
    public static class strhelp
    { 
   public static string  changefirstlett(this string inp)
    { if(inp .Length >0)
       {
        char [] char_arr=inp.ToCharArray ();
        char_arr[0]=char.IsUpper(char_arr [0])?char.ToLower (char_arr[0] ):char.ToUpper(char_arr[0]);
        return new string (char_arr );
      }

       return inp;
    }
   
   
      }
    }

