// Demonstrate a two-dimensional array.  
 
using System; 
 
class TwoD {  
  static void Main() {  
    int r, c,n=0; 
    int[,] table = new int[3, 4];  
  
    for(r=0; r < 3; ++r) {  
      for(c=0; c < 4; ++c) {  
        table[r,c] = n++;;  
        Console.Write(table[r,c] + " ");  
      }  
      Console.WriteLine(); 
    }  
  } 
}
