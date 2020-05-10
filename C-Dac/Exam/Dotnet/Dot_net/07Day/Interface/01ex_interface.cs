public interface ISeries { 
  int getNext(); // return next number in series 
  void reset(); // restart 
  void setStart(int x); // set starting value 
}
// Implement ISeries. 
class ByTwos : ISeries { 
  int start; 
  int val; 
 public ByTwos() { 
    start = 0; 
    val = 0; 
  }  
 public int getNext() { 
    val += 2; 
    return val; 
  } 
 public void reset() { 
    val = start; 
  } 
 
  public void setStart(int x) { 
    start = x; 
    val = start; 
  } 
}

// Demonstrate the ByTwos interface. 
 
using System; 
 
class SeriesDemo { 
  public static void Main() { 
    ByTwos ob = new ByTwos(); 
 
    for(int i=0; i < 5; i++) 
      Console.WriteLine("Next value is " + 
                         ob.getNext()); 
 
    Console.WriteLine("\nResetting"); 
    ob.reset(); 
    for(int i=0; i < 5; i++) 
      Console.WriteLine("Next value is " + 
                         ob.getNext()); 
 
    Console.WriteLine("\nStarting at 100"); 
    ob.setStart(100); 
    for(int i=0; i < 5; i++) 
      Console.WriteLine("Next value is " + 
                         ob.getNext()); 
  } 
}