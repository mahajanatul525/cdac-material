// Use explicit implementation to remove ambiguity. 
 
using System; 
 
interface IMyIF_A { 
  int meth(int x); 
} 
 
interface IMyIF_B { 
  int meth(int x); 
} 
 
// MyClass implements both interfaces. 
class MyClass : IMyIF_A, IMyIF_B { 
 
  // explicitly implement the two meth()s 
  int IMyIF_A.meth(int x) { 
    return x + x; 
  } 
  int IMyIF_B.meth(int x) { 
    return x * x; 
  } 
 
  // call meth() through an interface reference. 
  public int methA(int x){ 
    IMyIF_A a_ob; 
    a_ob = this; 
    return a_ob.meth(x); // calls IMyIF_A 
  } 
 
  public int methB(int x){ 
    IMyIF_B b_ob; 
    b_ob = this; 
    return b_ob.meth(x); // calls IMyIF_B 
  } 
} 
 
class FQIFNames { 
  public static void Main() { 
    MyClass ob = new MyClass(); 
 
    Console.Write("Calling IMyIF_A.meth(): "); 
    Console.WriteLine(ob.methA(3)); 
 
    Console.Write("Calling IMyIF_B.meth(): "); 
    Console.WriteLine(ob.methB(3)); 
  } 
}