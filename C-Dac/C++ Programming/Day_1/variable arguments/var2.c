#include<stdio.h>
#include<stdarg.h>
void main()
{
	void disp(int,int,...);
	disp(1,3,5,10,15);
	printf("\n");
	disp(2,5,'a','b','c','d','e');
	printf("\n");
	disp(3,4,4.8,5.2,6.4,7.1);
	printf("\n");
	disp(4,2,"Hello","Pointer");
}
void disp(int t,int k,...)
{
	int i;
	va_list ptr;
	va_start(ptr,k);
	switch(t)
	{
	case 1: for(i=0;i<k;i++)
			{
				printf("%d\n",va_arg(ptr,int));
			}
			break;
	case 2: for(i=0;i<k;i++)
			{
				printf("%c\n",va_arg(ptr,char));
			}
			break;
	case 3: for(i=0;i<k;i++)
			{
				printf("%2.1lf\n",va_arg(ptr,double));
			}
			break;
	case 4: for(i=0;i<k;i++)
			{
				puts(va_arg(ptr,char *));
			}
			break;
	default: puts("Invalid type number");
	}
}







