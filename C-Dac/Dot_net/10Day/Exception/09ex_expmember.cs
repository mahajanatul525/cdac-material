// Using Exception members. 
 
using System; 
 
class ExcTest { 
  public static void genException() { 
    int[] nums = new int[4];  
 
    Console.WriteLine("Before exception is generated."); 
 
    // Generate an index out-of-bounds exception. 
      for(int i=0; i < 10; i++) { 
        nums[i] = i; 
        Console.WriteLine("nums[{0}]: {1}", i, nums[i]); 
      } 
 
    Console.WriteLine("this won't be displayed");  
  } 
}     
 
class UseExcept {  
  public static void Main() {  
  
    try {  
      ExcTest.genException(); 
    }  
    catch (IndexOutOfRangeException exc) {  
      // catch the exception  
      Console.WriteLine("Standard message is: "); 
      Console.WriteLine(exc); // calls ToString() 
      Console.WriteLine("Stack trace: " + exc.StackTrace); 
      Console.WriteLine("Message: " + exc.Message); 
      Console.WriteLine("TargetSite: " + exc.TargetSite); 
    }  
    Console.WriteLine("After catch statement.");  
  }  
}
