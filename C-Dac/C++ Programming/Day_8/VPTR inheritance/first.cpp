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
};
void main()
{
	sub s;
	cout<<"Sizeof s is\t"<<sizeof(s)<<endl;  // ans 4
}
