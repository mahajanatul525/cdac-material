// Analyze methods using reflection. 
 
using System; 
using System.Reflection; 
 
class MyClass { 
  int x; 
  int y; 
 
  public MyClass(int i, int j) { 
    x = i; 
    y = j; 
  } 
 
  public int sum() { 
    return x+y; 
  } 
 
  
 
  public void set(int a, int b) { 
    x = a; 
    y = b; 
  } 
 
  
  public void show() { 
    Console.WriteLine(" x: {0}, y: {1}", x, y); 
  } 
} 
 
class ReflectDemo { 
  public static void Main() { 
    Type t = typeof(MyClass); // get a Type object representing MyClass 
 
    Console.WriteLine("Analyzing methods in " + t.Name);     
    Console.WriteLine(); 
 
    Console.WriteLine("Methods supported: "); 
 
    MethodInfo[] mi = t.GetMethods(); 
 
    // Display methods supported by MyClass. 
    foreach(MethodInfo m in mi) { 
      // Display return type and name. 
      Console.Write("   " + m.ReturnType.Name + 
                      " " + m.Name + "("); 
 
      // Display parameters. 
      ParameterInfo[] pi = m.GetParameters(); 
 
      for(int i=0; i < pi.Length; i++) { 
        Console.Write(pi[i].ParameterType.Name + 
                      " " + pi[i].Name); 
        if(i+1 < pi.Length) Console.Write(", "); 
      } 
 
      Console.WriteLine(")"); 
     
      Console.WriteLine(); 
    } 
  } 
}

/*Analyzing methods in MyClass
Methods supported:
Int32 Sum()

Void Set(Int32 a, Int32 b)

Void Show()
Type GetType()
String ToString()
Boolean Equals(Object obj)
Int32 GetHashCode()*/