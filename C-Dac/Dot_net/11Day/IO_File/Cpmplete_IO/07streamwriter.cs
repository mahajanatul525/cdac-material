
// Open a file using StreamWriter. 
 
using System; 
using System.IO; 
  
class KtoD { 
  static void Main() { 
    string str; 
    StreamWriter fstr_out; 
 
    try { 
      fstr_out = new StreamWriter("test.txt"); 
    } 
    catch(IOException exc) { 
      Console.WriteLine("Cannot Open File"); 
      Console.WriteLine(exc.Message); 
      return ; 
    } 
 
    Console.WriteLine("Enter text ('stop' to quit)."); 
    do { 
      Console.Write(": "); 
      str = Console.ReadLine(); 
 
      if(str != "stop") { 
        str = str + "\r\n"; // add newline 
        try { 
          fstr_out.Write(str); 
        } catch(IOException exc) { 
          Console.WriteLine("Error Writing File"); 
          Console.WriteLine(exc.Message); 
          break; 
        } 
      } 
    } while(str != "stop"); 
 
    fstr_out.Close(); 
  } 
}