#include<iostream>
using namespace std;
class base
{
private:
		int num1;
public:
	void disp1()
	{
		cout<<num1<<endl;
	}
};
class sub:base
{
private:
	int num2;
public:
	void disp2()
	{
		disp1();
		cout<<num2<<endl;
	}
};

int main()
{
	sub s;
	s.disp2();
	
	return 0;
}
