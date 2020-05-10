/*

The most commonly used synchronization primitive is the mutex. Prior to accessing resources that can be simultaneously modified by different threads, a thread must lock the mutex associated with the shared resource and when the thread is no longer operating on shared data, it must be unlocked. If a mutex is already locked and another thread tries to lock it again, it must wait until the thread that has successfully locked the mutex unlocks it.

*/


#include<iostream>
#include <thread>
#include<mutex>
using namespace std;

mutex m;
void disp()
{
	m.lock();
	for(int i=0;i<10;i++)
	{
		cout<<i<<endl;
	}
	m.unlock();
}

int main()
{
	thread t1(disp);
	thread t2(disp);
	t1.join();
	t2.join();
	cout<<"inside main function"<<endl;
	return 0;
}


/*

output:

0
1
2
3
4
5
6
7
8
9
0
1
2
3
4
5
6
7
8
9

inside main function

*/