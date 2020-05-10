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
	MyClass operator+(MyClass &k)
	{
		MyClass temp;
		temp.num=this->num+k.num;
		return temp;
	}
	
};
void main()
{
	MyClass m1(25);
	MyClass m2(35);
	m1.disp();
	m2.disp();
	MyClass m3;
	m3=m1+m2;
	//m3=m1.operator+(m2);
	m3.disp();
}