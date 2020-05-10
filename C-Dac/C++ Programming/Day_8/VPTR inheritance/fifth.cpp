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
	void invoker()
	{
		int *ptr=(int*)this;
		ptr=(int*)*ptr;
		ptr++;
		ptr=(int*)*ptr; // address of sub disp2
		void (*fun)()=(void(*)())ptr;
		fun();
	}
};
void main()
{
	sub s;
	cout<<"Sizeof s is\t"<<sizeof(s)<<endl;  // ans 8
	s.invoker();
}
