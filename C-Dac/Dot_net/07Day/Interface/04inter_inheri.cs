/ One interface can inherit another. 
 
using System; 
 
public interface A { 
  void meth1(); 
  void meth2(); 
} 
 
// B now includes meth1() and meth2() -- it adds meth3(). 
public interface B : A { 
  void meth3(); 
} 
 
// This class must implement all of A and B 
class MyClass : B { 
  public void meth1() { 
    Console.WriteLine("Implement meth1()."); 
  } 
 
  public void meth2() { 
    Console.WriteLine("Implement meth2()."); 
  } 
 
  public void meth3() { 
    Console.WriteLine("Implement meth3()."); 
  } 
} 
 
class IFExtend { 
  public static void Main() { 
    MyClass ob = new MyClass(); 
 
    ob.meth1(); 
    ob.meth2(); 
    ob.meth3(); 
  } 
}