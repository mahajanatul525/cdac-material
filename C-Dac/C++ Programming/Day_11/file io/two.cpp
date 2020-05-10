#include<fstream>
#include<iostream>
#include<string.h>
using namespace std;
void main()
{
	char str[80];
	ofstream of("d:\\two.txt");
	cout<<endl<<"enter lines,press enter to stop\n";
	do
	{
		cin.getline(str,80);
		if(strlen(str)==0)
		{
			break;
		}
		of<<str<<endl;
	}while(true);
	of.close();
	ifstream iff("d:\\two.txt");
	char ptr[80];
	while(iff.getline(ptr,80))
	{
		cout<<endl<<ptr<<endl;
	}
	iff.close();
}



