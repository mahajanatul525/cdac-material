#include<iostream>
#include<vector>
using namespace std;
void main()
{
	vector<char> v(10);
	int i;
	cout<<endl<<v.size()<<endl;
	for(i=0;i<10;i++)
	{
		v[i]=i+'a';
	}
	for(i=0;i<v.size();i++)
	{
		cout<<endl<<v[i]<<endl;
	}
	for(i=0;i<10;i++)
	{
		v.push_back(i+10+'a');
	}
	cout<<endl<<v.size()<<endl;
	for(i=0;i<v.size();i++)
	{
		cout<<v[i]<<endl;
	}
	for(i=0;i<v.size();i++)
	{
		v[i]=toupper(v[i]);
	}
	for(i=0;i<v.size();i++)
	{
		cout<<v[i]<<endl;
	}
}












