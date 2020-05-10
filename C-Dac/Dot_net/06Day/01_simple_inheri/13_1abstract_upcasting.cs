// Create an abstract class. 
using System;
abstract class TwoDShape
{
    double pri_width;  // private 
    double pri_height; // private 
    string pri_name;   // private 

    // A default constructor.  
    public TwoDShape()   {   }
    // Parameterized constructor.  
    public TwoDShape(double w, double h, string n)
    {
        width = w;
        height = h;
        name = n;
        Console.WriteLine("1");
    }

    // Properties for width, height, and name 
    public double width
    {
        get { return pri_width; }
        set { pri_width = value; }
    }

    public double height
    {
        get { return pri_height; }
        set { pri_height = value; }
    }

    public string name
    {
        get { return pri_name; }
        set { pri_name = value; }
    }

    public void showDim()
    {
        Console.WriteLine("Width and height are " +
                           width + " and " + height);
    }

    // Now, area() is abstract. 
    public abstract double area();
}

// A derived class of TwoDShape for triangles. 
class Triangle : TwoDShape
{    // A default constructor.  
    public Triangle()   {       }
        // Constructor for Triangle.  
    public Triangle(double w, double h) :  base(w, h, "triangle")
    {       Console.WriteLine("2");    }
      // Override area() for Triangle. 
    public override double area()
    {
        return width * height / 2;
    }

 }

// A derived class of TwoDShape for rectangles.   
class Rectangle : TwoDShape
{
    // Constructor for Rectangle.  
    public Rectangle(double w, double h) : base(w, h, "rectangle") { Console.WriteLine("3"); }

       // Override area() for Rectangle. 
    public override double area()
    {
        return width * height;
    }
}

class AbsShape
{
    public static void Main()
    {
        TwoDShape[] shapes = new TwoDShape[2];

        shapes[0] = new Triangle(8.0, 12.0);
        shapes[1] = new Rectangle(10, 4);
        

        for (int i = 0; i < shapes.Length; i++)
        {
            Console.WriteLine("object is " + shapes[i].name);
            Console.WriteLine("Area is " + shapes[i].area());

            Console.WriteLine();
        }
        TwoDShape s = new Triangle(5, 7);
        s.showDim();
        Console.ReadLine();
    }
}
