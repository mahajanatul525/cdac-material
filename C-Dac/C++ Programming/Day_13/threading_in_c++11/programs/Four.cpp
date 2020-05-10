#include<iostream>
#include <thread>
using namespace std;


void disp()
{
	for(int i=0;i<10;i++)
	{
		cout<<i<<endl;
	}
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
