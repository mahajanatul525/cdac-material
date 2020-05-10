#include<stdio.h>
void main()
{
int arr[5],m[5],i,n,flag=0,j=0;
printf("enter 5 numbers");
	for(i=0;i<5;i++)
	scanf("%d",&arr[i]);
    printf("enter no. to be searched");
  sacnf("%d",&n);

for(i=0;i<5;i++)
{	 if(n==arr[i])
	{ flag=1;
        m[j++]=i;
	}
}	
	if(flag==1)
	{printf("no found ")
		for(i=0;i<j;i++)
		 pf("position %d",m[i]);
	    }
	else
	printf("not found");
}


}