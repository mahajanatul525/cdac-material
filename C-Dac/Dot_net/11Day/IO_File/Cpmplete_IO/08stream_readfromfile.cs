// A simple disk-to-screen utility that demonstrates a FileReader. 
 
using System; 
using System.IO;  
 
class DtoS { 
  static void Main() { 
    FileStream fin; 
    string s; 
 
    try { 
      fin = new FileStream("test.txt", FileMode.Open); 
    } 
    catch(IOException exc) { 
      Console.WriteLine("Error Opening File"); 
      Console.WriteLine(exc.Message); 
      return ; 
    }  
 //   StreamReader fstr_in = new StreamReader(@"D:\practice_MVC\ConsoleApplication9\ConsoleApplication9\TextFile1.txt");
    StreamReader fstr_in = new StreamReader(fin); 
 
    try { 
      while((s = fstr_in.ReadLine()) != null) { 
        Console.WriteLine(s); 
      } 
    } catch(IOException exc) { 
      Console.WriteLine("Error Reading File"); 
      Console.WriteLine(exc.Message); 
    } 
 
    fstr_in.Close(); 
  } 

/*while(!fstr_in.EndOfStream) {
s = fstr_in.ReadLine();
Console.WriteLine(s);
}*/
}
