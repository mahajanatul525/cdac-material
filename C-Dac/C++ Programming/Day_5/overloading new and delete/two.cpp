#include<iostream>
#include<malloc.h>
using namespace std;
	void* operator new(unsigned int k)
	{
		cout<<"in operator new\t"<<k<<endl;
		void *ptr=malloc(k);
		return ptr;
	}
	void* operator new[](unsigned int k)
	{
		cout<<"in operator new[]\t"<<k<<endl;
		void *ptr=malloc(k);
		return ptr;
	}
class myclass
{
private:
	int num;
public:
	myclass()
	{
		num=0;
		cout<<"in myclass def const"<<endl;
	}
	void* operator new(unsigned int k)
	{
		cout<<"in operator new\t"<<k<<endl;
		void *ptr=malloc(k);
		return ptr;
	}
	void* operator new[](unsigned int k)
	{
		cout<<"in operator new[]\t"<<k<<endl; 
		void *ptr=malloc(k);
		return ptr;
	}
	void operator delete(void *ptr)
	{
		cout<<"in operator delete"<<endl;
		free(ptr);
	}
	void operator delete[](void *ptr)
	{
		cout<<"in operator delete[]"<<endl;
		free(ptr);
	}
	myclass(int num)
	{
		this->num=num;
		cout<<"in param const"<<endl;
	}
	void disp()
	{
		cout<<num<<endl;
	}
	~myclass()
	{
		cout<<"in myclass dest"<<endl;
	}
};
void main()
{
	myclass *m1=new myclass(10);
	m1->disp();
	delete m1;

	myclass *m2=new myclass;
	m2->disp();
	delete m2;

	myclass *m3=new myclass[3];
	for(int i=0;i<3;i++)
	{
		m3[i].disp();
	}
	delete []m3;
	int *ptr=new int;
	*ptr=200;
	cout<<*ptr<<endl;
	char *ptr1=new char[20];

}

























