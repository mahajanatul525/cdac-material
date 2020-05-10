


/* A simple key-to-disk utility that 
   demonstrates a StreamWriter. */

using System;
using System.IO;

class KtoD
{
    public static void Main()
    {
        string str;
        FileStream fout;

        try
        {
            fout = new FileStream("test.txt", FileMode.Create);
        }
        catch (IOException exc)
        {
            Console.WriteLine(exc.Message + "Cannot open file.");
            return;
        }
        StreamWriter fstr_out = new StreamWriter(fout);

        Console.WriteLine("Enter text ('stop' to quit).");
        do
        {
            Console.Write(": ");
            str = Console.ReadLine();

            if (str != "stop")
            {
                str = str + "\r\n"; // add newline 
                try
                {
                    fstr_out.Write(str);
                }
                catch (IOException exc)
                {
                    Console.WriteLine(exc.Message + "File Error");
                    return;
                }
            }
        } while (str != "stop");

        fstr_out.Close();
    }
}























































































































