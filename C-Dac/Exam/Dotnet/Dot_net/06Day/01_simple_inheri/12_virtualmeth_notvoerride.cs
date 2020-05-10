
/* When a virtual method is not overridden, 
   the base class method is used. */ 
 
using System; 
 
class Base { 
  // Create virtual method in the base class.  
  public virtual void who() { 
    Console.WriteLine("who() in Base"); 
  } 
} 
 
class Derived1 : Base { 
  // Override who() in a derived class. 
  public override void who() { 
    Console.WriteLine("who() in Derived1"); 
  } 
} 
 
class Derived2 : Base { 
  // This class does not override who(). 
} 
 
class NoOverrideDemo { 
  public static void Main() { 
    Base baseOb = new Base(); 
    Derived1 dOb1 = new Derived1(); 
    Derived2 dOb2 = new Derived2(); 
 
    Base baseRef; // a base-class reference 
 
    baseRef = baseOb;  
    baseRef.who(); 
 
    baseRef = dOb1;  
    baseRef.who(); 
 
    baseRef = dOb2;  
    baseRef.who(); // calls Base's who() 
  } 
}
