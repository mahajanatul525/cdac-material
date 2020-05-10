// Objects are reference but pass by as value. 
 
using System; 
 
class Test { 
  public int a, b; 
 
  public Test(int i, int j) { 
    a = i; 
    b = j; 
  }
  /* Pass an object. Now, ob.a and ob.b in object 
     used in the call will be changed. */ 
  public void change(ref Test ob) { 
    ob.a +=5 ; 
    ob.b += 5; 
  } 
} 
 
class CallByRef { 
  public static void Main() { 
    Test ob = new Test(15, 20); 
 
    Console.WriteLine("ob.a and ob.b before call: " + 
                       ob.a + " " + ob.b); 
 
    ob.change(ref ob); 
 
    Console.WriteLine("ob.a and ob.b after call: " + 
                       ob.a + " " + ob.b); 
  } 
}
