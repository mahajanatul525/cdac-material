#include<iostream>
#include<fstream>
#include<conio.h>
#include<vector>
using namespace std;
void main()
{
	vector<char> charvect;
	vector<char>::iterator myiter;
	for(int i=0;i<10;i++)
	{
		charvect.push_back(65+i);
	}
	for(myiter=charvect.begin();myiter!=charvect.end();myiter++)
	{
		cout<<endl<<*myiter<<endl;
	}
    ofstream of("d:\\charvect.txt");
	of.write((char*)&charvect,sizeof(charvect));
	of.close();
	cout<<"now reading from file"<<endl;
	vector<char>temp;
	cout<<sizeof(charvect)<<endl;
	cout<<sizeof(temp)<<endl;
	ifstream iff("d:\\charvect.txt");
	iff.read((char*)&temp,sizeof(temp));

	iff.close();
	for(myiter=temp.begin();myiter!=temp.end();myiter++)
	{
		cout<<endl<<*myiter<<endl;
	}
	
	cout<<"done"<<endl;
	
}






