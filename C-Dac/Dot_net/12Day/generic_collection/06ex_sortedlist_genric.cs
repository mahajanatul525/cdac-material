// Demonstrate a SortedList<TK, TV>.  
  
using System;  
using System.Collections.Generic;  
  
class GenSLDemo {  
  static void Main() {  
    // Create a sorted SortedList<T> for 
    // employee names and salaries. 
    SortedList<string, double> sl =  
      new SortedList<string, double>();  
       
    // Add elements to the collection. 
    sl.Add("Butler, John", 73000);  
    sl.Add("Swartz, Sarah", 59000);  
    sl.Add("Pyke, Thomas", 45000);  
    sl.Add("Frank, Ed", 99000);  
 
    // Get a collection of the keys.  
    ICollection<string> c = sl.Keys;  
  
    // Use the keys to obtain the values.  
    foreach(string str in c)  
      Console.WriteLine("{0}, Salary: {1:C}", str, sl[str]);  
  
    Console.WriteLine();  
  }  
}

