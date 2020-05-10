#include<iostream.h>
class MyClass
{
private:
	int num;
public:
	MyClass(int k)
	{
		num=k;
	}
	MyClass()
	{
		num=0;
	}
	void disp()
	{
		cout<<endl<<num<<endl;
	}
	friend MyClass operator+(MyClass &,MyClass &);
};
MyClass operator+(MyClass &k,MyClass &j)
	{
		MyClass temp;
		temp.num=k.num+j.num;
		return temp;
	}
void main()
{
	MyClass m1(25);
	MyClass m2(35);
	m1.disp();
	m2.disp();
	MyClass m3;
	m3=m1+m2;
	//m3=operator+(m1,m2);
	m3.disp();
}