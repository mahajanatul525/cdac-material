/*123
  456
  789
change to
147
258
369
*/
#include<stdio.h>
void main()
{
	int arr[][3]={1,2,3,4,5,6,7,8,9};
	int arr2[3][3];
	int r,c;

	for (r=0;r<3;r++)
	{
	
		for (c=0;c<3;c++)
		{
		
	printf("%d",arr[r][c]);
		}
		printf("\n");
	}



for (r=0;r<3;r++)
	{
	
		for (c=0;c<3;c++)
		{
		arr2[r][c]=arr[c][r];
	printf("%d",arr2[r][c]);
		}
		printf("\n");
	}

}