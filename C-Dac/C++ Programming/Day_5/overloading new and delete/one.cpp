#include<iostream.h>
#include<malloc.h>
class myclass
{
private:
	int num;
public:
	void* operator new(unsigned int k)
	{
		cout<<"in operator new\t"<<k<<endl;
		void *ptr=malloc(k);
		return ptr;
	}
	void operator delete(void *ptr)
	{
		cout<<"in operator delete"<<endl;
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
	myclass *m=new myclass(10);
	m->disp();
	delete m;
}


















