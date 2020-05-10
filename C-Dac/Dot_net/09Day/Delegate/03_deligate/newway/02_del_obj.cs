//Delegates can refer to instance methods, too. 
  
using System; 
 
// Declare a delegate.  
delegate string strMod(string str); 

class StringOps {
  // Replaces spaces with hyphens. 
  public string replaceSpaces(string a) { 
    Console.WriteLine("Replaces spaces with hyphens."); 
    return a.Replace(' ', '-'); 
  }  
 
  // Remove spaces. 
  public string removeSpaces(string a) { 
    string temp = ""; 
    int i; 
 
    Console.WriteLine("Removing spaces."); 
    for(i=0; i < a.Length; i++) 
      if(a[i] != ' ') temp += a[i]; 
 
    return temp; 
  }  
 
  // Reverse a string. 
  public string reverse(string a) { 
    string temp = ""; 
    int i, j; 
 
    Console.WriteLine("Reversing string."); 
    for(j=0, i=a.Length-1; i >= 0; i--, j++) 
      temp += a[i]; 
 
    return temp; 
  } 
} 
 
class DelegateTest {   
  public static void Main() { 
    StringOps so = new StringOps(); // create an instance of StringOps
 
    // Construct a delegate. 
    strMod strOp = so.replaceSpaces; 
    string str; 
 
    // Call methods through delegates. 
    str = strOp("This is a test."); 
    Console.WriteLine("Resulting string: " + str); 
    Console.WriteLine(); 
      
    strOp = so.removeSpaces; 
    str = strOp("This is a test."); 
    Console.WriteLine("Resulting string: " + str); 
    Console.WriteLine(); 
 
    strOp = so.reverse; 
    str = strOp("This is a test."); 
    Console.WriteLine("Resulting string: " + str); 
  } 
}
