#include<iostream.h>
class MyClass
{
private:
	int num;
public:
	MyClass()
	{
		num=0;
	}
	MyClass(int k)
	{
		num=k;
	}
	void disp()
	{
		cout<<endl<<num<<endl;
	}
	MyClass operator++(int x) // for postfix operator
	{
		MyClass temp;
		temp.num=this->num++;
		return temp;
	}
//	friend MyClass operator++(MyClass &,int);
};
/*MyClass operator++(MyClass &m,int x)
{
	MyClass temp;
	temp.num=m.num++;
	return temp;
}*/

void main()
{
	MyClass m1(20);
	MyClass m2;
	m2=m1++;
	m2.disp();
	m1.disp();
}