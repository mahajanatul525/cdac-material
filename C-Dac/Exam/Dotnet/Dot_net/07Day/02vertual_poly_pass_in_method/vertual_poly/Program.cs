using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace vertual_poly
{
    class shape2d
    {
        int height;
        int width;

        public shape2d(int x, int y)
        {
            WIDTH  = x;
            HEIGHT = y;
                
        }
        public virtual int  area()
        {
            Console.WriteLine("shape un known");
            return 0;
        }
        public int WIDTH
        {
            get {return width;} 
            set {if(value>0) width =value; 
            else 
            Console .WriteLine ("err");
            }

        }
        public int HEIGHT
        {
            get {return height; }
            set
            {
                if (value > 0) height = value;
                else
                    Console.WriteLine("err");
            }

        }
    
    }

    class triangle : shape2d
    {
        public triangle(int tx, int ty) : base(tx, ty) { }
        public override int area()
        {
            return WIDTH * HEIGHT/2;
        }
    }


    class ract : shape2d
    {
        public ract(int rx, int ry) : base(rx, ry) { }
        public override int area()
        {
            return WIDTH * HEIGHT;
        }
    }

    class showpoly
    {
        public void call(shape2d s)
        {
            Console.WriteLine (s.area());
        
        }
    
    }
    class Program
    {
        static void Main(string[] args)
        {
           /* shape2d s = new shape2d(5,6);
            s = new ract(5,5);

           Console.WriteLine ( s.area());
           s = new triangle(4, 8);
           Console.WriteLine(s.area());*/

            showpoly p = new showpoly();
            ract r = new ract(5,5);
            triangle t = new triangle(4, 8);

            p.call(r);
            p.call(t);
            Console.ReadLine();
            }


    }
}
