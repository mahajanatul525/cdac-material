#include<fstream>
#include<iostream>
using namespace std;


/*
void main()
{
	ofstream out("d:\\demo.txt");
	if(!out)
	{
		cout<<endl<<"can not open\n";
		return;
	}
	char ch;
	while(true)
	{
		cin.get(ch);
		out.put(ch);
		if(ch=='\n')
		{
			break;
		}
	}
	out.close();
	ifstream in("d:\\demo.txt");
	int cnt=0;
	while(in.read(&ch,1))
	{
		cnt++;
	}
	cout<<endl<<"size is\t"<<cnt<<endl; 

}
*/

/*
void main()
{
	ofstream out("d:\\demo.txt",ios::binary);
	if(!out)
	{
		cout<<endl<<"can not open\n";
		return;
	}
	char ch;
	while(true)
	{
		cin.get(ch);
		out.put(ch);
		if(ch=='\n')
		{
			break;
		}
	}
	out.close();
	ifstream in("d:\\demo.txt",ios::binary);
	int cnt=0;
	while(in.read(&ch,1))
	{
		cnt++;
	}
	cout<<endl<<"size is\t"<<cnt<<endl; 

}
*/