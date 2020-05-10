// Use a static constructor. 
 
using System; 
 
class Cons { 
  public static int alpha; 
  public int beta; 
 
  // A static constructor. 
  static Cons() { 
    alpha = 99; 
    Console.WriteLine("Inside static constructor."); 
  } 
 
  // An instance constructor. 
  public Cons() { 
    beta = 100; 
    Console.WriteLine("Inside instance constructor."); 
  } 
} 
  
class ConsDemo { 
  static void Main() {   
    Cons ob = new Cons(); 
 
    Console.WriteLine("Cons.alpha: " + Cons.alpha); 
    Console.WriteLine("ob.beta: " + ob.beta); 
  } 
}
/*
Notice that the static constructor is called automatically (when the class is first loaded) and
before the instance constructor. This can be generalized. In all cases, the static constructor
will be executed before any instance constructor. Furthermore, static constructors cannot
have access modifiers (thus, they use default access) and cannot be called by your program.*/