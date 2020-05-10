// Use properties to set and get private members. 

using System; 
 
// A class for two-dimensional objects. 
class TwoDShape { 
  double pri_width;  // now private 
  double pri_height; // now private  
 
  // Properties for width and height. 
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
  public string style; // style of triangle 
   
  // Return area of triangle. 
  public double area() { 
    return width * height / 2;  
  } 
 
  // Display a triangle's style. 
  public void showStyle() { 
    Console.WriteLine("Triangle is " + style); 
  } 
} 
 
class Shapes2 { 
  public static void Main() { 
    Triangle t1 = new Triangle(); 
    Triangle t2 = new Triangle(); 
 
    t1.width = 4.0; 
    t1.height = 4.0; 
    t1.style = "isosceles"; 
 
    t2.width = 8.0; 
    t2.height = 12.0; 
    t2.style = "right"; 
 
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
