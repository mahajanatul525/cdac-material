//null terminated char arrays are not supported by c++ operators.
// string class is safe to handle as compared to null terminated
// char arrays
#include<string>
#include<iostream>
using namespace std;
void main()
{
	string str1("abc"),str2("xyz"),str3("lmn"),str4;
	str4=str1;
	for(unsigned int i=0;i<str1.size();i++)
	{
		cout<<str1.at(i)<<endl;
	}
	string::iterator p=str1.begin();
	while(p!=str1.end())
	{
		cout<<*p++<<endl;
	}
	string str5(str1+str2);
	p=str5.begin();
	while(p!=str5.end())
	{
		cout<<*p++<<endl;
	}

}







