#include<iostream.h>
#include "E:\myhead.h"
void main()
{
	sp1::myclass<int>m1(20);
	m1.disp();
	sp2::myclass<float,char*>m2(5.6f,"welcome");
	m2.disp();
}