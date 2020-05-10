#include<iostream.h>
#include "e:\temp1\myheader.h"
#include "e:\temp1\myheader1.h"
void sp1::myclass:: disp()
{
	cout<<"in sp1 myclass disp"<<endl;
}
sp1::myclass::myclass()
{
	cout<<"sp1 myclass const"<<endl;
}
void sp2::myclass::disp()
{
	cout<<"in sp2 myclass disp"<<endl;
}
sp2::myclass::myclass()
{
	cout<<"in sp2 myclass const"<<endl;
}
