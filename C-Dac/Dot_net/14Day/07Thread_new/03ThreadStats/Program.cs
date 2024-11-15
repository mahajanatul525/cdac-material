﻿using System;
using System.Threading;

class MyThread
{
    public int Count;
    public Thread Thrd;

    public MyThread(string name)
    {
        Count = 0;
        Thrd = new Thread(this.Run);
        Thrd.Name = name; // set the name of the thread 
        Thrd.Start(); // start the thread 
    }

    // Entry point of thread. 
    void Run()
    {
        Console.WriteLine(Thrd.Name + " starting.");

        do
        {
            Thread.Sleep(500);
            Console.WriteLine("In " + Thrd.Name +
                              ", Count is " + Count);
            Count++;
        } while (Count < 10);

        Console.WriteLine(Thrd.Name + " terminating.");
    }
}
// Use Join() to wait for threads to end.
class JoinThreads
{
    static void Main()
    {
        Console.WriteLine("Main thread starting.");
        // Construct three threads.
        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");
        mt1.Thrd.Join();
        Console.WriteLine("Child #1 done.");
        mt2.Thrd.Join();
        Console.WriteLine("Child #2 done.");
        mt3.Thrd.Join();
        Console.WriteLine("Child #3done.");
        Console.WriteLine("Main thread ending.");
    }
}

