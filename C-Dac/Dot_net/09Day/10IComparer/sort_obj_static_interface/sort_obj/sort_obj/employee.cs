using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;
namespace sort_obj
{
    public class employee
    {
        
        public string Name { get; set; }
        public float Salary { get; set; }

        public static IComparer sortByName
        {
            get { return (IComparer)new Data_sort(); }
        }


    }
    
}
