// Use a property in an interface. 
 using System; 
 public interface ISeries { 
  // an interface property 
  int next { 
    get; // return the next number in series 
    set; // set next number 
  } 
} // Implement ISeries. 
class ByTwos : ISeries { 
  int val;      // get or set value 
  public int next { 
    get {        val += 2; 
      return val; 
    } 
    set {      val = value;     } 
  } 
  public ByTwos() { 
    val = 0; 
  } 

public void disp()  
{
	Console.WriteLine("hi");
	
}
} 
 
// Demonstrate an interface property. 
class SeriesDemo3 { 
  public static void Main() { 
    ByTwos ob = new ByTwos(); 
 
    // access series through a property 
    for(int i=0; i < 5; i++) 
      Console.WriteLine("Next value is " + ob.next); 
 
    Console.WriteLine("\nStarting at 21"); 
    ob.next = 21; 
    for(int i=0; i < 5; i++) 
      Console.WriteLine("Next value is " + ob.next); 
  } 
}