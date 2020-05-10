// when object are stored in STL ,their copies are stored
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
	void setNum(int num)
	{
		this->num=num;
	}
	void disp()
	{
		cout<<endl<<num<<endl;
	}
};
void main()
{
	vector<MyClass> v1;
	unsigned int i=0,j=10;
	MyClass m1(100),m2(200);
	v1.push_back(m1);
	v1.push_back(m2);
	m1.setNum(500);
	m2.setNum(600);
	cout<<"m1 and m2 values"<<endl;
	m1.disp();
	m2.disp();
	cout<<"vector values"<<endl;
	for(i=0;i<v1.size();i++)
	{
		v1[i].disp();
	}
}










