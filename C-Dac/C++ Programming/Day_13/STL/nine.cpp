#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
void main()
{
	vector<int> v;
	unsigned int i=0;
	for(i=0;i<10;i++)
	{
		v.push_back(i);
	}
	for(i=0;i<v.size();i++)
	{
		cout<<v[i]<<endl;
	}
	reverse(v.begin(),v.end());
	cout<<endl<<"after reversing\n";
	for(i=0;i<v.size();i++)
	{
		cout<<v[i]<<endl;
	}
}



