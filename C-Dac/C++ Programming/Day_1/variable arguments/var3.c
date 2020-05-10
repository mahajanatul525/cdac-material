#include<stdio.h>
#include<stdarg.h>
void main()
{
	void disp(char *,int,...);
	disp("%d%c%s%lf%u",5,10,'N',"harry",56.23,420);
}
void disp(char *type,int k,...)
{
	va_list ptr;
	int i;
	va_start(ptr,k);
	for(i=0;type[i]!='\0';i++)
	{
		switch(type[i])
		{
		case 'd': printf("%d\n",va_arg(ptr,int));
					break;
		case 'c': printf("%c\n",va_arg(ptr,char));
					break;
		case 's': puts(va_arg(ptr,char*));
					break;
		case 'l': i++;
					if(type[i]=='f')
					{
					 printf("%2.2lf\n",va_arg(ptr,double));
					}
					else
					{
						i--;
						va_arg(ptr,double);
					}
					break;
		case 'u': printf("%u\n",va_arg(ptr,unsigned int));
					break;
		}
	}
}







	

