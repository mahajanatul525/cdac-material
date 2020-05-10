#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
void main()
{
	vector<bool> v;
	int i=0;
	
	for(i=0;i<10;i++)
	{
		if(i%2)
		{
			v.push_back(true);
		}
		else
		{
			v.push_back(false);
		}
	}
	for(i=0;i<v.size();i++)
	{
		cout<<endl<<v[i]<<endl;
	}
	i=count(v.begin(),v.end(),true);
	cout<<endl<<"there are \t"<<i<<"\t true\n";
}












