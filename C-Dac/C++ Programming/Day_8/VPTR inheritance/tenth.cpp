#include<iostream>
using namespace std;
class base
{
public:
	virtual void disp()
	{
		cout<<"base disp"<<endl;
	}
};
class base1
{
public:
	virtual void disp1()
	{
		cout<<"in disp1"<<endl;
	}
};
class sub:public base,public base1
{
public:
	virtual void disp2()
	{
		cout<<"in disp2"<<endl;
	}
};
class ch:sub
{
public:
	void perform()
	{
		int *ptr=(int*)this;
		ptr=(int *)*ptr;
		ptr++; 
		ptr=(int *)*ptr; // sub disp2
		void (*f)()=(void (*)())ptr;
		f();
	}

	virtual void fun()
	{
		cout<<"fun"<<endl;
	}
};
void main()
{
	sub s;
	cout<<"Sizeof s is\t"<<sizeof(s)<<endl;  // ans 8
	ch ob;
	cout<<"Size of ob is\t"<<sizeof(ob)<<endl; // ans 8
	ob.perform();
}
