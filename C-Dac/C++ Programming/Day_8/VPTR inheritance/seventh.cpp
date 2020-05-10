#include<iostream.h>
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
};
void main()
{
	sub s;
	cout<<"Sizeof s is\t"<<sizeof(s)<<endl;  // ans 8
	ch ob;
	cout<<"Size of ob is\t"<<sizeof(ob)<<endl; // ans 8
}











