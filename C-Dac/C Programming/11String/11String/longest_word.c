/*#include<stdio.h>
#include<conio.h>
	char arr[]="I am chetan";

void main()
{
	int cnt=0,max=0,i=0,l,lw;
	//puts(arr);
	//gets(arr);
	//puts(arr);
	while(arr[i]!='\0')
	{
		printf("%c",arr[i]);
		cnt=0;
		l=i;
		while(arr[i]!=' '&&arr[i]!='\0')
		{ printf("%c",arr[i]);
			cnt++;
			i++;
		}
		printf("%d",cnt);
		if(cnt>max)
		{
			max=cnt;
			lw=l;
		}
		i++;
	}
	printf("%d",cnt);
	printf("%d",lw);
	for(i=lw;i<lw+max;i++)
		printf("%c",arr[i]);
	getch();
}*/
/*#include<stdio.h>
#include<conio.h>
void main()
{
	int i,j,m,c;
	char str[40];
	gets(str);
	puts(str);
	
	m=0;
	for(i=0;str[i]!='\0';i++)
	{
		c=0;
		for(j=i;str[j]!=' '&&str[j]!='\0';j++)
		{
			c++;

		 }
		printf("\nc=%d",c);
			if(m<c)
			{
				m=c;
			
		    }
		
			printf("\nm=%d",m);
			
        i=j-1;
	}
			

	
	printf("%d",m);
	//printf("%d",i);
	getch();
}*/