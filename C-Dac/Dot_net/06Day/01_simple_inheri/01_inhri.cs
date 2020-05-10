// A simple class hierarchy. 
 
using System; 
 
// A class for two-dimensional objects. 
class TwoDShape { 
  public double width; 
  public double height; 
 
  public void showDim() { 
    Console.WriteLine("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// Triangle is derived from TwoDShape. 
class Triangle : TwoDShape 
{ 

  public string style; // style of triangle 
   
  // Return area of triangle. --height,width availabe in the derived class due to inheritance
  public double area() { 
    return width * height / 2; 
  } 
 
  // Display a triangle's style. 
  public void showStyle() { 
    Console.WriteLine("Triangle is " + style); 
  } 
} 
 
class Shapes { 
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




// A derived class of TwoDShape for rectangles. 
class Rectangle : TwoDShape { 
  // Return true if the rectangle is square. 
  public bool isSquare() { 
    if(width == height) return true; 
    return false; 
  } 
   
  // Return area of the rectangle. 
  public double area() { 
    return width * height; 
  } 
}