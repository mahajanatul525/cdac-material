// Write to a file. 
 
using System; 
using System.IO;  
 
class WriteToFile { 
  static void Main(string[] args) { 
    FileStream fout; 
 
    // Open output file. 
    try { 
      fout = new FileStream("test.txt", FileMode.Create); 
    } catch(IOException exc) { 
      Console.WriteLine("Cannot Open File"); 
      Console.WriteLine(exc.Message); 
      return; 
    } 
 
    // Write the alphabet to the file. 
    try { 
      for(char c = 'A'; c <= 'Z'; c++) 
        fout.WriteByte((byte) c); 
    } catch(IOException exc) { 
      Console.WriteLine("Error Writing File"); 
      Console.WriteLine(exc.Message); 
    } 
 Console.WriteLine("data written");
Console.ReadKey();
    fout.Close(); 
  } 
}












































