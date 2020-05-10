// Demonstrate protected. 
 
using System; 
 
class B { 
  protected int i, j; //  accessible by D 
 
  public void set(int a, int b) { 
    i = a; 
    j = b; 
  } 
 
  public void show() { 
    Console.WriteLine(i + " " + j); 
 } 
} 
 
class D : B { 
  int k; // private 
 
  // D can access B's i and j 
  public void setk() { 
     k = i * j; 
  } 
 
  public void showk() { 
    Console.WriteLine(k); 
  } 
} 
 
class ProtectedDemo { 
  public static void Main() { 
    D ob = new D(); 
 
    ob.set(2, 3); // OK, known to D 
    ob.show();    // OK, known to D 
 
    ob.setk();  // OK, part of D 
    ob.showk(); // OK, part of D 
  } 
}
