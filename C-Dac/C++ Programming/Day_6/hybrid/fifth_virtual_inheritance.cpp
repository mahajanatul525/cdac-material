#include<iostream.h>
#pragma pack(1)
class GP
{
private:
	char ch;
	double dd;
public:
	GP(int k)
	{
		cout<<endl<<"in GP param const\t"<<k<<endl;
	}
	GP()
	{
		cout<<endl<<"in GP def const\n";
	}

	~GP()
	{
		cout<<"\nin GP dest\n";
	}
};
class Parent1:virtual GP
{
private:
	int num1;
	float fl;
	public:
		Parent1():GP(8)
	{
		cout<<endl<<"in Parent1 def const\n";
	}
	~Parent1()
	{
		cout<<"\nin Parent1 dest\n";
	}
};
class Parent2:virtual GP
{
private:
	char ch1;
	float fl1;
	public:
		Parent2():GP(5)
	{
		cout<<endl<<"in Parent2 def const\n";
	}
	~Parent2()
	{
		cout<<"\nin Parent2 dest\n";
	}
};
class Child:Parent1,Parent2
{
private:
	int num2;
	public:
		Child():GP(2)
	{
		cout<<endl<<"in Child def const\n";
	}
	~Child()
	{
		cout<<"\nin Child dest\n";
	}
};
void main()
{
	Child c;
	cout<<"Sizeof Child is\t"<<sizeof(c)<<endl;
}
