
// An example of inheritance-related name hiding. 
 
using System; 
 
class A { 
  public int i = 0; 
} 
 
// Create a derived class. 
class B : A { 
  new int i; // this i hides the i in A 
 
  public B(int b) { 
    i = b; // i in B 
  } 
 
  public void show() { 
    Console.WriteLine("i in derived class: " + i); 
  } 
} 
 
class NameHiding { 
  public static void Main() { 
    B ob = new B(2); 
 
    ob.show(); 
  } 
}


// Using base to overcome name hiding. 
 
using System; 
 
class A { 
  public int i = 0; 
} 
 
// Create a derived class. 
class B : A { 
  new int i; // this i hides the i in A 
 
  public B(int a, int b) { 
    base.i = a; // this uncovers the i in A 
    i = b; // i in B 
  } 
 
  public void show() { 
    // this displays the i in A. 
    Console.WriteLine("i in base class: " + base.i); 
 
    // this displays the i in B 
    Console.WriteLine("i in derived class: " + i); 
  } 
} 
 
class UncoverName { 
  public static void Main() { 
    B ob = new B(1, 2); 
 
    ob.show(); 
  } 
}
