using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace internalClassLibrary
{
    public class publicclass
    {
        public void add()
        {  
            Console.WriteLine("This is public method add");
        }

        protected void sub()
        {
            Console.WriteLine("This is protected method sub");
        }

        internal void multi()
        {
            Console.WriteLine("This is protected method multi");
        
        }
        protected internal void go()
        {internalclass s=new internalclass ()
            s.go ();
            
            Console.WriteLine("This is protected method multi"); 
        }
    }
 class internalclass
    {   public void add()
        {      Console.WriteLine("This is public method add");       }

        protected void sub()
        {         Console.WriteLine("This is protected method sub");       }

        internal void multi()
        {     Console.WriteLine("This is protected method multi");       }
        protected internal void go()
        {           Console.WriteLine("This is protected method multi");    }
    }
  
 
}
