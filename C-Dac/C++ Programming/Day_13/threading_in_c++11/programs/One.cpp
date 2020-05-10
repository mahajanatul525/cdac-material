/*
we have a new Standard C++ Library header #include <thread> in which the functions and classes for threads are declared
*/

#include<iostream>
#include <thread>
using namespace std;

/*
code for the thread "t1" is writing a message in a separate function i.e. "call_from_thread()". This is because every thread has to have an initial function where the new thread of execution begins. The main() function is the initial thread in an application but other threads are specified in the constructor of a std::thread object t1. For the thread object t1, its initial function is "call_from_thread()". Actually, the new thread is started by constructing t1 object that specifies the task "call_from_thread()" to run on that thread. 

In the end, the program creates two threads: 

1.	initial thread that starts at main() 
2.	and the new thread that starts at "call_from_thread()".


Starting Threads

Threads are launched by constructing a std::thread class that specifies the task to run on that thread. The task function runs on its own thread until it returns, and then the thread exits. Actually, starting a thread using the C++ Thread Library is to construct a std::thread object:
void task();
std::thread t(task);
The std::thread works with any callable. 

*/

void call_from_thread() 
{
        cout << "Hello, World" <<endl;
}

int main() 
{
       //Launch a thread
      thread t1(call_from_thread);
	  t1.join();
	 
	 
	  cout<<"inside main function"<<endl;
      return 0;
}


After the new thread has been launched at 
std::thread t1(call_from_thread);
the initial thread continues execution. If the initial main thread didn't wait for the new thread to finish, it would continue to the end of main() and end the program, possibly before the new thread have had a chance to run.

This is why we need to call join(). This forces the calling thread (in main()) to wait for the thread associated with the std::thread object t1. With the join(), the main tread will wait until t1 to finish.

