/* In the following code, even after ptr points to sub
it invokes "base disp". This is because by default type of the pointer is considered while method invocation and not the content. */

#include<iostream>
using namespace std;
class base
{
public:
	void disp()
	{
		cout<<"base disp"<<endl;
	}
};
class sub:public base
{
public:
	void disp()
	{
		cout<<"sub disp"<<endl;
	}
};

int main()
{
	base *ptr=new base;
	ptr->disp();
	ptr=new sub;    // upcasting
	ptr->disp();
	return 0;
}








