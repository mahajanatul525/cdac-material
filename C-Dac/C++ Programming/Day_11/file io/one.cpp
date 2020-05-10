#include<fstream>
#include<iostream>
using namespace std;
void main()
{
	char str[30];
	ofstream out("d:\\one.txt");
	if(!out)
	{
		cout<<endl<<"can not open\n";
		return;
	}
	out<<"helloworld";
	out.close();
	ifstream in("d:\\one.txt");
	if(!in)
	{
		cout<<endl<<"can not open\n";
		return;
	}
	in>>str;
	in.close();
	cout<<endl<<str<<endl;

}



