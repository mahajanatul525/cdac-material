#include<iostream.h>
template<class T>
void add(T a,T b)
{
	cout<<endl<<a+b<<endl;
}

void add(int a,int b)
{
	cout<<endl<<"in overloaded add fun.\n";
	if(a!=b)
	{
		cout<<a+b;
	}
	else
	{
		cout<<"\ncannot perform add,both are same\n";
	}
}
void main()
{
	add(4,5);
	add(45.89,32.60);
	add('a','b');
}







