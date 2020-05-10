// NonGen is functionally equivalent to Gen but does not use generics. 
using System; 
class NonGen {  
  object ob; // ob is now of type object 
   
  // Pass the constructor a reference of type object. 
  public NonGen(object o) {  
    ob = o;  
  }  
  
  // Return type object. 
  public object GetOb() {  
    return ob;  
  }  
 
  // Show type of ob.  
  public void ShowType() {  
    Console.WriteLine("Type of ob is " + ob.GetType()); 
  }  
}  
  
// Demonstrate the non-generic class.  
class NonGenDemo {  
  static void Main() {  
    NonGen iOb;   
    // Create NonGen object. 
    iOb = new NonGen(102);  
  
    // Show the type of data stored in iOb. 
    iOb.ShowType(); 
 
    // Get the value in iOb. 
    // This time, a cast is necessary. 
    int v = (int) iOb.GetOb();  
    Console.WriteLine("value: " + v);  
  
    Console.WriteLine();  
  
    // Create another NonGen object and store a string in it. 
    NonGen strOb = new NonGen("Non-Generics Test");  
  
    // Show the type of data stored strOb. 
    strOb.ShowType(); 
 
    // Get the value of strOb. 
    // Again, notice that a cast is necessary.  
    String str = (string) strOb.GetOb();  
    Console.WriteLine("value: " + str);  
 
    // This compiles, but is conceptually wrong! 
    iOb = strOb; 
 
    // The following line results in a run-time exception. 
    // v = (int) iOb.GetOb(); // run-time error! 
  }  
}
