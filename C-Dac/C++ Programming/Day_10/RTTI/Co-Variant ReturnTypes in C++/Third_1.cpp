/*
typeid checks the type of pointer if the class is "Non-Polymorphic" i.e. it does not have any virtual or pure virtual function.

typeid can check the content of pointer, if the class is "Polymorphic" i.e. it has at least one virtual or pure virtual function.

*/

#include<iostream>
using namespace std;
class A
{
	virtual void fun()
	{
	}
};
class B:public A{};
class base
{
public:
	virtual A* disp()
	{
		cout<<"in base disp returning A*"<<endl;
		return new A();
	}
};
class sub:public base
{
public:
	B* disp()
	{
		cout<<"in sub disp returning B*"<<endl;
		return new B();
	}
};
void main()
{
	base *ptr=new sub;
	cout<<"Using Parent class Pointer"<<endl;
	A *ob=ptr->disp();

	// typeid does not check the vtable information
	if(typeid(*ob)==typeid(B))
	{
		cout<<"Content of ob is B"<<endl;
	}
	else
	{
		cout<<"Content of ob is A"<<endl;
	}
}





