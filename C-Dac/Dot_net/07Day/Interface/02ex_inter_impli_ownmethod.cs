
// Implement ISeries and add getPrevious(). 
 class ByTwos : ISeries { 
  int start; 
  int val; 
  int prev; 
 
  public ByTwos() { 
    start = 0; 
    val = 0; 
    prev = -2; 
  }  
 
  public int getNext() { 
    prev = val; 
    val += 2; 
    return val; 
  } 
 
  public void reset() { 
    val = start; 
    prev = start - 2; 
  } 
 
  public void setStart(int x) { 
    start = x; 
    val = start; 
    prev = val - 2; 
  } 
 
  // A method not specified by ISeries. 
  public int getPrevious() { 
    return prev; 
  } 
}
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

for(int i=0; i < 5; i++) 
      Console.WriteLine("Next value is " + 
                         ob.getPrevious()); 
  } 
}