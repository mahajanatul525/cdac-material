// Use ref to pass a value type by reference. 
 
using System; 
 
class RefTest { 
  /* This method changes its arguments. 
     Notice the use of ref. */ 
  public void sqr(ref int i) { 
    i = i * i; 
  } 
} 
 
class RefDemo { 
  public static void Main() { 
    RefTest ob = new RefTest(); 
 
    int a = 10; 
 
    Console.WriteLine("a before call: " + a); 
 
    ob.sqr(ref a); // notice the use of ref 
 
    Console.WriteLine("a after call: " + a); 
  } 
}

