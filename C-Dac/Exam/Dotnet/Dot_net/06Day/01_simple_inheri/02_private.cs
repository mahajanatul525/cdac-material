// Private members are  inherited.  but not accessible 
 
// This example will not compile. 
using System; 
 
// A class for two-dimensional objects. 
class TwoDShape { 
  double width;  // now private 
  double height; // now private 
 
  public void showDim() { 
    Console.WriteLine("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// Triangle is derived from TwoDShape. 
class Triangle : TwoDShape { 
  public string style; // style of triangle 
   
  // Return area of triangle. 
  public double area() { 
    return width * height / 2; // Error, can't access private member 
  } 
 
  // Display a triangle's style. 
  public void showStyle() { 
    Console.WriteLine("Triangle is " + style); 
  } 
}