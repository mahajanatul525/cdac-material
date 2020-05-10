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
	MyClass operator+(int x) 
	{
		MyClass temp;
		temp.num=this->num+x;
		return temp;
	}
//	friend MyClass operator+(MyClass &,int);
};
/*MyClass operator+(MyClass &m,int x)
{
	MyClass temp;
	temp.num=m.num+x;
	return temp;
}*/

void main()
{
	MyClass m1(20);
	MyClass m2;
	m2=m1+20;
	m2.disp();
}