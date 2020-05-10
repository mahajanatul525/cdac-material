using System;
using System.Collections;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sort_obj
{
    class Data_sort:IComparer
    {
        // Test the pet name of each object.
        public int Compare(object x, object y)
        {

            employee t1 = x as employee;
            employee t2 = y as employee;
            if (t1 != null && t2 != null)
                return String.Compare(t1.Name, t2.Name);
            else
                throw new ArgumentException("Parameter is not a Car!");

               }
    }
}
