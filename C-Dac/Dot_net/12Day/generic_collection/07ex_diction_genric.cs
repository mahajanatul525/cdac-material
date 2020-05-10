// Demonstrate the generic Dictionary<TK, TV> class. 
using System;  
using System.Collections.Generic;  
  class GenDictionaryDemo {  
  static void Main() {  
    // Create a Dictionary that holds employee 
    // names and their corresponding salaries. 
    Dictionary<string, double> dict = new Dictionary<string, double>();  
   
    // Add elements to the collection. 
    dict.Add("B", 73000);  
    dict.Add("S", 59000);  
    dict.Add("P", 45000);  
    dict.Add("F", 99000);  
  
    // Get a collection of the keys (names). 
    ICollection<string> c = dict.Keys;  
  
    // Use the keys to obtain the values (salares). 
    foreach(string str in c)  
  Console.WriteLine("{0}, Salary: {1:C}", str, dict[str]);  
  }  
}

