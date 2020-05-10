#include<iostream.h>
class myclass
{
public:
	virtual void disp1()
	{
		cout<<endl<<"in disp1\n";
	}
	virtual void disp2()
	{
		cout<<endl<<"in disp2\n";
	}
	void trial()
	{
		int *ptr1=(int*)this;//address of the object
		ptr1=(int*)*ptr1;//address of the VTABLE
		ptr1=(int*)*ptr1;//address of the first virtual function
		void (*fun1)();
		fun1=(void (*)())ptr1;
		fun1();
		int *ptr2=(int*)this;//address of the object
		ptr2=(int *)*ptr2;//address of the VTABLE
		ptr2++;//increment so that pointer will point to the next 
		// 4 byte chunk
		ptr2=(int*)*ptr2;//address of second virtual function
		void (*fun2)();
		fun2=(void(*)())ptr2;
		fun2();
	}
};
void main()
{
	myclass m;
	m.trial();
}



