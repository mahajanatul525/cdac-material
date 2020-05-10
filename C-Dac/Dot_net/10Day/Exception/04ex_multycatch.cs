// Use multiple catch statements. 
 
using System; 
 
class ExcDemo4 { 
  public static void Main() { 
    // Here, numer is longer than denom. 
    int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 }; 
    int[] denom = { 2, 0, 4, 4, 0, 8 }; 
 
    for(int i=0; i < numer.Length; i++) {
        try
        {
            Console.WriteLine(numer[i] + " / " +
                               denom[i] + " is " +
                               numer[i] / denom[i]);
        }
        catch (DivideByZeroException)
        {
            // catch the exception 
            Console.WriteLine("Can't divide by Zero!");
        }
        catch (IndexOutOfRangeException)
        {
            // catch the exception 
            Console.WriteLine("No matching element found.");
        }
        catch (Exception e)
        {

            Console.WriteLine("\n*** Error! ***");
            Console.WriteLine("Method: {0}", e.TargetSite);
            Console.WriteLine("Message: {0}", e.Message);
            Console.WriteLine("Source: {0}", e.Source);
            Console.WriteLine("Stack: {0}", e.StackTrace);
        }
    } 

  } 
}

