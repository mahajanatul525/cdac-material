/*
In this case, the function object, t, is associated with the newly created thread of execution and invoked t(tsk) from there (actually, in operator()). 

*/


#include<iostream>
#include <thread>
using namespace std;

void foo()
{
	 std::cout << "inside foo()\n"; 
}
void bar()
{ 
	std::cout << "inside bar()\n"; 
}

class task
{
public:
	task() 
	{ 
		cout << "task constructor\n"; 
	}
	void operator()() const
	{
		cout << "operator()\n";
		foo();
		bar();
	}
};

int main()
{
	task tsk;
	thread t(tsk);
	t.join();
	cout<<"inside main function"<<endl;
	return 0;
}

/*
output:

task constructor
operator()
inside foo()
inside bar()
inside main function

*/
