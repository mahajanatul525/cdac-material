// Demonstrate MemoryStream. 
 
using System; 
using System.IO; 
   
class MemStrDemo {   
  static void Main() {   
    byte[] storage = new byte[255]; 
 
    // Create a memory-based stream. 
    MemoryStream memstrm = new MemoryStream(storage); 
 
    // Wrap memstrm in a reader and a writer. 
    StreamWriter memwtr = new StreamWriter(memstrm); 
    StreamReader memrdr = new StreamReader(memstrm); 
 
    // Write to storage, through memwtr. 
    for(int i=0; i < 10; i++) 
       memwtr.WriteLine("byte [" + i + "]: " + i); 
 
    // Put a period at the end. 
    memwtr.WriteLine("."); 
 
    memwtr.Flush(); 
 
    Console.WriteLine("Reading from storage directly: "); 
 
    // Display contents of storage directly. 
    foreach(char ch in storage) { 
      if (ch == '.') break; 
      Console.Write(ch); 
    } 
 
    Console.WriteLine("\nReading through memrdr: "); 
 
    // Read from memstrm using the stream reader. 
    memstrm.Seek(0, SeekOrigin.Begin); // reset file pointer  
 
    string str = memrdr.ReadLine(); 
    while(str != null) { 
      str = memrdr.ReadLine(); 
      if(str.CompareTo(".") == 0) break; 
      Console.WriteLine(str); 
    }  
  }  
}
