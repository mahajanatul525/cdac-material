// Use static. 
 
using System; 
 
class StaticDemo { 
  // a static variable 
  public static int val = 100;  
 
  // a static method 
  public static int valDiv2() { 
    return val/2; 
  } 
} 
 
class SDemo { 
  public static void Main() { 
 
    Console.WriteLine("Initial value of StaticDemo.val is " 
                      + StaticDemo.val); 
 
    StaticDemo.val = 8; 
    Console.WriteLine("StaticDemo.val is " + StaticDemo.val); 
    Console.WriteLine("StaticDemo.valDiv2(): " + 
                       StaticDemo.valDiv2()); 
  } 
}

