// Invoke methods using reflection. 

using System;
using System.Reflection;

class MyClass
{
    int x;
    int y;

    public MyClass(int i, int j)
    {
        x = i;
        y = j;
    }

    public int sum()
    {
        return x + y;
    }

        public void set(int a, int b)
    {
        Console.Write("Inside set(int, int). ");
        x = a;
        y = b;
        
    }



    public void show()
    {
        Console.WriteLine("Values are x: {0}, y: {1}", x, y);
    }
}

class InvokeMethDemo
{
    public static void Main()
    {
        Type t = typeof(MyClass);
        MyClass reflectOb = new MyClass(10, 20);
        int val;

        Console.WriteLine("Invoking methods in " + t.Name);
        Console.WriteLine();
        MethodInfo[] mi = t.GetMethods();

        // Invoke each method. 
        foreach (MethodInfo m in mi)
        {
            // Get the parameters 
            ParameterInfo[] pi = m.GetParameters();

            if (m.Name.CompareTo("set") == 0 && pi[0].ParameterType == typeof(int))
            {
                object[] args = new object[2];
                args[0] = 9;
                args[1] = 18;
                m.Invoke(reflectOb, args);
            }

            else if (m.Name.CompareTo("sum") == 0)
            {
                val = (int)m.Invoke(reflectOb, null);
                Console.WriteLine("sum is " + val);
            }

            else if (m.Name.CompareTo("show") == 0)
            {
                m.Invoke(reflectOb, null);
            }
        }
    }
}