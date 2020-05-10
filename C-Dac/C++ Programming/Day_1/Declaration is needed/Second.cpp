#include<iostream>
using namespace std;
int main()
{
	cout<<"hello"<<endl;
	disp(23.5); // it won't compile
	fun(); // it won't compile
}
int fun()
{
	cout<<"inside fun"<<endl;
	return 0;
}
int disp(char *ptr)
{
	cout<<*ptr<<endl;
	return 10;
}