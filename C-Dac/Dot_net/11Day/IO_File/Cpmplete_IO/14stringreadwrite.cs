// Demonstrate StringReader and StringWriter 
 
using System; 
using System.IO; 
   
class StrRdrDemo {   
  static void Main() {   
    // Create a StringWriter 
    StringWriter strwtr = new StringWriter(); 
 
    // Write to StringWriter. 
    for(int i=0; i < 10; i++) 
      strwtr.WriteLine("This is i: " + i); 
 
    // Create a StringReader 
    StringReader strrdr = new StringReader(strwtr.ToString()); 
 
    // Now, read from StringReader. 
    string str; 
        //= strrdr.ReadLine();
    while (strrdr.ReadLine() != null)
    { 
      str = strrdr.ReadLine(); 
      Console.WriteLine(str); 
    }  
  }  
}
