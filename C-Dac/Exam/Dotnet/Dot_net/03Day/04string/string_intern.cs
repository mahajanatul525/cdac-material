using System;
using System.Text;
namespace String_Intern_Test
{
    class Program
    {
        static void Main(string[] args)
        {
            // Compile Time Interning 
            var myInternedString = "This string is interned at compile time";
            Console.WriteLine(String.IsInterned(myInternedString)
            == null ? "NO" : "YES"); // shows YES 
            // Runtime Interning 
            // IMPORTANT: Don't use StringBuilder to concatenate strings like this 
            // I've used StringBuilder to avoid creating a string literal which would 
            // be automatically interned. 
            StringBuilder myStringBuilder = new StringBuilder();
            myStringBuilder.Append("This is going to be");
            myStringBuilder.Append(" interned soon!");
            var myString = myStringBuilder.ToString();
            Console.WriteLine(String.IsInterned(myString)
            == null ? "NO" : "YES"); // shows NO 
            String.Intern(myString);
            Console.WriteLine(String.IsInterned(myString)
            == null ? "NO" : "YES"); // shows YES 
        }
    }
}
