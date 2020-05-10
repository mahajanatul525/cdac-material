/*
static_cast does not check information stored in virtual table. Hence
u should not use it for downcast.
*/
#include<iostream>
using namespace std;
class base
{
public:
	virtual void disp()
	{
		cout<<endl<<"in base disp\n";
	}
	
};
class sub1:public base
{
public:
	void disp()
	{
		cout<<endl<<"in sub1 disp\n";
	}
	void print1()
	{
		cout<<endl<<"in print1\n";
	}
};
void main()
{
	base *b;
	sub1 s1,*s2;
	b=&s1;
//	b=new base;
	b->disp();
//	s2=static_cast<sub1*>(b); // it will not check vtable info
	s2=dynamic_cast<sub1*>(b); 
	if(s2!=NULL)
	{
	s2->disp();
	s2->print1();
	}
	cout<<s2<<endl;
}