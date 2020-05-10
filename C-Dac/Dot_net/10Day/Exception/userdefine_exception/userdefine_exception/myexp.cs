using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace userdefine_exception
{
          public class myexception : ApplicationException
        {
            readonly int sal;
            readonly string nm;
          public  string smg;
            public myexception(int sal, string nm, string smg)
            {
                this.sal = sal;
                this.nm = nm;
                this.smg = smg;
               
            }
             
               
        }
    }

