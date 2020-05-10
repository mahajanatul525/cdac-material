#include<stdio.h>
#include<stdarg.h>
void main()
{
	void disp(int,...);
	disp(3,10,20,30);
	disp(5,10,20,30,40,50);
}
void disp(int k,...)
{
	va_list ptr;
	int i;
	va_start(ptr,k);
	for(i=0;i<k;i++)
	{
		printf("%d\n",va_arg(ptr,int));
	}
}
	