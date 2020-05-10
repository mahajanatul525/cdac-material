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
/*	bool operator>(MyClass &k)
	{
		return this->num>k.num;
	}*/
	friend bool operator>(MyClass&,MyClass&);
};
	bool operator>(MyClass &j,MyClass &k)
	{
		return j.num>k.num;
	}
void main()
{
	MyClass m1(25);
	MyClass m2(35);
	m1.disp();
	m2.disp();
	if(m1>m2)
	{
		cout<<endl<<"m1 is great\n";
	}
	else 
	{
		cout<<endl<<"m2 is great\n";
	}
}