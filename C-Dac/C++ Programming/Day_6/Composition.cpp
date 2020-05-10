#include<iostream.h>
class one
{
private:
	int num1;
public:
	one(int k)
	{
		cout<<"\nin one const\t"<<k<<endl;
	}
	one()
	{
		cout<<"\n in def const\n";
	}
	void disp1()
	{
		cout<<endl<<"in disp1\n";
	}
	void disp2()
	{
		cout<<endl<<"in disp2\n";
	}
	void disp3()
	{
		cout<<"in disp3"<<endl;
	}
	~one()
	{
		cout<<"\n in one dest\n";
	}
};
class two
{
private:
	int num2;
	one o;
public:
	two()
	{
		cout<<"\n two const\n";
	}
	two(int k)
	{
	}
	void disp2()
	{
		cout<<endl<<"in disp2\n";
		o.disp1();
	}
	~two()
	{
		cout<<"\nin two dest\n";
	}
};
void main()
{
	two t;
	t.disp2();
	cout<<endl<<sizeof(t)<<endl;
}









