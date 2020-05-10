#include<iostream.h>

#define ADD_TWO(x,y) x += 2; y +=2

void main()
{
	bool flag = true;
	int j = 5, k = 7;
	
	if(!flag)
	ADD_TWO(j,k);
	
	/*
	if(!flag)
	{
	ADD_TWO(j,k);
	}
	*/

	cout<<j<<"\t"<<k<<endl;
}
