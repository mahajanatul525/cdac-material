// Demonstrate typeof.
using System;
using System.IO;
class UseTypeof {
static void Main() {
Type t = typeof(StreamReader);

Console.WriteLine(t.FullName);

if(t.IsClass) Console.WriteLine("Is a class.");


if(t.IsAbstract) Console.WriteLine("Is abstract.");
else Console.WriteLine("Is concrete.");
}
}


/*
This program outputs the following:
System.IO.StreamReader
Is a class.
Is concrete.*/