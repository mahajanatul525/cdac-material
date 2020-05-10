
// Demonstrate when constructors are called. 
 
using System; 
 
// Create a base class. 
class A { 
  public A() {  
    Console.WriteLine("Constructing A."); 
  } 
} 
 
// Create a class derived from A. 
class B : A { 
  public B() { 
    Console.WriteLine("Constructing B."); 
  } 
} 
 
// Create a class derived from B. 
class C : B { 
  public C() { 
    Console.WriteLine("Constructing C."); 
  } 
} 
 
class OrderOfConstruction { 
  public static void Main() {
    C c = new C(); 
	Console.ReadLine();
  } 
}
