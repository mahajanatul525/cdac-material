#include<iostream.h>
class base
{
public:
	virtual void disp()
	{
		cout<<"base disp"<<endl;
	}
};
class sub:public base
{
public:
	virtual void disp()
	{
	}
	virtual void disp1()
	{
	}
};
void main()
{
	sub s;
	cout<<"Sizeof s is\t"<<sizeof(s)<<endl;  // ans 4
}







