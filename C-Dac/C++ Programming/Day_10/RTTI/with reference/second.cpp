#include<iostream>
#include<typeinfo.h>
using namespace std;
class base
{
public:
	virtual void disp(){}
};
class sub:public base
{
};
void main()
{
	
	sub sb;
//	base &bb=sb;
	base b;
	base &bb=b;
	sub ob;
	try
	{
	ob=dynamic_cast<sub&>(bb);
	}
	catch(bad_cast &ref)
	{
		cout<<"\nin catch block\t"<<ref.what()<<endl;
	}
	cout<<"To be continued....."<<endl;
}
	







