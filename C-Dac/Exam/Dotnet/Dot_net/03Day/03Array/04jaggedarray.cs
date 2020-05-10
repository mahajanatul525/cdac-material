// Demonstrate jagged arrays. 
 
using System; 
 
class Jagged {  
  static void Main() {  
    int[][] jagged = new int[2][];  
    jagged[0] = new int[4];  
    jagged[1] = new int[3];  
  
    int i; 
 
    // Store values in first array. 
    for(i=0; i < 4; i++)   
      jagged[0][i] = i;  
     // Store values in second array. 
    for(i=0; i < 3; i++)   
      jagged[1][i] = i;  
     // Store values in third array. 
    for(i=0; i < 5; i++)   
      jagged[2][i] = i;  
  
    // Display values in first array. 
    for(i=0; i < 4; i++)   
      Console.Write(jagged[0][i] + " ");  
 
    Console.WriteLine(); 
 
    // Display values in second array. 
    for(i=0; i < 3; i++)   
      Console.Write(jagged[1][i] + " ");  
 
    Console.WriteLine(); 
 
    Console.WriteLine(); 
  }  
}