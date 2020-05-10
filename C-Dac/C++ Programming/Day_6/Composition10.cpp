#include<iostream>
using namespace std;
class base
{
private:
	int num1;
	friend void fun();
};
class sub:public base
{
private:
	int num2;
};
void fun()
{
	base b;
	cout<<b.num1;
	sub s;
	cout<<s.num2; 
}
void main()
{
	fun();
}