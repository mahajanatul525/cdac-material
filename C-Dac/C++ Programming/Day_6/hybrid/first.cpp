#include<iostream.h>
#pragma pack(1)
class Gp
{
private:
	int num1;
public:
	Gp()
	{
		cout<<"Gp no-arg constr"<<endl;
	}
	void disp1()
	{
		cout<<"Gp disp1"<<endl;
	}
	~Gp()
	{
		cout<<"Gp dest"<<endl;
	}
	
};
class P1:public Gp
{
private:
	int num2;
public:
	P1()
	{
		cout<<"P1 no-arg const"<<endl;
	}
	~P1()
	{
		cout<<"P1 dest"<<endl;
	}
};
class P2:public Gp
{
private:
	int num3;
public:
	P2()
	{
		cout<<"P2 no-arg const"<<endl;
	}
	~P2()
	{
		cout<<"P2 dest"<<endl;
	}
};
class child:public P1,public P2
{
private:
	int num4;
public:
	child()
	{
		cout<<"child no-arg const"<<endl;
	}
	~child()
	{
		cout<<"child dest"<<endl;
	}
};
void main()
{
	child c;
	
//	c.disp1(); // ambiguity error
	
	cout<<"Size of child is\t"<<sizeof(c)<<endl;
}

