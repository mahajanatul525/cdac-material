
// Manually throw an exception. 
 
using System; 
 
class ThrowDemo { 
  public static void Main() { 
    try { 
      Console.WriteLine("Before throw."); 
      throw new DivideByZeroException(); 
    } 
    catch (DivideByZeroException) { 
      // catch the exception 
      Console.WriteLine("Exception caught."); 
    } 
    Console.WriteLine("After try/catch block."); 
  } 
}

