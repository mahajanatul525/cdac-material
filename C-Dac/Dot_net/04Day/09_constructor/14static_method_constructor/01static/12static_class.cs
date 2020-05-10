// Demonstrate a static class. 
  
using System;  
  
static class NumericFn {  
   
 
  // Return the fractional part of a value. 
  static public double FracPart(double num) { 
  Console.WriteLine("neth");
    return num - (int) num; 
  } 
 
  // Return true if num is even. 
  static public bool IsEven(double num) { 
  Console.WriteLine("hi");
    return (num % 2) == 0 ? true : false; 
  } 
 
 
 
}  
 
class StaticClassDemo {  
  static void Main() {    
    
    Console.WriteLine("Fractional part of 4.234 is " +    NumericFn.FracPart(4.234)); 
 
    if(NumericFn.IsEven(10)) 
      Console.WriteLine("10 is even."); 
 
 
 
    // The following attempt to create an instance of  
    // NumericFn will cause an error.  
//  NumericFn ob = new NumericFn(); // Wrong! 
  }  
}
