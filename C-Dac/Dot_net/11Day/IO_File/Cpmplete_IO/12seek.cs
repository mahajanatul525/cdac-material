// Demonstrate random access. 
 
using System; 
using System.IO;  
 
class RandomAccessDemo { 
  static void Main() { 
    FileStream f; 
    char ch;
 
    try { 
      f = new FileStream("random.dat", FileMode.Create); 
    } 
    catch(IOException exc) { 
      Console.WriteLine("Cannot Open File"); 
      Console.WriteLine(exc.Message); 
      return ; 
    } 
 
    // Write the alphabet.  
    for(int i=0; i < 26; i++) { 
      try { 
        f.WriteByte((byte)('A'+i)); 
      }  
      catch(IOException exc) { 
        Console.WriteLine("Error Writing File"); 
        Console.WriteLine(exc.Message); 
        f.Close(); 
        return ; 
      } 
    } 
 
    try{


      // Now, read every other value. 
      Console.WriteLine("Here is every other value: "); 
      for(int i=0; i < 26; i += 2) { 
        f.Seek(i, SeekOrigin.Begin); // seek to ith character 
        ch = (char) f.ReadByte(); 
        Console.Write(ch + " "); 
      } 
    }  
    catch(IOException exc) { 
      Console.WriteLine("Error Reading or Seeking"); 
      Console.WriteLine(exc.Message); 
    } 
  
    Console.WriteLine(); 
    f.Close(); 
  } 
}
