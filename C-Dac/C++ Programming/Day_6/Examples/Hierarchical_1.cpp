#include<iostream>
using namespace std;
class base
{
private:
		int num1;
protected:
		int var;
public:
	void disp1()
	{
		cout<<num1<<"\t"<<var<<endl;
	}
	base(int num1)
	{
		this->num1=num1;
		var=100;
		cout<<"base param"<<endl;
	}
	~base()
	{
		cout<<"base destr"<<endl;
	}
}; 
class sub1:protected base
{
private:
	int num2;
public:
	sub1():base(0)
	{
		cout<<"sub1 no-arg constr"<<endl;
	}
	void disp2()
	{
		disp1();
		cout<<num2<<endl;
		cout<<"var is\t"<<var<<endl; // var will come as private
	}
	~sub1()
	{
		cout<<"sub1 destr"<<endl;
	}
};
class sub2:base
{
private:
	int num3;
public:
	sub2(int num3):base(30)
	{
		this->num3=num3;
		cout<<"sub2 param constr"<<endl;
	}
	void disp3()
	{
		cout<<num3<<endl;
		cout<<var<<endl;
		disp1();
	}
	~sub2()
	{
		cout<<"sub2 destr"<<endl;
	}
};
class sub3:public base
{
private:
	int num4;
public:
	sub3():base(6)
	{
		this->num4=num4;
		cout<<"sub3 param constr"<<endl;
	}
	void disp4()
	{
		cout<<num4<<endl;
		cout<<var<<endl;
	}
	~sub3()
	{
		cout<<"sub3 destr"<<endl;
	}
};
int main()
{
	sub1 s1;
	s1.disp2();
	sub2 s2(500);
	s2.disp3();
	sub3 s3;
	s3.disp1();
	s3.disp4();
	cout<<"Size of s1 is\t"<<sizeof(s1)<<endl;
	cout<<"Size of s2 is\t"<<sizeof(s2)<<endl;
	cout<<"Size of s3 is\t"<<sizeof(s3)<<endl;
	return 0;
}






