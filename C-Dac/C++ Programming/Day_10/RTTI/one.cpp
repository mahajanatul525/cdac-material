#include<iostream>
#include<typeinfo>
using namespace std;
class myclass1{};
class myclass2{};
void main()
{
	int i,j;
	float f;
	char *p;
	myclass1 m1;
	myclass2 m2;
	cout<<endl<<typeid(i).name()<<endl;
	cout<<endl<<typeid(j).name()<<endl;
	cout<<endl<<typeid(p).name()<<endl;
	cout<<endl<<typeid(m1).name()<<endl;
	cout<<endl<<typeid(m2).name()<<endl;
	if(typeid(i)==typeid(m1))
	{
		cout<<endl<<"they are equal\n";
	}
	else
	{
		cout<<endl<<"they are not equal\n";
	}
}
	