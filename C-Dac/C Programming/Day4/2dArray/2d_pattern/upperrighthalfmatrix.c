//upper 1/2 matrix

#include<stdio.h>
void main()
{int i,j;
	int a[][5]={	{1,2,3,4,5},
					{3,4,5,6,7},
					{8,9,0,1,2},
					{3,4,5,6,7},
					{8,9,0,1,2},
	
	
		};

	for(i=0;i<5;i++)
	{
	
		for(j=0;j<5;j++)
		{
		if(i<=j)
		printf("%d",a[i][j]);
		else
		printf(" ");
		
		}
	printf("\n");
	
	}



}