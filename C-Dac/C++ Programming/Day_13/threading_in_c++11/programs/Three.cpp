#include<iostream>
#include <thread>
#include<conio.h>
using namespace std;

void disp(int a,int b)
{
	cout<<a<<"\t"<<b<<endl;
}

int main()
{
	int num1=10,num2=20;
	thread t1(disp,num1,num2);
	t1.join();
	cout<<"inside main function"<<endl;
	getch();
	return 0;
}
