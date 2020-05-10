using System; 
 
// Declare a delegate.  
delegate string strMod(string str); 
 
class DelegateTest { 
  // Replaces spaces with hyphens. 
  static string replaceSpaces(string a) { 
    Console.WriteLine("Replaces spaces with hyphens."); 
    return a.Replace(' ', '-'); 
  }  
 
  // Remove spaces. 
  static string removeSpaces(string a) { 
    string temp = ""; 
    int i; 
    Console.WriteLine("Removing spaces."); 
    for(i=0; i < a.Length; i++) 
      if(a[i] != ' ') temp += a[i]; 
 
    return temp; 
  }  
 
  // Reverse a string. 
  static string reverse(string a) { 
    string temp = ""; 
    int i, j; 
 
    Console.WriteLine("Reversing string."); 
    for(j=0, i=a.Length-1; i >= 0; i--, j++) 
      temp += a[i]; 
 
    return temp; 
  } 
     
  public static void Main() {  
    // Construct a delegate. 
    strMod strOp = new strMod(replaceSpaces); 
    string str; 
 
    // Call methods through the delegate. 
    str = strOp("This is a test."); 
    Console.WriteLine("Resulting string: " + str); 
    Console.WriteLine(); 
      
    strOp = new strMod(removeSpaces); 
    str = strOp("This is a test."); 
    Console.WriteLine("Resulting string: " + str); 
    Console.WriteLine(); 
 
    strOp = new strMod(reverse); 
    str = strOp("This is a test."); 
    Console.WriteLine("Resulting string: " + str); 
  } 
}
