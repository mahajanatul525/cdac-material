/* Display a text file. 
 
   To use this program, specify the name of the file that you 
   want to see.  For example, to see a file called TEST.CS, 
   use the following command line. 
 
   ShowFile TEST.CS 
*/ 
 
using System; 
using System.IO;  
 
class ShowFile { 
  static void Main(string[] args) { 
    int i; 
    FileStream fin; 
 
    if(args.Length != 1) {  
      Console.WriteLine("Usage: ShowFile File"); 
      return; 
    } 
 
    try { 
      fin = new FileStream(args[0], FileMode.Open); 
    } catch(IOException exc) { 
      Console.WriteLine("Cannot Open File"); 
      Console.WriteLine(exc.Message); 
      return; 
    } 
 
    // Read bytes until EOF is encountered. 
    do { 
      try { 
        i = fin.ReadByte(); 
      } catch(IOException exc) { 
        Console.WriteLine("Error Reading File"); 
        Console.WriteLine(exc.Message); 
        break; 
      } 
      if(i != -1) Console.Write((char) i); 
    } while(i != -1); 
 
    fin.Close(); 
  } 
}