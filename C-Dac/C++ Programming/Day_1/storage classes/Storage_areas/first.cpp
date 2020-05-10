#include<iostream.h>
int num=10;
int k;
void main()
{
	void fun();
	int var=20;
	fun();
}
void fun()
{
	static int val;
	static int val1=50;
	for(int i=0;i<4;i++)
	{
		cout<<"hello\t"<<i<<endl;
	}
	cout<<"in fun\t"<<endl;
}

