#include<iostream>
#include<vector>
using namespace std;
class MyClass
{
	int num;
public:
	MyClass()
	{
		num=0;
	}
	MyClass(int k)
	{
		num=k;
		cout<<endl<<"In parameterized const\n";
	}
	void disp()
	{
		cout<<endl<<num<<endl;
	}
};
void main()
{
	vector<MyClass> v1;
	int i=0,j=10;
	for(i=0;i<2;i++,j+=10)
	{
		v1.push_back(MyClass(j));
	}
	for(i=0;i<v1.size();i++)
	{
		v1[i].disp();
	}
}





