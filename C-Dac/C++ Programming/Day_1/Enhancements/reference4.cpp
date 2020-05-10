//Function call can be on left side if function returns a reference
#include<iostream>
using namespace std;
int val=100;
int main()
{
	int& getVal();
	cout<<"Before\t"<<val<<endl;
	getVal()=30;
	cout<<"After\t"<<val<<endl;
}
int& getVal()
{
	return val;
}