#include<iostream>
#include<vector>
using namespace std;
void main()
{
	vector<int> myvect(10,5);
	vector<int>::iterator myiter;
	for(myiter=myvect.begin();myiter!=myvect.end();myiter++)
	{
		cout<<endl<<*myiter<<endl;
	}
}