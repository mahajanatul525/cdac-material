#include<iostream>
using namespace std;
int main()
{
	const int num=200;
	//int &ref=num; Error can not assign const int to non-const ref
	const int &ref1=num;
	cout<<endl<<num<<"\t"<<ref1<<endl;

	int num1=300;
	const int &ref2=num1; // possible
	cout<<endl<<num1<<"\t"<<ref2<<endl;
	//ref2=70; not possible
}