using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Reflection; 
namespace Invoke_object
{
    
// Create an object using reflection. 
 
class MyClass { 
  int x; 
  int y; 
 
  public MyClass(int i) { 
    Console.WriteLine("Constructing MyClass(int, int). "); 
    x = y = i;  
  } 
 
  
  public int sum() { 
    return x+y; 
  } 
 
 
 } 
 
class InvokeConsDemo { 
  public static void Main() { 
    Type t = typeof(MyClass); 
    int val; 
 
    // Get constructor info. 
    ConstructorInfo[] ci = t.GetConstructors(); 
 
    Console.WriteLine("Available constructors: "); 
    foreach(ConstructorInfo c in ci) { 
      // Display return type and name. 
      Console.Write("   " + t.Name + "("); 
       // Display parameters. 
      ParameterInfo[] pi = c.GetParameters(); 
 
      for(int i=0; i < pi.Length; i++) { 
        Console.Write(pi[i].ParameterType.Name +    " " + pi[i].Name); 
        if(i+1 < pi.Length) Console.Write(", "); 
      } 
 
      Console.WriteLine(")");
      Console.ReadKey();
    } 
    Console.WriteLine(); 
 
    // Find matching constructor. 
    int x; 
 
    for(x=0; x < ci.Length; x++) { 
      ParameterInfo[] pi =  ci[x].GetParameters();
      if (x == 0) break;
      
    } 
 
    if(x == ci.Length) { 
      Console.WriteLine("No matching constructor found."); 
      return; 
    } 
    else 
      Console.WriteLine("one-parameter constructor found.\n"); 
 
    // Construct the object.   
    object[] consargs = new object[1]; 
    consargs[0] = 10; 
    
    object reflectOb = ci[x].Invoke(consargs); 
 
    Console.WriteLine("\nInvoking methods on reflectOb."); 
    Console.WriteLine(); 
    MethodInfo[] mi = t.GetMethods(); 
 
    // Invoke each method. 
    foreach(MethodInfo m in mi) { 
      // Get the parameters 
      ParameterInfo[] pi = m.GetParameters(); 
 
      
       if(m.Name.CompareTo("sum")==0) { 
        val = (int) m.Invoke(reflectOb, null); 
        Console.WriteLine("sum is " + val);
        Console.ReadKey();
      } 
     
      
    } 
  } 
} 


}
