// Add a constructor to Triangle. 
 
using System; 
 
// A class for two-dimensional objects. 
class TwoDShape { 
  double pri_width;  // private 
  double pri_height; // private  
 
  // properties for width and height. 
  public double width { 
     get { return pri_width; } 
     set { pri_width = value; } 
  } 
 
  public double height { 
     get { return pri_height; } 
     set { pri_height = value; } 
  } 
 
  public void showDim() { 
    Console.WriteLine("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// A derived class of TwoDShape for triangles. 
class Triangle : TwoDShape { 
  string style; // private 
   
  // Constructor 
  public Triangle(string s, double w, double h) { 
    width = w;  // init the base class 
    height = h; // init the base class 
 
    style = s;  // init the derived class 
  } 
 
  // Return area of triangle. 
  public double area() { 
    return width * height / 2;  
  } 
 
  // Display a triangle's style. 
  public void showStyle() { 
    Console.WriteLine("Triangle is " + style); 
  } 
} 
 
class Shapes3 { 
  public static void Main() { 
    Triangle t1 = new Triangle("isosceles", 4.0, 4.0); 
    Triangle t2 = new Triangle("right", 8.0, 12.0); 
 
    Console.WriteLine("Info for t1: "); 
    t1.showStyle(); 
    t1.showDim(); 
    Console.WriteLine("Area is " + t1.area()); 
 
    Console.WriteLine(); 
 
    Console.WriteLine("Info for t2: "); 
    t2.showStyle(); 
    t2.showDim(); 
    Console.WriteLine("Area is " + t2.area()); 
  } 
}
