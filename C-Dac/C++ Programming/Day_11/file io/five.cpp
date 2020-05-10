//Random Access File
#include<fstream>
#include<iostream>
using namespace std;
void main()
{
	fstream ff("d:\\fourth.txt",ios::in | ios::app);
	int i=65;
	char ch;
	for(i=65;i<100;i++)
	{
		ff.put((char)i);
	}
	
	ff.seekg(0,ios::beg); // moving get pointer
	while(ff.get(ch))
	{
		cout<<endl<<ch<<endl;
	}

	ff.close();
}
