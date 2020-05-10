using System; 
class Rect { 
  public int Width; 
  public int Height; 
 
  public Rect(int w, int h) { 
    Width = w; 
    Height = h; 
  }  
  public int Area() { 
    return Width * Height; 
  } 
}  
class UseRect { 
  static void Main() {   
    Rect r1 = new Rect(4, 5); 
    Rect r2 = new Rect(7, 9); 
 Console.WriteLine("Area of r1: " + r1.Area()); 
     Console.WriteLine("Area of r2: " + r2.Area()); 
  } 
}

//observe this key word ---use of this key word
using System; 
 class Rect { 
  public int Width; 
  public int Height; 
 
  public Rect(int Width, int Height) { 
    Width = Width; 
    Height = Height; 
  } 
  public int Area() { 
    return this.Width * this.Height; 
  } 
} 
class UseRect { 
  static void Main() {   
    Rect r1 = new Rect(4, 5); 
    Rect r2 = new Rect(7, 9); 
 
    Console.WriteLine("Area of r1: " + r1.Area()); 
 
    Console.WriteLine("Area of r2: " + r2.Area()); 
 
  } 
}