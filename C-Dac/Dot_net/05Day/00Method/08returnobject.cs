// Return an object. 
 
using System; 
 
class Rect { 
  int width; 
  int height; 
 
  public Rect(int w, int h) { 
    width = w; 
    height = h; 
  } 
 
  public int area() { 
    return width * height; 
  } 
 
  public void show() { 
    Console.WriteLine(width + " " + height); 
  } 
 
  /* Return a rectangle that is a specified 
     factor larger than the invoking rectangle. */ 
  public Rect enlarge(int factor) 
 { 

    return new Rect(width * factor, height * factor); 
  } 
} 
  
class RetObj { 
  public static void Main() {   
    Rect r1 = new Rect(4, 5); 
 
    Console.Write("Dimensions of r1: "); 
    r1.show(); 
    Console.WriteLine("Area of r1: " + r1.area()); 
 
    Console.WriteLine(); 
 
    // create a rectange that is twice as big as r1 
    Rect r2 = r1.enlarge(2); 
 
    Console.Write("Dimensions of r2: "); 
    r2.show(); 
    Console.WriteLine("Area of r2 " + r2.area()); 
  } 
}
