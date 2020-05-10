#include<iostream>
#pragma pack(1)
using namespace std;
class base1
{
public:
	virtual void disp1()
	{
			cout<<"in disp1"<<endl;
	}
};
class base2
{
public:
	virtual void disp2()
	{
		cout<<"in disp2"<<endl;
	}
};
class child:public base1,public base2
{
public:
	virtual void disp3()
	{
		cout<<"disp3"<<endl;
	}
	void trial()
	{
		/*int *ptr;
		ptr=(int *)this; // address of object
		ptr=(int *)*ptr; // address of first vtable
		ptr=(int *)*ptr; // address of base1 disp1 function
		void (*fun)()=(void (*)())ptr;
		fun();*/

		/*int *ptr;
		ptr=(int *)this; // address of object
		ptr=(int *)*ptr; // address of first vtable
		ptr++;
		ptr=(int *)*ptr; // address of sub disp3 function
		void (*fun)()=(void (*)())ptr;
		fun();*/

		/*int *ptr;
		ptr=(int *)this; // address of object
		ptr++;
		ptr=(int *)*ptr; // address of second vtable
		ptr=(int *)*ptr; // address of base2 disp2 function
		void (*fun)()=(void (*)())ptr;
		fun();*/
	}
};
void main()
{
	child c;
	cout<<sizeof(c)<<endl;
	c.trial();
	
}
	




